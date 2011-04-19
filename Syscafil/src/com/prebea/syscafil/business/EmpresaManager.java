/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.EmpresaEntityManager;
import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Empresa;
import com.prebea.syscafil.model.entities.EmpresaAfiliado;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class EmpresaManager {
    private EmpresaEntityManager eem = new EmpresaEntityManager();

    public EmpresaManager() {
    }

    public EmpresaManager(Map props) {
        eem = new EmpresaEntityManager(props);
    }

    public void agregarEmpresa(Empresa empresa) {
        eem.create(empresa);
    }

    public List<Empresa> getEmpresas() {
        return eem.retrieve();
    }

    public void actualizarEmpresa(Empresa empresa) {
        eem.update(empresa);
    }

    public void removerEmpresa(Empresa empresa) {
        eem.delete(empresa);
    }

    public List<Afiliado> getAfiliados(Empresa empresa) {
        List<Afiliado> afiliados = null;

        for (EmpresaAfiliado empresaAfil : empresa.getEmpresaAfiliadoCollection()) {
            afiliados.add(empresaAfil.getAfiliado());
        }

        return afiliados;
    }
}
