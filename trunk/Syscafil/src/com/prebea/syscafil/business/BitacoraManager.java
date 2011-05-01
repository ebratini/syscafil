/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.BitacoraDao;
import com.prebea.syscafil.model.JpaBitacoraDao;
import com.prebea.syscafil.model.entities.Bitacora;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class BitacoraManager {

    private BitacoraDao bd = new JpaBitacoraDao();

    public BitacoraManager() {
    }

    public BitacoraManager(Map props) {
        bd = new JpaBitacoraDao(props);
    }

    public void crearBitacora(Bitacora bitacora) {
        bd.persist(bitacora);
    }

    public List<Bitacora> getBitacoras() {
        return (List<Bitacora>) bd.retrieve();
    }

    public Bitacora actualizarBitacora(Bitacora bitacora) {
        return bd.update(bitacora);
    }

    public void removerBitacora(Bitacora bitacora) {
        bd.remove(bitacora);
    }

    public Bitacora getBitacoraById(Integer id) {
        return bd.findById(id);
    }

    public List<Bitacora> getBitacoraByFecha(Date fecha) {
        return (List<Bitacora>) bd.findBitacoraByFecha(fecha);
    }

    public List<Bitacora> getBitacoraByFuente(String fuente) {
        return (List<Bitacora>) bd.findBitacoraByFuente(fuente);
    }

    public List<Bitacora> getBitacoraByCategoria(String categoria) {
        return (List<Bitacora>) bd.findBitacoraByCategoria(categoria);
    }
}
