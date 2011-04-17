/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.CategoriaPlan;
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
public class CategoriaPlanEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public CategoriaPlanEntityManager() {
    }

    public CategoriaPlanEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(CategoriaPlan categoriaPlan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(categoriaPlan);
        et.commit();
    }

    public List<CategoriaPlan> retrieve() {
        Query query = em.createNamedQuery("CategoriaPlan.findAll");
        return (List<CategoriaPlan>) query.getResultList();
    }

    public CategoriaPlan update(CategoriaPlan categoriaPlan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(categoriaPlan);
    }

    public void delete(CategoriaPlan categoriaPlan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(categoriaPlan);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
