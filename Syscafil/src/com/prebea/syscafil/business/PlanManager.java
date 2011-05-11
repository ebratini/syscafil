/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.JpaPlanDao;
import com.prebea.syscafil.model.PlanDao;
import com.prebea.syscafil.model.entities.Plan;
import java.util.List;
import java.util.Map;
import javax.persistence.NoResultException;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class PlanManager {

    private PlanDao pd = new JpaPlanDao();

    public PlanManager() {
    }

    public PlanManager(Map props) {
        pd = new JpaPlanDao(props);
    }

    public void crearPlan(Plan plan) {
        pd.persist(plan);
    }

    public List<Plan> getPlanes() {
        return (List<Plan>) pd.retrieve();
    }

    public Plan actualizarPlan(Plan plan) {
        return pd.update(plan);
    }

    public void removerPlan(Plan plan) {
        pd.remove(plan);
    }

    public Plan getPlanById(Integer id) {
        Plan plan = null;

        try {
            plan = pd.findById(id);
        } catch (NoResultException nre) {
        }
        return plan;
    }

    public Plan getPlanByNombre(String nombre) {
        Plan plan = null;

        try {
            plan = pd.findPlanByNombre(nombre);
        } catch (NoResultException nre) {
        }
        return plan;
    }

    public List<Plan> getPlanByStatus(char status) {
        return (List<Plan>) pd.findPlanByStatus(status);
    }

    public void close() {
        ((JpaPlanDao) pd).close();
    }
}
