/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Dependiente;
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
public class DependienteEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public DependienteEntityManager() {
    }

    public DependienteEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Dependiente dependiente) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(dependiente);
        et.commit();
    }

    public List<Dependiente> retrieve() {
        Query query = em.createNamedQuery("Dependiente.findAll");
        return (List<Dependiente>) query.getResultList();
    }

    public Dependiente update(Dependiente dependiente) {
        Dependiente dep = null;
        EntityTransaction et = em.getTransaction();
        et.begin();
        dep = em.merge(dependiente);
        return dep;
    }

    public void delete(Dependiente dependiente) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(dependiente);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
