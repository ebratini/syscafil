/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Usuario;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class Facturacion {
    private Date fechaInicioFacturacion;
    private Date fechaFinalFacturacion;
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

    public void iniciarProcesoFacturacion() {
        // validar fecha de facturacion correcta
        // validar usuario inicia proceso de facturacion (que el usuario tenga los privilegios correctos para iniciar el proceso de facs)
        // conseguir los afiliados activos
        // crear factura por cada afiliado
        while(terminarFacturacion != true) {
            // iniciar facturacion
            // ultimo afiliado natural dar un break
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
        return fechaFinalFacturacion;
    }

    public Date getFechaInicioFacturacion() {
        return fechaInicioFacturacion;
    }

    public double getTotalFacturas() {
        return totalFacturas;
    }

    public boolean isFechaFacturacionValida() {
        // conseguir la conf inicial de la app de algun xml o Property class
        return false;
    }

    public boolean isUsuarioValido(Usuario usuario) {
        // validar rol del usuario
        return false;
    }

    public List<Afiliado> getAfiliadosFacturar() {
        // conseguir afiliados activos con menos de 3 facturas pendientes (depende de la logica
        // de negocio seleccionada al final)
        return null;
    }
}
