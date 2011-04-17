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
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(dependiente);
    }

    public void delete(Dependiente dependiente) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(dependiente);
        et.commit();
    }

    public Dependiente getDependienteById(Integer depId) {
        Query q = em.createNamedQuery("Dependiente.findByDepId");
        q.setParameter("depId", depId);
        return (Dependiente) q.getSingleResult();
    }

    public Dependiente getDependienteByDNI(String dni) {
        Query q = em.createNamedQuery("Dependiente.findByDepDni");
        q.setParameter("depDni", dni);
        return (Dependiente) q.getSingleResult();
    }

    public List<Dependiente> getDependienteByNombre(String nombre) {
        Query q = em.createNamedQuery("Dependiente.findByDepNombre");
        q.setParameter("depNombre", nombre);
        return (List<Dependiente>) q.getResultList();
    }

    public List<Dependiente> getDependienteByApellido(String apellido) {
        Query q = em.createNamedQuery("Dependiente.findByDepApellido");
        q.setParameter("depApellido", apellido);
        return (List<Dependiente>) q.getResultList();
    }

    public List<Dependiente> getDependienteByStatus(char status) {
        Query q = em.createNamedQuery("Dependiente.findByDepStatus");
        q.setParameter("depStatus", status);
        return (List<Dependiente>) q.getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
