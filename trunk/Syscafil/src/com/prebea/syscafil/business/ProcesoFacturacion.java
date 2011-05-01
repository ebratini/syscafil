/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Dependiente;
import com.prebea.syscafil.model.entities.Empresa;
import com.prebea.syscafil.model.entities.Factura;
import com.prebea.syscafil.model.entities.Facturacion;
import com.prebea.syscafil.model.entities.Plan;
import com.prebea.syscafil.model.entities.Usuario;
import java.math.BigDecimal;
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
public class ProcesoFacturacion {
    
    private Date fechaFacturacion = new Date();
    private Date fechaLimitePago = new Date();
    private int totalFacturas;
    private int totalAfiliados;
    private double totalImporteFacturas;
    private StringBuilder statusFacturacion;
    // para medir el tiempo transcurrido para hacer el proceso de facturacion
    private Date fechaInicioProcesoFacturacion = new Date();
    private Date fechaFinalProcesoFacturacion = new Date();
    // para manejar proceso
    private boolean terminarFacturacion = false;
    // resources
    private FacturacionManager fcnMan = new FacturacionManager();
    private UsuarioManager um = new UsuarioManager();
    private FacturaManager fm = new FacturaManager();
    private AfiliadoManager am = new AfiliadoManager();
    private DependienteManager dm = new DependienteManager();

    public ProcesoFacturacion() {
    }

    public ProcesoFacturacion(Map facManProps) {
        fcnMan = new FacturacionManager(facManProps);
        um = new UsuarioManager(facManProps);
        fm = new FacturaManager(facManProps);
        am = new AfiliadoManager(facManProps);
        dm = new DependienteManager(facManProps);
    }
    
    public Date getFechaFinalFacturacion() {
        return fechaFinalProcesoFacturacion;
    }

    public Date getFechaInicioFacturacion() {
        return fechaInicioProcesoFacturacion;
    }

    public int getTotalFacturas() {
        return totalFacturas;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public Date getFechaFinalProcesoFacturacion() {
        return fechaFinalProcesoFacturacion;
    }

    public Date getFechaInicioProcesoFacturacion() {
        return fechaInicioProcesoFacturacion;
    }

    public Date getFechaLimitePago() {
        return fechaLimitePago;
    }

    public StringBuilder getStatusFacturacion() {
        return statusFacturacion;
    }

    public int getTotalAfiliados() {
        return totalAfiliados;
    }

    public double getTotalImporteFacturas() {
        return totalImporteFacturas;
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

        long diffDays = (cal2.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        if (diaFac == Integer.parseInt(Syscafil.scm.getDiaFacturacion()) && diffDays >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void setFechaLimitePago() {
        // estableciendo la fecha limite de pago
        Calendar c = Calendar.getInstance();
        c.setTime(fechaFacturacion);
        c.add(Calendar.DATE, Syscafil.scm.getDiasLmtParaSaldar());
        fechaLimitePago = c.getTime();
    }

    public void iniciarProcesoFacturacion(Usuario usuario) throws ProcesoFacturacionException {
        Syscafil.sl.logBitacora(new Date(), usuario.getUsrId(), "ProcesoFacturacion", "Informacion", "Se ha iniciado el proceso de facturacion");
        // validar fecha de facturacion correcta
        // validar usuario inicia proceso de facturacion
        if (isUsuarioValido(usuario) != true) {
            String mensajeExcepcion = "Permiso denegado para iniciar proceso de facturacion.";
            Syscafil.sl.logBitacora(new Date(), usuario.getUsrId(), "ProcesoFacturacion", "Excepcion", mensajeExcepcion);
            throw new UsuarioNoValidoInvocaProcesoFacturacionException(mensajeExcepcion);
        }

        if (isFechaFacturacionValida() != true) {
            String mensajeExcepcion = "La fecha de facturacion no es valida.";
            Syscafil.sl.logBitacora(new Date(), usuario.getUsrId(), "ProcesoFacturacion", "Excepcion", mensajeExcepcion);
            throw new FechaNoValidaParaFacturacionException(mensajeExcepcion);
        }

        // conseguir los afiliados listos para facturacion
        List<Afiliado> afiliados = getAfiliadosFacturar();
        setFechaLimitePago();

        // crear factura por cada afiliado
        if (afiliados != null && afiliados.size() > 0) {
            for (Afiliado afil : afiliados) {
                Plan plan = afil.getPlan();
                BigDecimal precioPlan = plan.getPlnPrecio();
                BigDecimal precioDepExtra = plan.getPlnPrecioDependienteExtra();
                int cantDepExtra = 0;
                BigDecimal importeDepExtras = new BigDecimal(0.0);
                BigDecimal desc = new BigDecimal(0.0);
                BigDecimal impuestos = new BigDecimal(0.0);
                BigDecimal subtotal = precioPlan.add(importeDepExtras);
                BigDecimal total = subtotal.add(impuestos).subtract(desc);
                String metodoPago = "Efectivo";
                String statusFac = "PP";
                String razonStatusFac = "Pendiente Pago";
                String updateBy = "Proceso Facturacion";

                // conseguir cargoA
                Empresa empresaAfil = afil.getEmpresa();
                String cargoA = (empresaAfil != null ? String.format("[%d %s]", empresaAfil.getEmpId(), empresaAfil.getEmpRazonSocial())
                        : afil.getAflApellido() + ", " + afil.getAflNombre());

                // Descripcion
                StringBuilder sbFacDescripcion = new StringBuilder();
                sbFacDescripcion.append(String.format("Cantidad: %d Concepto: Renta Mensual %s Valor: %d\n", 1, plan.getPlnNombre(), precioPlan));

                // conseguir total de los dependientes extras si existen
                List<Dependiente> depExtras = dm.getDependienteActivosExtrasByAfiliado(afil);
                if (depExtras != null && depExtras.size() > 0) {
                    cantDepExtra = depExtras.size();
                    importeDepExtras = BigDecimal.valueOf(getTotalPorDepExtra(afil));
                    sbFacDescripcion.append(String.format("Cantidad: %1$d Concepto: Renta Mensual por Dependientes Extras Valor: %1d X %2$f = %3$f\n", cantDepExtra,
                            precioDepExtra.doubleValue(), precioDepExtra.multiply(precioDepExtra).doubleValue()));
                }

                if (terminarFacturacion != true) {
                    Factura factura = new Factura(fechaFacturacion, fechaLimitePago, precioPlan, precioDepExtra, sbFacDescripcion.toString(),
                            desc, impuestos, subtotal, total, cargoA, metodoPago, statusFac, razonStatusFac, updateBy, fechaFacturacion);
                    fm.crearFactura(factura);
                    totalFacturas++;
                    totalAfiliados++;
                    totalImporteFacturas += factura.getFacImporteTotal().doubleValue();
                } else {
                    String msj = "Proceso de facturacion abortado.";
                    Syscafil.sl.logBitacora(new Date(), usuario.getUsrId(), "ProcesoFacturacion", "Informacion", msj);
                    statusFacturacion.append(msj).append("\n");
                    break;
                }
            }
        }
        fechaFinalProcesoFacturacion = new Date();
        fcnMan.agregarFacturacion(new Facturacion(fechaFacturacion, Syscafil.scm.getDiasLmtParaSaldar(), fechaLimitePago,
                totalAfiliados, totalFacturas, BigDecimal.valueOf(totalImporteFacturas), statusFacturacion.toString()));
        Syscafil.sl.logBitacora(new Date(), usuario.getUsrId(), "ProcesoFacturacion", "Informacion", "Proceso de facturacion completado");
    }

    public void terminarProcesoFacturacion() {
        terminarFacturacion = true;
    }

    public Date getTiempoFacturacion() {
        return new Date((fechaInicioProcesoFacturacion.getTime() - fechaFinalProcesoFacturacion.getTime()));
    }
    
    private double getTotalPorDepExtra(Afiliado afiliado) {
        List<Dependiente> dependientesExtras = dm.getDependienteActivosExtrasByAfiliado(afiliado);
        double valorDepExtras = 0.0;

        if (dependientesExtras != null && dependientesExtras.size() > 0) {
            valorDepExtras = dependientesExtras.size() * afiliado.getPlan().getPlnPrecioDependienteExtra().doubleValue();
        }

        return valorDepExtras;
    }

    private boolean isUsuarioValido(Usuario usuario) {
        boolean usrValido = false;

        List<String> privilegios = um.getPrivilegios(usuario);
        if (privilegios.contains("ipf")) {
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
