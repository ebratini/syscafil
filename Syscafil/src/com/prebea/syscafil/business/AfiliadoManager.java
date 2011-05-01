/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.AfiliadoDao;
import com.prebea.syscafil.model.JpaAfiliadoDao;
import com.prebea.syscafil.model.entities.Afiliado;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class AfiliadoManager {

    private AfiliadoDao ad = new JpaAfiliadoDao();

    public AfiliadoManager() {
    }

    public AfiliadoManager(Map props) {
        ad = new JpaAfiliadoDao(props);
    }

    public void crearAfiliado(Afiliado afiliado) {
        ad.persist(afiliado);
    }

    public List<Afiliado> getAfiliados() {
        return (List<Afiliado>) ad.retrieve();
    }

    public Afiliado actualizarAfiliado(Afiliado afiliado) {
        return ad.update(afiliado);
    }

    public void removerAfiliado(Afiliado afiliado) {
        ad.remove(afiliado);
    }

    public Afiliado getAfiliadoById(Integer id) {
        return ad.findById(id);
    }

    public List<Afiliado> getAfiliadosActivos() {
        return (List<Afiliado>) ad.findAfiliadoByStatus('A');
    }

    public Afiliado getAfiliadoByDNI(String dni) {
        return ad.findAfiliadoByDNI(dni);
    }

    public List<Afiliado> getAfiliadoByNombre(String nombre) {
        return (List<Afiliado>) ad.findAfiliadoByNombre(nombre);
    }

    public List<Afiliado> getAfiliadoByApellido(String apellido) {
        return (List<Afiliado>) ad.findAfiliadoByApellido(apellido);
    }

    public void close() {
        ((JpaAfiliadoDao) ad).close();
    }
}
