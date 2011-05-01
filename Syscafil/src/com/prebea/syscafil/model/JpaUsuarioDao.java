/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Usuario;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaUsuarioDao extends JpaDao implements UsuarioDao {

    public JpaUsuarioDao() {
    }

    public JpaUsuarioDao(Map props) {
        super(props);
    }

    @Override
    public Usuario findByLogin(String login) {
        Query q = entityManager.createNamedQuery("Usuario.findByUsrLogin");
        q.setParameter("usrLogin", login);
        return (Usuario) q.getSingleResult();
    }
}
