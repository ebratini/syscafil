/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

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
public abstract class JpaDao implements Dao{

    protected Class entityClass;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    protected EntityManager entityManager = emf.createEntityManager();

    // TODO: resolver problemas con el ParameterizedType
    public JpaDao() {
        //ParameterizedType genericSuperclass = ((ParameterizedType) getClass().getGenericSuperclass());
        //this.entityClass = (Class) genericSuperclass.getActualTypeArguments()[0];
    }

    public JpaDao(Class entityClass, Map properties) {
        this(entityClass);
        emf = Persistence.createEntityManagerFactory("SyscafilPU", properties);
        entityManager = emf.createEntityManager(properties);
    }

    public JpaDao(Class entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public <Serializable> void persist(Serializable entity) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.persist(entity);
        et.commit();
    }
    
    @Override
    public List retrieve(){
        Query q = entityManager.createQuery(String.format("SELECT e FROM %s e", entityClass.getSimpleName()));
        return q.getResultList();
    }

    @Override
    public <Serializable> Serializable update(Serializable entity) {
        Serializable updated = null;
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        updated = (Serializable) entityManager.merge(entity);
        et.commit();
        return updated;
    }

    @Override
    public <Serializable> void remove(Serializable entity) {
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.remove(entity);
        et.commit();
    }

    @Override
    public <Serializable, Object> Serializable findById(Object id) {
        return (Serializable) entityManager.find(entityClass, id);
    }

    public void close() {
        emf.close();
        entityManager.close();
    }
}
