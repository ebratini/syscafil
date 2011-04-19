/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

import com.prebea.syscafil.model.UsuarioEntityManager;
import com.prebea.syscafil.model.entities.Usuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class UsuarioManager {
    private UsuarioEntityManager uem = new UsuarioEntityManager();

    public UsuarioManager() {
    }

    public UsuarioManager(Map props) {
        uem = new UsuarioEntityManager(props);
    }

    public void agregarUsuario(Usuario usuario) {
        uem.create(usuario);
    }

    public List<Usuario> getUsuarios() {
        return uem.retrieve();
    }

    public void actualizarUsuario(Usuario usuario) {
        uem.update(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        uem.delete(usuario);
    }
}
