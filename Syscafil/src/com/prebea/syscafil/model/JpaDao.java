/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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

    public <E> void persist(E entity) {
        entityManager.persist(entity);
    }

    public <E> List<E> retrieve(){
        Query q = entityManager.createQuery(String.format("SELECT e FROM %s e", entityClass.getSimpleName()));
        return (List<E>) q.getResultList();
    }

    public <E> E update(E entity) {
        return (E) entityManager.merge(entity);
    }

    public <E> void remove(E entity) {
        entityManager.remove(entity);
    }

    public <E, K> E findById(K id) {
        return (E) entityManager.find(entityClass, id);
    }

    public void close() {
        emf.close();
        entityManager.close();
    }
}
