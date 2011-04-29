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

    public <E> List<E> retrieve(E entity);

    public <E> E merge(E entity);

    public <E> void remove(E entity);

    public <E, K> E findById(K id);
}
