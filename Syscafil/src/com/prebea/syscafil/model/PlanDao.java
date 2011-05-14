/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.CategoriaPlan;
import com.prebea.syscafil.model.entities.Plan;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface PlanDao extends Dao {

    public List findPlanByStatus(char status);

    public  Plan findPlanByNombre(String nombrePlan);

    public List<Plan> findPlanByCategoria(CategoriaPlan categoriaPlan);
}
