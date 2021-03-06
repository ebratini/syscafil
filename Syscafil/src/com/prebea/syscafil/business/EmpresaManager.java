/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.EmpresaDao;
import com.prebea.syscafil.model.JpaEmpresaDao;
import com.prebea.syscafil.model.entities.Empresa;
import java.util.List;
import java.util.Map;
import javax.persistence.NoResultException;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class EmpresaManager {

    private EmpresaDao ed = new JpaEmpresaDao();

    public EmpresaManager() {
    }

    public EmpresaManager(Map props) {
        ed = new JpaEmpresaDao(props);
    }

    public void crearEmpresa(Empresa empresa) {
        ed.persist(empresa);
    }

    public List<Empresa> getEmpresas() {
        return (List<Empresa>) ed.retrieve();
    }

    public Empresa actualizarEmpresa(Empresa empresa) {
        return ed.update(empresa);
    }

    public void removerEmpresa(Empresa empresa) {
        ed.remove(empresa);
    }

    public Empresa getEmpresaById(Integer id) {
       Empresa empresa = null;

        try {
            empresa = ed.findById(id);
        } catch (NoResultException nre) {
            System.out.println("No Result Exception");
        }
        return empresa;
    }

    public Empresa getEmpresaByDNI(String dni) {
        Empresa empresa = null;

        try {
            empresa = ed.findEmpresaByDNI(dni);
        } catch (NoResultException nre) {
            System.out.println("No Result Exception");
        }
        return empresa;
    }

    public List<Empresa> getEmpresaByRazonSocial(String razonSocial) {
        List<Empresa> empresas = null;

        try {
            empresas = ed.findEmpresaByRazonSocial(razonSocial);
        } catch (NoResultException nre) {
            System.out.println("No Result Exception");
        }
        return empresas;
    }

    public void close() {
        ((JpaEmpresaDao) ed).close();
    }
}
