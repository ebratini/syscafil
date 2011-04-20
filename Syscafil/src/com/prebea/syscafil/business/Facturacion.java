/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import com.prebea.syscafil.model.entities.Usuario;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class Facturacion {
    private Date fechaFacturacion;
    private Date fechaLimitePago;

    // para medir el tiempo transcurrido para hacer el proceso de facturacion
    private Date fechaInicioProcesoFacturacion;
    private Date fechaFinalProcesoFacturacion;

    // otros datos
    private boolean terminarFacturacion = false;
    private int contadorFacturas;
    private int contadorAfiliados;
    private double totalFacturas;
    
    private FacturaManager fm = new FacturaManager();

    public Facturacion() {
    }

    public Facturacion(Map facManProps) {
        fm = new FacturaManager(facManProps);
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

        // crear factura por cada afiliado
        while ((afiliados != null && afiliados.size() > 0) && terminarFacturacion != true) {
            // iniciar facturacion
            for (Afiliado afil : afiliados) {
                fm.crearFactura(new Factura());
            }
            break;
        }
    }

    public void terminarProcesoFacturacion() {
        terminarFacturacion = true;
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

    public boolean isUsuarioValido(Usuario usuario) {
        boolean usrValido = false;
        if (usuario.getRol().getRolNombre().equalsIgnoreCase("admin")) {
            usrValido = true;
        }

        return usrValido;
    }

    public List<Afiliado> getAfiliadosFacturar() {
        // TODO: conseguir afiliados activos con menos de 3 facturas pendientes (depende de la logica
        // de negocio seleccionada al final)
        return null;
    }
}
