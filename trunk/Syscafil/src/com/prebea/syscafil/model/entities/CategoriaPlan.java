/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Categoria_Planes", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "CategoriaPlan.findAll", query = "SELECT c FROM CategoriaPlan c"),
    @NamedQuery(name = "CategoriaPlan.findByCapId", query = "SELECT c FROM CategoriaPlan c WHERE c.capId = :capId"),
    @NamedQuery(name = "CategoriaPlan.findByCapNombre", query = "SELECT c FROM CategoriaPlan c WHERE c.capNombre = :capNombre"),
    @NamedQuery(name = "CategoriaPlan.findByCapDescripcion", query = "SELECT c FROM CategoriaPlan c WHERE c.capDescripcion = :capDescripcion"),
    @NamedQuery(name = "CategoriaPlan.findByCapStatus", query = "SELECT c FROM CategoriaPlan c WHERE c.capStatus = :capStatus")})
public class CategoriaPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cap_id", nullable = false)
    private Integer capId;
    @Basic(optional = false)
    @Column(name = "cap_nombre", nullable = false, length = 20)
    private String capNombre;
    @Basic(optional = false)
    @Column(name = "cap_descripcion", nullable = false, length = 40)
    private String capDescripcion;
    @Basic(optional = false)
    @Column(name = "cap_status", nullable = false)
    private char capStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaPlan")
    private Collection<Plan> planCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaPlan")
    private Collection<SubcategoriaPlan> subcategoriaPlanCollection;

    public CategoriaPlan() {
    }

    public CategoriaPlan(Integer capId) {
        this.capId = capId;
    }

    public CategoriaPlan(Integer capId, String capNombre, String capDescripcion, char capStatus) {
        this.capId = capId;
        this.capNombre = capNombre;
        this.capDescripcion = capDescripcion;
        this.capStatus = capStatus;
    }

    public CategoriaPlan(String capNombre, String capDescripcion, char capStatus) {
        this.capNombre = capNombre;
        this.capDescripcion = capDescripcion;
        this.capStatus = capStatus;
    }

    public Integer getCapId() {
        return capId;
    }

    public void setCapId(Integer capId) {
        this.capId = capId;
    }

    public String getCapNombre() {
        return capNombre;
    }

    public void setCapNombre(String capNombre) {
        this.capNombre = capNombre;
    }

    public String getCapDescripcion() {
        return capDescripcion;
    }

    public void setCapDescripcion(String capDescripcion) {
        this.capDescripcion = capDescripcion;
    }

    public char getCapStatus() {
        return capStatus;
    }

    public void setCapStatus(char capStatus) {
        this.capStatus = capStatus;
    }

    public Collection<Plan> getPlanCollection() {
        return planCollection;
    }

    public void setPlanCollection(Collection<Plan> planCollection) {
        this.planCollection = planCollection;
    }

    public Collection<SubcategoriaPlan> getSubcategoriaPlanCollection() {
        return subcategoriaPlanCollection;
    }

    public void setSubcategoriaPlanCollection(Collection<SubcategoriaPlan> subcategoriaPlanCollection) {
        this.subcategoriaPlanCollection = subcategoriaPlanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (capId != null ? capId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaPlan)) {
            return false;
        }
        CategoriaPlan other = (CategoriaPlan) object;
        if ((this.capId == null && other.capId != null) || (this.capId != null && !this.capId.equals(other.capId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.CategoriaPlan[capId=" + capId + "]";
    }

}
