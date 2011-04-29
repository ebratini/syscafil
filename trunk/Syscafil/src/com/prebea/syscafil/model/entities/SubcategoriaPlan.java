/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "subcategoria_planes", catalog = "SYSCAFIL_DB", schema = "")
@NamedQueries({
    @NamedQuery(name = "SubcategoriaPlan.findAll", query = "SELECT s FROM SubcategoriaPlan s"),
    @NamedQuery(name = "SubcategoriaPlan.findBySupId", query = "SELECT s FROM SubcategoriaPlan s WHERE s.supId = :supId"),
    @NamedQuery(name = "SubcategoriaPlan.findBySupNombre", query = "SELECT s FROM SubcategoriaPlan s WHERE s.supNombre = :supNombre"),
    @NamedQuery(name = "SubcategoriaPlan.findBySupDescripcion", query = "SELECT s FROM SubcategoriaPlan s WHERE s.supDescripcion = :supDescripcion"),
    @NamedQuery(name = "SubcategoriaPlan.findBySupStatus", query = "SELECT s FROM SubcategoriaPlan s WHERE s.supStatus = :supStatus")})
public class SubcategoriaPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sup_id", nullable = false)
    private Integer supId;
    @Basic(optional = false)
    @Column(name = "sup_nombre", nullable = false, length = 20)
    private String supNombre;
    @Basic(optional = false)
    @Column(name = "sup_descripcion", nullable = false, length = 40)
    private String supDescripcion;
    @Basic(optional = false)
    @Column(name = "sup_status", nullable = false)
    private char supStatus;
    @JoinColumn(name = "cap_id", referencedColumnName = "cap_id", nullable = false)
    @ManyToOne(optional = false)
    private CategoriaPlan categoriaPlan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subcategoriaPlan")
    private Collection<Plan> planCollection;

    public SubcategoriaPlan() {
    }

    public SubcategoriaPlan(Integer supId) {
        this.supId = supId;
    }

    public SubcategoriaPlan(Integer supId, String supNombre, String supDescripcion, char supStatus) {
        this.supId = supId;
        this.supNombre = supNombre;
        this.supDescripcion = supDescripcion;
        this.supStatus = supStatus;
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getSupNombre() {
        return supNombre;
    }

    public void setSupNombre(String supNombre) {
        this.supNombre = supNombre;
    }

    public String getSupDescripcion() {
        return supDescripcion;
    }

    public void setSupDescripcion(String supDescripcion) {
        this.supDescripcion = supDescripcion;
    }

    public char getSupStatus() {
        return supStatus;
    }

    public void setSupStatus(char supStatus) {
        this.supStatus = supStatus;
    }

    public CategoriaPlan getCategoriaPlan() {
        return categoriaPlan;
    }

    public void setCategoriaPlan(CategoriaPlan categoriaPlan) {
        this.categoriaPlan = categoriaPlan;
    }

    public Collection<Plan> getPlanCollection() {
        return planCollection;
    }

    public void setPlanCollection(Collection<Plan> planCollection) {
        this.planCollection = planCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supId != null ? supId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubcategoriaPlan)) {
            return false;
        }
        SubcategoriaPlan other = (SubcategoriaPlan) object;
        if ((this.supId == null && other.supId != null) || (this.supId != null && !this.supId.equals(other.supId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.SubcategoriaPlan[supId=" + supId + "]";
    }

}
