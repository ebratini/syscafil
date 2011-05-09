/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import com.prebea.syscafil.model.entities.Afiliado;
import com.prebea.syscafil.model.entities.Dependiente;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class JpaDependienteDao extends JpaDao implements DependienteDao {

    public JpaDependienteDao() {
        super(Dependiente.class);
    }

    public JpaDependienteDao(Map props) {
        super(Dependiente.class, props);
    }

    @Override
    public Dependiente findDependienteByDNI(String dni) {
        Query q = entityManager.createNamedQuery("Dependiente.findByDepDni");
        q.setParameter("depDni", dni);
        return (Dependiente) q.getSingleResult();
    }

    @Override
    public List findDependienteByApellido(String apellido) {
        Query q = entityManager.createNamedQuery("Dependiente.findByDepApellido");
        q.setParameter("depApellido", apellido);
        return q.getResultList();
    }

    @Override
    public List findDependienteByNombre(String nombre) {
        Query q = entityManager.createNamedQuery("Dependiente.findByDepNombre");
        q.setParameter("depNombre", nombre);
        return q.getResultList();
    }

    @Override
    public List findDependienteByStatus(char status) {
        Query q = entityManager.createNamedQuery("Dependiente.findByDepStatus");
        q.setParameter("depStatus", status);
        return q.getResultList();
    }

    @Override
    public List findDependienteByAfiliado(Afiliado afiliado) {
        Query q = entityManager.createQuery("SELECT d FROM Dependiente d WHERE d.afiliado = :afiliado");
        q.setParameter("afiliado", afiliado);
        return q.getResultList();
    }

    @Override
    public List findDependienteExtraActivoByAfiliado(Afiliado afiliado) {
        String qString = "SELECT d FROM Dependiente d WHERE d.afiliado = :afiliado AND d.depStatus = 'A'";
        qString += " AND depExtra = 1";
        Query q = entityManager.createQuery(qString);
        q.setParameter("afiliado", afiliado);
        return q.getResultList();
    }
}
