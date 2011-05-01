/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.lang.reflect.ParameterizedType;
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
public abstract class JpaDao implements Dao {

    protected Class entityClass;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    protected EntityManager entityManager = emf.createEntityManager();

    public JpaDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class) genericSuperclass.getActualTypeArguments()[1];
    }

    public JpaDao(Map properties) {
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        entityManager = emf.createEntityManager(properties);
    }

    public <E> void persist(E entity) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.persist(entity);
        et.commit();
    }
    
    public List retrieve(){
        Query q = entityManager.createQuery(String.format("SELECT e FROM %s e", entityClass.getSimpleName()));
        return q.getResultList();
    }

    public <E> E update(E entity) {
        E updated = null;
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        updated = (E) entityManager.merge(entity);
        et.commit();
        return updated;
    }

    public <E> void remove(E entity) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.remove(entity);
        et.commit();
    }

    public <E, K> E findById(K id) {
        return (E) entityManager.find(entityClass, id);
    }

    public void close() {
        emf.close();
        entityManager.close();
    }
}
