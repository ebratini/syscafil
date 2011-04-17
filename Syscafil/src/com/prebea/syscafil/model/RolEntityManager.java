/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Rol;
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
public class RolEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public RolEntityManager() {
    }

    public RolEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Rol rol) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(rol);
        et.commit();
    }

    public List<Rol> retrieve() {
        Query query = em.createNamedQuery("Rol.findAll");
        return (List<Rol>) query.getResultList();
    }

    public Rol update(Rol rol) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(rol);
    }

    public void delete(Rol rol) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(rol);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
