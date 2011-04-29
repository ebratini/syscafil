/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface AfiliadoDao {

    public List findAfiliadoByApellido();

    public List findAfiliadoByNombre();
}
