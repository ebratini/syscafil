/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Empresa;
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
public class EmpresaEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public EmpresaEntityManager() {
    }

    public EmpresaEntityManager(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        em = emf.createEntityManager();
    }

    public void persist(Object object) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(object);
        et.commit();
    }

    public void create(Empresa empresa) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(empresa);
        et.commit();
    }

    public List<Empresa> retrieve() {
        Query query = em.createNamedQuery("Empresa.findAll");
        return (List<Empresa>) query.getResultList();
    }

    public Empresa update(Empresa empresa) {
        Empresa emp = null;
        EntityTransaction et = em.getTransaction();
        et.begin();
        emp = em.merge(empresa);
        return emp;
    }

    public void delete(Empresa empresa) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(empresa);
        et.commit();
    }

    public Empresa getEmpresaById(Integer empId) {
        Query q = em.createNamedQuery("Empresa.findByEmpId");
        q.setParameter("empId", empId);
        return (Empresa) q.getSingleResult();
    }

    public Empresa getEmpresaByDNI(String dni) {
        Query q = em.createNamedQuery("Empresa.findByEmpDni");
        q.setParameter("empDni", dni);
        return (Empresa) q.getSingleResult();
    }

    public List<Empresa> getEmpresaByRazonSocial(String razonSocial) {
        Query q = em.createNamedQuery("Empresa.findByEmpRazonSocial");
        q.setParameter("empRazonSocial", razonSocial);
        return (List<Empresa>) q.getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
