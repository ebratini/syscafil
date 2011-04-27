/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Dependiente;
import com.prebea.syscafil.model.entities.Empresa;
import com.prebea.syscafil.model.entities.Factura;
import com.prebea.syscafil.model.entities.Usuario;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import syscafil.Syscafil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class Facturacion {
    // toda esta informacion es guardarla en una tabla > Facturaciones y relacionarla con Facturas

    private Date fechaFacturacion = new Date();
    private Date fechaLimitePago = new Date();
    // para medir el tiempo transcurrido para hacer el proceso de facturacion
    private Date fechaInicioProcesoFacturacion = new Date();
    private Date fechaFinalProcesoFacturacion = new Date();

    ;
    // otros datos
    private boolean terminarFacturacion = false;
    private int contadorFacturas;
    private int contadorAfiliados;
    private double totalFacturas;
    private FacturaManager fm = new FacturaManager();
    private AfiliadoManager am = new AfiliadoManager();
    private DependienteManager dm = new DependienteManager();

    public Facturacion() {
    }

    public Facturacion(Map facManProps) {
        fm = new FacturaManager(facManProps);
    }

    public int getContadorAfiliados() {
        return contadorAfiliados;
    }

    public int getContadorFacturas() {
        return contadorFacturas;
    }

    public Date getFechaFinalFacturacion() {
        return fechaFinalProcesoFacturacion;
    }

    public Date getFechaInicioFacturacion() {
        return fechaInicioProcesoFacturacion;
    }

    public double getTotalFacturas() {
        return totalFacturas;
    }

    // validando fecha de facturacion con la fecha establecida para facturar
    // validando fecha contra ultima fecha de facturacion
    private boolean isFechaFacturacionValida() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaFacturacion);
        int diaFac = cal.get(Calendar.DAY_OF_MONTH);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(cal.getTime());
        cal2.add(Calendar.DAY_OF_MONTH, 30);

        long diffDays = (cal.getTimeInMillis() - cal2.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        if (diaFac == Integer.parseInt(Syscafil.getDiaFacturacion()) && diffDays >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void setFechaLimitePago() {
        // estableciendo la fecha limite de pago
        Calendar c = Calendar.getInstance();
        c.setTime(fechaFacturacion);
        c.add(Calendar.DATE, 10);
        fechaLimitePago = c.getTime();
    }

    public void iniciarProcesoFacturacion(Usuario usuario) throws ProcesoFacturacionException {
        // validar fecha de facturacion correcta
        // validar usuario inicia proceso de facturacion
        if (isUsuarioValido(usuario) != true) {
            String mensajeExcepcion = "Permiso denegado para iniciar proceso de facturacion.";
            throw new UsuarioNoValidoInvocaProcesoFacturacionException(mensajeExcepcion);
        }

        if (isFechaFacturacionValida() != true) {
            String mensajeExcepcion = "La fecha de facturacion no es valida.";
            throw new FechaNoValidaParaFacturacionException(mensajeExcepcion);
        }

        // conseguir los afiliados listos para facturacion
        List<Afiliado> afiliados = getAfiliadosFacturar();
        setFechaLimitePago();

        // crear factura por cada afiliado

        if (afiliados != null && afiliados.size() > 0) {
            for (Afiliado afil : afiliados) {
                // conseguir total de los dependientes extras si existen
                String nombrePlan = afil.getPlan().getPlnNombre();
                double precioPlan = Syscafil.PrecioPlanes.valueOf(nombrePlan.replaceAll(" ", "")).getPrecio();
                double precioDepExtra = Syscafil.PrecioPlanesDependientesExtreas.valueOf(nombrePlan.replaceAll(" ", "")).getPrecio();
                int cantDepExtra = 0;
                double importeDepExtras = 0.0;
                double desc = 0.0;
                double impuestos = 0.0;
                double subtotal = precioPlan + importeDepExtras;
                double total = subtotal + impuestos - desc;
                String metodoPago = "Efectivo";
                String statusFac = "PP";
                String razonStatusFac = "Pendiente Pago";
                String updateBy = "Proceso Facturacion";

                // conseguir cargoA
                Empresa empresaAfil = null;
                try {
                    empresaAfil = am.getEmpresa(afil);
                } catch (AfiliadoConMasDeUnaEmpresaException ex) {
                    Logger.getLogger(Facturacion.class.getName()).log(Level.SEVERE, null, ex);
                }

                String cargoA = (empresaAfil != null ? String.format("[%d %s]", empresaAfil.getEmpId(), empresaAfil.getEmpRazonSocial()) : "");

                // Descripcion
                StringBuilder sbFacDescripcion = new StringBuilder();
                sbFacDescripcion.append(String.format("Cantidad: %d Concepto: Renta Mensual %s Valor: %d\n", 1, nombrePlan, precioPlan));

                List<Dependiente> depExtras = dm.getDependienteActivosExtrasByAfiliado(afil);
                if (depExtras != null && depExtras.size() > 0) {
                    cantDepExtra = depExtras.size();
                    importeDepExtras = getTotalPorDepExtra(afil, precioDepExtra);
                    sbFacDescripcion.append(String.format("Cantidad: %d Concepto: Renta Mensual por Dependientes Extras Valor: %d X %d = %d\n", cantDepExtra,
                            cantDepExtra, precioDepExtra, (cantDepExtra * precioDepExtra)));
                }

                if (terminarFacturacion != true) {
                    Factura factura = new Factura(fechaFacturacion, fechaLimitePago, BigDecimal.valueOf(precioPlan), BigDecimal.valueOf(precioDepExtra),
                            sbFacDescripcion.toString(), BigDecimal.valueOf(desc), BigDecimal.valueOf(impuestos), BigDecimal.valueOf(subtotal),
                            BigDecimal.valueOf(total), cargoA, metodoPago, statusFac, razonStatusFac, updateBy, fechaFacturacion);
                    fm.crearFactura(factura);
                    contadorFacturas++;
                    contadorAfiliados++;
                    totalFacturas += factura.getFacImporteTotal().doubleValue();
                } else {
                    System.out.println("Proceso de facturacion abortado.");
                    break;
                }
            }
        }
        fechaFinalProcesoFacturacion = new Date();
        
    }

    public void terminarProcesoFacturacion() {
        terminarFacturacion = true;
    }

    public Date getTiempoFacturacion() {
        return new Date((fechaInicioProcesoFacturacion.getTime() - fechaFinalProcesoFacturacion.getTime()));
    }

    private void setUltimaFechaFacturacion() {
        Calendar c = Calendar.getInstance();
        c.setTime(fechaFacturacion);
        int iDia = c.get(Calendar.DAY_OF_MONTH);
        int iMes = c.get(Calendar.MONTH);
        int iAnio = c.get(Calendar.YEAR);

        String dia = iDia < 9 ? String.format("0%d", iDia) : Integer.toString(iDia);
        String mes = iMes < 9 ? String.format("0%d", iMes) : Integer.toString(iMes);
        String anio = Integer.toString(iAnio);

        Syscafil.setUltimaFechaFacturacion(String.format("%s-%s-%s", dia, mes, anio));
    }

    private double getTotalPorDepExtra(Afiliado afiliado, double precioDepExtra) {
        List<Dependiente> dependientesExtras = dm.getDependienteActivosExtrasByAfiliado(afiliado);
        double valorDepExtras = 0.0;

        if (dependientesExtras != null && dependientesExtras.size() > 0) {
            valorDepExtras = dependientesExtras.size() * precioDepExtra;
        }

        return valorDepExtras;
    }

    private boolean isUsuarioValido(Usuario usuario) {
        boolean usrValido = false;
        if (usuario.getRol().getRolNombre().equalsIgnoreCase("admin")) {
            usrValido = true;
        }

        return usrValido;
    }

    public List<Afiliado> getAfiliadosFacturar() {
        List<Afiliado> afiliados = new ArrayList<Afiliado>();
        List<Factura> facturasPendientes = new ArrayList<Factura>();

        for (Afiliado afil : am.getAfiliadosActivos()) {
            facturasPendientes = fm.getFacturasPendientes(afil);
            if (facturasPendientes == null || (facturasPendientes != null && facturasPendientes.size() < 3)) {
                afiliados.add(afil);

                /* si el afiliado con esta factura completa
                la 3ra fac vencida actualizaar status a suspendido
                 */
                if (facturasPendientes.size() == 2) {
                    afil.setAflStatus('S');
                    am.actualizarAfiliado(afil);
                }
            }
        }
        return afiliados;
    }
}
