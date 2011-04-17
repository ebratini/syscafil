/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class FacturaEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public FacturaEntityManager() {
    }

    public FacturaEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Factura factura) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(factura);
        et.commit();
    }

    public List<Factura> retrieve() {
        Query query = em.createNamedQuery("Factura.findAll");
        return (List<Factura>) query.getResultList();
    }

    public Factura update(Factura factura) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(factura);
    }

    public void delete(Factura factura) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(factura);
        et.commit();
    }

    public Factura getFacturaByFacNo(Integer facNo) {
        Query q = em.createNamedQuery("Factura.findByFacNo");
        q.setParameter("facNo", facNo);
        return (Factura) q.getSingleResult();
    }

    public List<Factura> getFacturaByAfiliado(Afiliado afiliado) {
        Query q = em.createQuery("SELECT f FROM Factura f WHERE f.afiliado = :afiliado");
        q.setParameter("afiliado", afiliado);
        return (List<Factura>) q.getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
