/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Bitacora;
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
public class BitacoraEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public BitacoraEntityManager() {
    }

    public BitacoraEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Bitacora bitacora) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(bitacora);
        et.commit();
    }

    public List<Bitacora> retrieve() {
        Query query = em.createNamedQuery("Bitacora.findAll");
        return (List<Bitacora>) query.getResultList();
    }

    public Bitacora update(Bitacora bitacora) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(bitacora);
    }

    public void delete(Bitacora bitacora) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(bitacora);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
