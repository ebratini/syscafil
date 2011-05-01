/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface BitacoraDao extends Dao {

    public List findBitacoraByFecha(Date fecha);

    public List findBitacoraByFuente(String fuente);

    public List findBitacoraByCategoria(String categoria);
}
