/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Secuencia;
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
public class SecuenciaEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public SecuenciaEntityManager() {
    }

    public SecuenciaEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Secuencia secuencia) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(secuencia);
        et.commit();
    }

    public List<Secuencia> retrieve() {
        Query query = em.createNamedQuery("Secuencia.findAll");
        return (List<Secuencia>) query.getResultList();
    }

    public Secuencia update(Secuencia secuencia) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(secuencia);
    }

    public void delete(Secuencia secuencia) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(secuencia);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
