/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.DependienteEntityManager;
import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Dependiente;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class DependienteManager {
    private DependienteEntityManager dem = new DependienteEntityManager();

    public DependienteManager() {
    }

    public DependienteManager(Map props) {
        dem = new DependienteEntityManager(props);
    }

    public void agregarDependiente(Dependiente dependiente) {
        dem.create(dependiente);
    }

    public List<Dependiente> getDependientes() {
        return dem.retrieve();
    }

    public void actualizarDependiente(Dependiente dependiente) {
        dem.update(dependiente);
    }

    public void removerDependiente(Dependiente dependiente) {
        dem.delete(dependiente);
    }

    public List<Dependiente> getDependientesActivos() {
        return dem.getDependienteByStatus('A');
    }

    public Dependiente getDependienteById(Integer id) {
        return dem.getDependienteById(id);
    }

    public Dependiente getDependienteByDNI(String dni) {
        return dem.getDependienteByDNI(dni);
    }

    public List<Dependiente> getDependienteByNombre(String nombre) {
        return dem.getDependienteByNombre(nombre);
    }

    public List<Dependiente> getDependienteByApellido(String apellido) {
        return dem.getDependienteByApellido(apellido);
    }

    public List<Dependiente> getDependienteActivosExtrasByAfiliado(Afiliado afiliado) {
        return dem.getDependienteExtraActivoByAfiliado(afiliado);
    }

    public void close() {
        dem.close();
    }
}
