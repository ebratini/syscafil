/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaSyscafil extends JpaDao {

    public JpaSyscafil() {
    }

    /*public JpaSyscafil(Map props) {
        super(props);
    }*/

    public <T> T executeQuery(String query, HashMap<String, String> params) {
        Query q = entityManager.createQuery(query);

        for (Map.Entry<String, String> entry : params.entrySet()) {
            q.setParameter(entry.getKey(), entry.getValue());
        }
        return (T) q.getResultList();
    }

    public void executeNonQuery(String query) {
        Query q = entityManager.createQuery(query);
        q.executeUpdate();
    }
}
