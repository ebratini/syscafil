/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Plan;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaPlanDao extends JpaDao implements PlanDao {

    public JpaPlanDao() {
        super(Plan.class);
    }

    public JpaPlanDao(Map props) {
        super(Plan.class, props);
    }

    @Override
    public List findPlanByStatus(char status) {
        Query q = entityManager.createNamedQuery("Plan.findByPlnStatus");
        q.setParameter("plnStatus", status);
        return q.getResultList();
    }
}
