/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaPlanDao extends JpaDao implements PlanDao {

    public JpaPlanDao() {
    }

    public JpaPlanDao(Map props) {
        super(props);
    }

    @Override
    public List findPlanByStatus(char status) {
        Query q = entityManager.createNamedQuery("Plan.findByPlnStatus");
        q.setParameter("plnStatus", status);
        return q.getResultList();
    }
}
