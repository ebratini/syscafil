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

import com.prebea.syscafil.model.JpaSubcategoriaPlanDao;
import com.prebea.syscafil.model.SubcategoriaPlanDao;
import com.prebea.syscafil.model.entities.CategoriaPlan;
import com.prebea.syscafil.model.entities.SubcategoriaPlan;
import java.util.List;
import java.util.Map;
import javax.persistence.NoResultException;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class SubcategoriaPlanManager {

    private SubcategoriaPlanDao spd = new JpaSubcategoriaPlanDao();

    public SubcategoriaPlanManager() {
    }

    public SubcategoriaPlanManager(Map props) {
        spd = new JpaSubcategoriaPlanDao(props);
    }

    public void crearSubcategoriaPlan(SubcategoriaPlan subCatPlan) {
        spd.persist(subCatPlan);
    }

    public List<SubcategoriaPlan> getSubcategoriaPlanes() {
        return (List<SubcategoriaPlan>) spd.retrieve();
    }

    public SubcategoriaPlan actualizarSubcategoriaPlan(SubcategoriaPlan subCatPlan) {
        return spd.update(subCatPlan);
    }

    public void removerSubcategoriaPlan(SubcategoriaPlan subCatPlan) {
        spd.remove(subCatPlan);
    }

    public SubcategoriaPlan getSubcategoriaPlanByNombre(String nombre) {
        SubcategoriaPlan subCatPlan = null;
        try {
            subCatPlan = spd.findSubcategoriaPlanByNombre(nombre);
        } catch (NoResultException nre) {
        }

        return subCatPlan;
    }

    public List<SubcategoriaPlan> getSubcategoriaPlanByStatus(char status) {
        return (List<SubcategoriaPlan>) spd.findSubcategoriaPlanByStatus(status);
    }

    public List<SubcategoriaPlan> getSubcategoriaPlanByCategoriaPlan(CategoriaPlan catPlan) {
        return (List<SubcategoriaPlan>) spd.findSubCategoriaByCategoriaPlan(catPlan);
    }
}
