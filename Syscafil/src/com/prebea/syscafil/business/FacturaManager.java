/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.FacturaDao;
import com.prebea.syscafil.model.JpaFacturaDao;
import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class FacturaManager {

    private FacturaDao fd = new JpaFacturaDao();

    public FacturaManager() {
    }

    public FacturaManager(Map props) {
        fd = new JpaFacturaDao(props);
    }

    public void crearFactura(Factura factura) {
        fd.persist(factura);
    }

    public List<Factura> getFacturas() {
        return (List<Factura>) fd.retrieve();
    }

    public Factura actualizarFactura(Factura factura) {
        return fd.update(factura);
    }

    public void removerFactura(Factura factura) {
        fd.remove(factura);
    }

    public Factura getFacturaByFacNo(Integer facNo) {
        return fd.findFacturaByFacNo(facNo);
    }

    public List<Factura> getFacturaByAfiliado(Afiliado afiliado) {
        return (List<Factura>) fd.findFacuturaByAfiliado(afiliado);
    }

    public List<Factura> getFacturasPendientes(Afiliado afiliado) {
        return (List<Factura>) fd.findFacturasPendientes(afiliado);
    }
}
