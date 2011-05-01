/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.JpaUsuarioDao;
import com.prebea.syscafil.model.UsuarioDao;
import com.prebea.syscafil.model.entities.Privilegio;
import com.prebea.syscafil.model.entities.Rol;
import com.prebea.syscafil.model.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class UsuarioManager {

    private UsuarioDao ud = new JpaUsuarioDao();

    public UsuarioManager() {
    }

    public UsuarioManager(Map props) {
        ud = new JpaUsuarioDao(props);
    }

    public void agregarUsuario(Usuario usuario) {
        ud.persist(usuario);
    }

    public List<Usuario> getUsuarios() {
        return (List<Usuario>) ud.retrieve();
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        return ud.update(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        ud.remove(usuario);
    }

    public Usuario getUsuarioById(Integer id) {
        return ud.findById(id);
    }

    public Usuario getUsuarioByLogin(String login) {
        return ud.findByLogin(login);
    }

    public List<String> getPrivilegios(Usuario usuario) {
        List<String> privilegios = new ArrayList<String>();
        for (Rol rol : usuario.getRolCollection()) {
            for (Privilegio priv : rol.getPrivilegioCollection()) {
                privilegios.add(priv.getPrvNombre());
            }
        }

        return privilegios;
    }

    public void close() {
        ((JpaUsuarioDao) ud).close();
    }
}
