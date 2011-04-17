/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.SubcategoriaPlan;
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
public class SubcategoriaPlanEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public SubcategoriaPlanEntityManager() {
    }

    public SubcategoriaPlanEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(SubcategoriaPlan subcategoriaPlan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(subcategoriaPlan);
        et.commit();
    }

    public List<SubcategoriaPlan> retrieve() {
        Query query = em.createNamedQuery("SubcategoriaPlan.findAll");
        return (List<SubcategoriaPlan>) query.getResultList();
    }

    public SubcategoriaPlan update(SubcategoriaPlan subcategoriaPlan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(subcategoriaPlan);
    }

    public void delete(SubcategoriaPlan subcategoriaPlan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(subcategoriaPlan);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
