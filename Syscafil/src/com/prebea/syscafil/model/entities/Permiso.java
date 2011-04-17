/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Permisos", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p"),
    @NamedQuery(name = "Permiso.findByPerId", query = "SELECT p FROM Permiso p WHERE p.perId = :perId"),
    @NamedQuery(name = "Permiso.findByPerNombre", query = "SELECT p FROM Permiso p WHERE p.perNombre = :perNombre"),
    @NamedQuery(name = "Permiso.findByPerDescripcion", query = "SELECT p FROM Permiso p WHERE p.perDescripcion = :perDescripcion"),
    @NamedQuery(name = "Permiso.findByPerStatus", query = "SELECT p FROM Permiso p WHERE p.perStatus = :perStatus"),
    @NamedQuery(name = "Permiso.findByPerUpdateBy", query = "SELECT p FROM Permiso p WHERE p.perUpdateBy = :perUpdateBy"),
    @NamedQuery(name = "Permiso.findByPerUpdateDate", query = "SELECT p FROM Permiso p WHERE p.perUpdateDate = :perUpdateDate")})
public class Permiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "per_id", nullable = false)
    private Integer perId;
    @Basic(optional = false)
    @Column(name = "per_nombre", nullable = false, length = 10)
    private String perNombre;
    @Basic(optional = false)
    @Column(name = "per_descripcion", nullable = false, length = 40)
    private String perDescripcion;
    @Basic(optional = false)
    @Column(name = "per_status", nullable = false)
    private char perStatus;
    @Basic(optional = false)
    @Column(name = "per_update_by", nullable = false, length = 10)
    private String perUpdateBy;
    @Basic(optional = false)
    @Column(name = "per_update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date perUpdateDate;
    @JoinTable(name = "Roles_Permisos", joinColumns = {
        @JoinColumn(name = "per_id", referencedColumnName = "per_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "rol_id", referencedColumnName = "rol_id", nullable = false)})
    @ManyToMany
    private Collection<Rol> rolCollection;

    public Permiso() {
    }

    public Permiso(Integer perId) {
        this.perId = perId;
    }

    public Permiso(Integer perId, String perNombre, String perDescripcion, char perStatus, String perUpdateBy, Date perUpdateDate) {
        this.perId = perId;
        this.perNombre = perNombre;
        this.perDescripcion = perDescripcion;
        this.perStatus = perStatus;
        this.perUpdateBy = perUpdateBy;
        this.perUpdateDate = perUpdateDate;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerDescripcion() {
        return perDescripcion;
    }

    public void setPerDescripcion(String perDescripcion) {
        this.perDescripcion = perDescripcion;
    }

    public char getPerStatus() {
        return perStatus;
    }

    public void setPerStatus(char perStatus) {
        this.perStatus = perStatus;
    }

    public String getPerUpdateBy() {
        return perUpdateBy;
    }

    public void setPerUpdateBy(String perUpdateBy) {
        this.perUpdateBy = perUpdateBy;
    }

    public Date getPerUpdateDate() {
        return perUpdateDate;
    }

    public void setPerUpdateDate(Date perUpdateDate) {
        this.perUpdateDate = perUpdateDate;
    }

    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Permiso[perId=" + perId + "]";
    }

}
