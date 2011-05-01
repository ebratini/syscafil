/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaFacturaDao extends JpaDao implements FacturaDao {

    public JpaFacturaDao() {
    }

    public JpaFacturaDao(Map props) {
        super(props);
    }

    @Override
    public Factura findFacturaByFacNo(Integer facNo) {
        return findById(facNo);
    }

    @Override
    public List findFacuturaByAfiliado(Afiliado afiliado) {
        Query q = entityManager.createQuery("SELECT f FROM Factura f WHERE f.afiliado = :afiliado");
        q.setParameter("afiliado", afiliado);
        return (List<Factura>) q.getResultList();
    }

    @Override
    public List findFacturasPendientes(Afiliado afiliado) {
        Query q = entityManager.createQuery("SELECT f FROM Factura f WHERE f.afiliado = :afiliado AND f.facStatusFactura = 'pp'");
        q.setParameter("afiliado", afiliado);
        return (List<Factura>) q.getResultList();
    }
}
