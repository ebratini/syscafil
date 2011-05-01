/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Empresa;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaEmpresaDao extends JpaDao implements EmpresaDao {

    public JpaEmpresaDao() {
    }

    public JpaEmpresaDao(Map props) {
        super(props);
    }

    @Override
    public Empresa findEmpresaByDNI(String dni) {
        Query q = entityManager.createNamedQuery("Empresa.findByEmpDni");
        q.setParameter("empDni", dni);
        return (Empresa) q.getSingleResult();
    }

    @Override
    public List findEmpresaByRazonSocial(String razonSocial) {
        Query q = entityManager.createNamedQuery("Empresa.findByEmpRazonSocial");
        q.setParameter("empRazonSocial", razonSocial);
        return q.getResultList();
    }
}
