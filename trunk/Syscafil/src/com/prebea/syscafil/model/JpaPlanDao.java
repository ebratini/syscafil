/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.CategoriaPlan;
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

    @Override
    public Plan findPlanByNombre(String nombrePlan) {
        Query q = entityManager.createNamedQuery("Plan.findByPlnNombre");
        q.setParameter("plnNombre", nombrePlan);
        return (Plan) q.getSingleResult();
    }

    @Override
    public List<Plan> findPlanByCategoria(CategoriaPlan categoriaPlan) {
        Query q = entityManager.createQuery("SELECT p FROM Plan p WHERE p.categoriaPlan = :categoriaPlan");
        q.setParameter("categoriaPlan", categoriaPlan);
        return q.getResultList();
    }
}
