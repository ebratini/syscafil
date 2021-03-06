/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini <edwin.bratini@gmail.com>.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.CategoriaPlanDao;
import com.prebea.syscafil.model.JpaCategoriaPlanDao;
import com.prebea.syscafil.model.entities.CategoriaPlan;
import java.util.List;
import java.util.Map;
import javax.persistence.NoResultException;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class CategoriaPlanManager {

    private CategoriaPlanDao cpd = new JpaCategoriaPlanDao();
    

    public CategoriaPlanManager() {
    }

    public CategoriaPlanManager(Map props) {
        cpd = new JpaCategoriaPlanDao(props);
    }

    public void crearCategoriaPlan(CategoriaPlan catPlan) {
        cpd.persist(catPlan);
    }

    public List<CategoriaPlan> getCategoriaPlanes() {
        return (List<CategoriaPlan>) cpd.retrieve();
    }

    public CategoriaPlan actualizarCategoriPlan(CategoriaPlan catPlan) {
        return cpd.update(catPlan);
    }

    public void removerCategoriaPlan(CategoriaPlan catPlan) {
        cpd.remove(catPlan);
    }

    public CategoriaPlan getCategoriaPlanByNombre(String nombre) {
        CategoriaPlan catPlan = null;
        try {
            catPlan = cpd.findCategoriaPlanByNombre(nombre);
        } catch (NoResultException nre) {
        }
        return catPlan;
    }

    public List<CategoriaPlan> getCategoriaPlanByStatus(char satus) {
        return (List<CategoriaPlan>) cpd.findCategoriaPlanByStatus(satus);
    }
}
