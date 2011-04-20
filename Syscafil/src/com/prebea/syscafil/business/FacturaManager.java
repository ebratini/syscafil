/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.FacturaEntityManager;
import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class FacturaManager {
    private FacturaEntityManager fem =  new FacturaEntityManager();

    public FacturaManager() {
    }

    public FacturaManager(Map props) {
        fem = new FacturaEntityManager(props);
    }

    public void crearFactura(Factura factura) {
        fem.create(factura);
    }

    public List<Factura> getFacturas() {
        return fem.retrieve();
    }

    public void actualizarFactura(Factura factura) {
        fem.update(factura);
    }

    public void removerFactura(Factura factura) {
        fem.delete(factura);
    }

    public Factura getFacturaByFacNo(Integer facNo) {
        return fem.getFacturaByFacNo(facNo);
    }

    public List<Factura> getFacturaByAfiliado(Afiliado afiliado) {
        return fem.getFacturaByAfiliado(afiliado);
    }

    public List<Factura> getFacturasPendientes(Afiliado afiliado) {
        return fem.getFacturasPendientes(afiliado);
    }
}
