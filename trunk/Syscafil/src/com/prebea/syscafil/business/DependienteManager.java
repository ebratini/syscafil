/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.DependienteDao;
import com.prebea.syscafil.model.JpaDependienteDao;
import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Dependiente;
import java.util.List;
import java.util.Map;
import javax.persistence.NoResultException;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class DependienteManager {

    private DependienteDao dd = new JpaDependienteDao();

    public DependienteManager() {
    }

    public DependienteManager(Map props) {
        dd = new JpaDependienteDao(props);
    }

    public void crearDependiente(Dependiente dependiente) {
        dd.persist(dependiente);
    }

    public List<Dependiente> getDependientes() {
        return (List<Dependiente>) dd.retrieve();
    }

    public Dependiente actualizarDependiente(Dependiente dependiente) {
        return dd.update(dependiente);
    }

    public void removerDependiente(Dependiente dependiente) {
        dd.remove(dependiente);
    }

    public Dependiente getDependienteById(Integer id) {
        Dependiente dependiente = null;
        try {
            dependiente = dd.findById(id);
        } catch (NoResultException nre) {
        }
        return dependiente;
    }

    public List<Dependiente> getDependientesActivos() {
        return (List<Dependiente>) dd.findDependienteByStatus('A');
    }

    public Dependiente getDependienteByDNI(String dni) {
        Dependiente dependiente = null;
        try {
            dependiente = dd.findDependienteByDNI(dni);
        } catch (NoResultException nre) {
        }
        return dependiente;
    }

    public List<Dependiente> getDependienteByNombre(String nombre) {
        return (List<Dependiente>) dd.findDependienteByNombre(nombre);
    }

    public List<Dependiente> getDependienteByApellido(String apellido) {
        return (List<Dependiente>) dd.findDependienteByApellido(apellido);
    }

    public List<Dependiente> getDependienteByAfiliado(Afiliado afiliado) {
        return (List<Dependiente>) dd.findDependienteByAfiliado(afiliado);
    }

    public List<Dependiente> getDependienteActivosExtrasByAfiliado(Afiliado afiliado) {
        return (List<Dependiente>) dd.findDependienteExtraActivoByAfiliado(afiliado);
    }

    public void close() {
        ((JpaDependienteDao) dd).close();
    }
}
