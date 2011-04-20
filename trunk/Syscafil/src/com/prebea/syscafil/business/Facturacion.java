/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import com.prebea.syscafil.model.entities.Usuario;
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
    private Date fechaFinalProcesoFacturacion = new Date();;

    // otros datos
    private boolean terminarFacturacion = false;
    private int contadorFacturas;
    private int contadorAfiliados;
    private double totalFacturas;
    
    private FacturaManager fm = new FacturaManager();
    private AfiliadoManager am = new AfiliadoManager();

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

    // TODO: Este metodo creo que al final no tendra utilidad, por tanto no lo implementare
    public boolean isFechaFacturacionValida() {
        // conseguir la conf inicial de la app de algun xml o Property class
        return false;
    }

    private void setFechaLimitePago() {
        // estableciendo la fecha limite de pago
        Calendar c = Calendar.getInstance();
        c.setTime(fechaFacturacion);
        c.add(Calendar.DATE, 10);
        fechaLimitePago = c.getTime();
    }

    public void iniciarProcesoFacturacion(Usuario usuario) {
        // validar fecha de facturacion correcta
        // validar usuario inicia proceso de facturacion
        if (isUsuarioValido(usuario) != true) {
            System.out.println("Permiso denegado para iniciar proceso de facturacion.");
            return;
        }
        // conseguir los afiliados listos para facturacion
        List<Afiliado> afiliados = getAfiliadosFacturar();
        setFechaLimitePago();

        // crear factura por cada afiliado
        // si el afiliado con esta factura completa
        // la 3ra fac vencida actualizaar status a suspendido
        if (afiliados != null && afiliados.size() > 0) {
            for (Afiliado afil : afiliados) {
                if (terminarFacturacion != true) {
                    Factura factura = new Factura();
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

    public boolean isUsuarioValido(Usuario usuario) {
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
            }
        }
        return afiliados;
    }
}
