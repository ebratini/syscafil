/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Usuario;
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
public class UsuarioEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public UsuarioEntityManager() {
    }

    public UsuarioEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Usuario usuario) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(usuario);
        et.commit();
    }

    public List<Usuario> retrieve() {
        Query query = em.createNamedQuery("Usuario.findAll");
        return (List<Usuario>) query.getResultList();
    }

    public Usuario update(Usuario usuario) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        return em.merge(usuario);
    }

    public void delete(Usuario usuario) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(usuario);
        et.commit();
    }

    public Usuario getUsuarioById(Integer usrId) {
        Query q = em.createNamedQuery("Usuario.findByUsrId");
        q.setParameter("usrId", usrId);
        return (Usuario) q.getSingleResult();
    }

    public Usuario getUsuarioByLogin(String login) {
        Query q = em.createNamedQuery("Usuario.findByUsrLogin");
        q.setParameter("usrLogin", login);
        return (Usuario) q.getSingleResult();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
