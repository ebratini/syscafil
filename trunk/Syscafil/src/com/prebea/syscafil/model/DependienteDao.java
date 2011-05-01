/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Dependiente;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface DependienteDao extends Dao {

    public Dependiente findDependienteByDNI(String dni);

    public List findDependienteByApellido(String apellido);

    public List findDependienteByNombre(String nombre);

    public List findDependienteByStatus(char status);

    public List findDependienteByAfiliado(Afiliado afiliado);

    public List findDependienteExtraActivoByAfiliado(Afiliado afiliado);
}
