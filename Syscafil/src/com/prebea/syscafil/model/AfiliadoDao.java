/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface AfiliadoDao extends Dao {

    public Afiliado findAfiliadoByDNI(String dni);

    public List findAfiliadoByApellido(String apellido);

    public List findAfiliadoByNombre(String nombre);

    public List findAfiliadoByStatus(char status);
}
