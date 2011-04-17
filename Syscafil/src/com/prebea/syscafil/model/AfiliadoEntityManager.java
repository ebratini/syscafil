/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
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
public class AfiliadoEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public AfiliadoEntityManager() {
    }

    public AfiliadoEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Afiliado afiliado) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(afiliado);
        et.commit();
    }

    public List<Afiliado> retrieve() {
        Query query = em.createNamedQuery("Afiliado.findAll");
        return (List<Afiliado>) query.getResultList();
    }

    public Afiliado update(Afiliado afiliado) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(afiliado);
    }

    public void delete(Afiliado afiliado) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(afiliado);
        et.commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
