/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class SyscafilEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyscafilPU");
    private EntityManager em = emf.createEntityManager();

    public SyscafilEntityManager() {
    }

    public SyscafilEntityManager(Map props) {
        em = emf.createEntityManager(props);
    }

    public <T> T executeQuery(String query, HashMap<String, String> params) {
        Query q = em.createQuery(query);

        for (Map.Entry<String, String> entry : params.entrySet()) {
            q.setParameter(entry.getKey(), entry.getValue());
        }
        return (T) q.getResultList();
    }

    public void executeNonQuery(String query) {
        Query q = em.createQuery(query);
        q.executeUpdate();
    }
}
