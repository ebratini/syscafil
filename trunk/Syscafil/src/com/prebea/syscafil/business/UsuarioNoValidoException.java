/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.business;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class UsuarioNoValidoException extends Exception {
    public UsuarioNoValidoException() {
    }

    public UsuarioNoValidoException(String mensaje) {
        super(mensaje);
    }
}
