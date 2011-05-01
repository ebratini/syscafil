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

    public void agregarPlan(Plan plan) {
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
        return pd.findById(id);
    }

    public List<Plan> getPlanByStatus(char status) {
        return (List<Plan>) pd.findPlanByStatus(status);
    }

    public void close() {
        ((JpaPlanDao) pd).close();
    }
}
