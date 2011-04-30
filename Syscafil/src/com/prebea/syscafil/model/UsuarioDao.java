/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Usuario;
import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface UsuarioDao extends Dao {
    public Usuario findByLogin();
    public <E> List<E> getRoles();
}
