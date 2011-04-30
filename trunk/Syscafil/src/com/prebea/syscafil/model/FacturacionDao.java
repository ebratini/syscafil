/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Facturacion;
import java.util.Date;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface FacturacionDao extends Dao {

    public Date findUltimaFechaFacturacion();

    public Facturacion findFacturacionByFechaFacturacion(Date fechaFacturacion);
}
