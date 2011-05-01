/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Factura;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface FacturaDao extends Dao {

    public Factura findFacturaByFacNo(Integer facNo);

    public List findFacuturaByAfiliado(Afiliado afiliado);

    public List findFacturasPendientes(Afiliado afiliado);
}
