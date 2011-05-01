/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Facturacion;
import java.util.Date;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaFacturacionDao extends JpaDao implements FacturacionDao {

    public JpaFacturacionDao() {
    }

    public JpaFacturacionDao(Map props) {
        super(props);
    }

    @Override
    public Facturacion findFacturacionByFechaFacturacion(Date fechaFacturacion) {
        Query q = entityManager.createNamedQuery("Facturacion.findByFcnFechaFacturacion");
        q.setParameter("fcnFechaFacturacion", fechaFacturacion);
        return (Facturacion) q.getSingleResult();
    }

    @Override
    public Date findUltimaFechaFacturacionGenerada() {
        String query = "SELECT MAX(fcn.fcn_fecha_facturacion) FROM Facturacion fcn";
        Query q = entityManager.createQuery(query);
        return (Date) q.getSingleResult();
    }
}
