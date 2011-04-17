/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Plan;
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
public class PlanEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public PlanEntityManager() {
    }

    public PlanEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Plan plan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(plan);
        et.commit();
    }

    public List<Plan> retrieve() {
        Query query = em.createNamedQuery("Plan.findAll");
        return (List<Plan>) query.getResultList();
    }

    public Plan update(Plan plan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(plan);
    }

    public void delete(Plan plan) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(plan);
        et.commit();
    }

    public Plan getPlanById(Integer plnId) {
        Query q = em.createNamedQuery("Plan.findByPlnId");
        q.setParameter("plnId", plnId);
        return (Plan) q.getSingleResult();
    }

    public List<Plan> getPlanByStatus(char status) {
        Query q = em.createNamedQuery("Plan.findByPlnStatus");
        q.setParameter("plnStatus", status);
        return (List<Plan>) q.getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
