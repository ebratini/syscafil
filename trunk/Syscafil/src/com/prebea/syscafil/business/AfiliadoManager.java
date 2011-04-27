/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.AfiliadoEntityManager;
import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Empresa;
import com.prebea.syscafil.model.entities.EmpresaAfiliado;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class AfiliadoManager {

    private AfiliadoEntityManager aem = new AfiliadoEntityManager();

    public AfiliadoManager() {
    }

    public AfiliadoManager(Map props) {
        aem = new AfiliadoEntityManager(props);
    }

    public void agregarAfiliado(Afiliado afiliado) {
        aem.create(afiliado);
    }

    public List<Afiliado> getAfiliados() {
        return aem.retrieve();
    }

    public void actualizarAfiliado(Afiliado afiliado) {
        aem.update(afiliado);
    }

    public void removerAfiliado(Afiliado afiliado) {
        aem.delete(afiliado);
    }

    public List<Afiliado> getAfiliadosActivos() {
        return aem.getAfiliadoByStatus('A');
    }

    public Afiliado getAfiliadoById(Integer id) {
        return aem.getAfiliadoById(id);
    }

    public Afiliado getAfiliadoByDNI(String dni) {
        return aem.getAfiliadoByDNI(dni);
    }

    public List<Afiliado> getAfiliadoByNombre(String nombre) {
        return aem.getAfiliadoByNombre(nombre);
    }

    public List<Afiliado> getAfiliadoByApellido(String apellido) {
        return aem.getAfiliadoByApellido(apellido);
    }

    public Empresa getEmpresa(Afiliado afiliado) throws AfiliadoConMasDeUnaEmpresaException {
        Empresa empresa = null;
        List<EmpresaAfiliado> empresaAfiliado = (List<EmpresaAfiliado>) afiliado.getEmpresaAfiliadoCollection();
        if (empresaAfiliado != null && empresaAfiliado.size() > 1) {
            throw new AfiliadoConMasDeUnaEmpresaException(String.format("Afiliado: [%d %s,%s] tiene mas de una empresa asociada",
                    afiliado.getAflId(), afiliado.getAflApellido(), afiliado.getAflNombre()));
        } else {
            empresa = empresaAfiliado.get(0).getEmpresa();
        }

        return empresa;
    }

    public void close() {
        aem.close();
    }
}
