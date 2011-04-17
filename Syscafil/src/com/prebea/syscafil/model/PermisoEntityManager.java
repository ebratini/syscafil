/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Permiso;
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
public class PermisoEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public PermisoEntityManager() {
    }

    public PermisoEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Permiso permiso) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(permiso);
        et.commit();
    }

    public List<Permiso> retrieve() {
        Query query = em.createNamedQuery("Permiso.findAll");
        return (List<Permiso>) query.getResultList();
    }

    public Permiso update(Permiso permiso) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(permiso);
    }

    public void delete(Permiso permiso) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(permiso);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
