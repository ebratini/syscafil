/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Empresa;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface EmpresaDao extends Dao {

    public Empresa findEmpresaByDNI(String dni);

    public List findEmpresaByRazonSocial(String razonSocial);
}
