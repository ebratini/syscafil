/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.PlanEntityManager;
import com.prebea.syscafil.model.entities.Plan;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class PlanManager {
    private PlanEntityManager pem = new PlanEntityManager();

    public PlanManager() {
    }

    public PlanManager(Map props) {
        pem = new PlanEntityManager(props);
    }

    public void agregarPlan(Plan plan) {
        pem.create(plan);
    }

    public List<Plan> getPlanes() {
        return pem.retrieve();
    }

    public void actualizarPlan(Plan plan) {
        pem.update(plan);
    }

    public void removerPlan(Plan plan) {
        pem.delete(plan);
    }
}
