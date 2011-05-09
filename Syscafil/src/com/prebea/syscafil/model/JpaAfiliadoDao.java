/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaAfiliadoDao extends JpaDao implements AfiliadoDao {

    public JpaAfiliadoDao() {
        super(Afiliado.class);
    }

    public JpaAfiliadoDao(Map props) {
        super(Afiliado.class, props);
    }

    public List findAfiliadoByApellido(String apellido) {
        Query q = entityManager.createNamedQuery("Afiliado.findByAflApellido");
        q.setParameter("aflApellido", apellido);
        return q.getResultList();
    }

    public List findAfiliadoByNombre(String nombre) {
        Query q = entityManager.createNamedQuery("Afiliado.findByAflNombre");
        q.setParameter("aflNombre", nombre);
        return q.getResultList();
    }

    @Override
    public Afiliado findAfiliadoByDNI(String dni) {
        Query q = entityManager.createNamedQuery("Afiliado.findByAflDni");
        q.setParameter("aflDni", dni);
        return (Afiliado) q.getSingleResult();
    }

    @Override
    public List findAfiliadoByStatus(char status) {
        Query q = entityManager.createNamedQuery("Afiliado.findByAflStatus");
        q.setParameter("aflStatus", status);
        return q.getResultList();
    }
}
