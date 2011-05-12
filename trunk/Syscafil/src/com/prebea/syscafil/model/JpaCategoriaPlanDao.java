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

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.CategoriaPlan;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaCategoriaPlanDao extends JpaDao implements CategoriaPlanDao {

    public JpaCategoriaPlanDao() {
        super(CategoriaPlan.class);
    }

    public JpaCategoriaPlanDao(Map properties) {
        super(CategoriaPlan.class, properties);
    }
    
    @Override
    public List findCategoriaPlanByStatus(char status) {
        Query q = entityManager.createNamedQuery("CategoriaPlan.findByCapStatus");
        q.setParameter("capStatus", status);
        return q.getResultList();
    }

    @Override
    public CategoriaPlan findCategoriaPlanByNombre(String nombreCatPlan) {
        Query q = entityManager.createNamedQuery("CategoriaPlan.findByCapNombre");
        q.setParameter("capNombre", nombreCatPlan);
        return (CategoriaPlan) q.getSingleResult();
    }

}
