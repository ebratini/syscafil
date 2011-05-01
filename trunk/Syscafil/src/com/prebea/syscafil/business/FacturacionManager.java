/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.FacturacionDao;
import com.prebea.syscafil.model.JpaFacturacionDao;
import com.prebea.syscafil.model.entities.Facturacion;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class FacturacionManager {
    
    private FacturacionDao fd = new JpaFacturacionDao();

    public FacturacionManager() {
    }

    public FacturacionManager(Map props) {
        fd = new JpaFacturacionDao(props);
    }

    public void agregarFacturacion(Facturacion facturacion) {
        fd.persist(facturacion);
    }

    public List<Facturacion> getFacturaciones() {
        return (List<Facturacion> ) fd.retrieve();
    }

    public Facturacion actualizarFacturacion(Facturacion facturacion)  {
        return fd.update(facturacion);
    }

    public void removerFacturacion(Facturacion facturacion) {
        fd.remove(facturacion);
    }

    public Facturacion getFacturacionById(Integer id) {
        return fd.findById(id);
    }

    public Date getUltimaFechaFacturacion() {
        return fd.findUltimaFechaFacturacionGenerada();
    }

    public void close() {
        ((JpaFacturacionDao) fd).close();
    }
}
