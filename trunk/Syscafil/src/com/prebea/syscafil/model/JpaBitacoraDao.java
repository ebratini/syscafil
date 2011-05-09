/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Bitacora;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaBitacoraDao extends JpaDao implements BitacoraDao {

    public JpaBitacoraDao() {
        super(Bitacora.class);
    }

    public JpaBitacoraDao(Map props) {
        super(Bitacora.class, props);
    }

    @Override
    public List findBitacoraByFecha(Date fecha) {
        Query q = entityManager.createNamedQuery("Bitacora.findByBitFecha");
        q.setParameter("bitFecha", fecha);
        return q.getResultList();
    }

    @Override
    public List findBitacoraByFuente(String fuente) {
        Query q = entityManager.createNamedQuery("Bitacora.findByBitFuente");
        q.setParameter("bitFuente", fuente);
        return q.getResultList();
    }

    @Override
    public List findBitacoraByCategoria(String categoria) {
        Query q = entityManager.createNamedQuery("Bitacora.findByBitCategoria");
        q.setParameter("bitCategoria", categoria);
        return q.getResultList();
    }
}
