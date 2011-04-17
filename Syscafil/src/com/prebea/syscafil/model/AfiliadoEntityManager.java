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

    public Afiliado getAfiliadoById(Integer aflId) {
        Query q = em.createNamedQuery("Afiliado.findByAflId");
        q.setParameter("aflId", aflId);
        return (Afiliado) q.getSingleResult();
    }

    public Afiliado getAfiliadoByDNI(String dni) {
        Query q = em.createNamedQuery("Afiliado.findByAflDni");
        q.setParameter("aflDni", dni);
        return (Afiliado) q.getSingleResult();
    }

    public List<Afiliado> getAfiliadoByNombre(String nombre) {
        Query q = em.createNamedQuery("Afiliado.findByAflNombre");
        q.setParameter("aflNombre", nombre);
        return (List<Afiliado>) q.getResultList();
    }

    public List<Afiliado> getAfiliadoByApellido(String apellido) {
        Query q = em.createNamedQuery("Afiliado.findByAflApellido");
        q.setParameter("aflApellido", apellido);
        return (List<Afiliado>) q.getResultList();
    }

    public List<Afiliado> getAfiliadoByStatus(char status) {
        Query q = em.createNamedQuery("Afiliado.findByAflStatus");
        q.setParameter("aflStatus", status);
        return (List<Afiliado>) q.getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
