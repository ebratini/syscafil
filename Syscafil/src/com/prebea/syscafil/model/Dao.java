/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.util.List;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public interface Dao {

    public <E> void persist(E entity);

    public List retrieve();

    public <E> E update(E entity);

    public <E> void remove(E entity);

    public <E, K> E findById(K id);
}
