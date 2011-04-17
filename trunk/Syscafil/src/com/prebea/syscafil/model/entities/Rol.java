/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Roles", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r"),
    @NamedQuery(name = "Rol.findByRolId", query = "SELECT r FROM Rol r WHERE r.rolId = :rolId"),
    @NamedQuery(name = "Rol.findByRolNombre", query = "SELECT r FROM Rol r WHERE r.rolNombre = :rolNombre"),
    @NamedQuery(name = "Rol.findByRolDescripcion", query = "SELECT r FROM Rol r WHERE r.rolDescripcion = :rolDescripcion"),
    @NamedQuery(name = "Rol.findByRolStatus", query = "SELECT r FROM Rol r WHERE r.rolStatus = :rolStatus"),
    @NamedQuery(name = "Rol.findByRolUpdateBy", query = "SELECT r FROM Rol r WHERE r.rolUpdateBy = :rolUpdateBy"),
    @NamedQuery(name = "Rol.findByRolUpdateDate", query = "SELECT r FROM Rol r WHERE r.rolUpdateDate = :rolUpdateDate")})
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rol_id", nullable = false)
    private Integer rolId;
    @Basic(optional = false)
    @Column(name = "rol_nombre", nullable = false, length = 10)
    private String rolNombre;
    @Basic(optional = false)
    @Column(name = "rol_descripcion", nullable = false, length = 40)
    private String rolDescripcion;
    @Basic(optional = false)
    @Column(name = "rol_status", nullable = false)
    private char rolStatus;
    @Basic(optional = false)
    @Column(name = "rol_update_by", nullable = false, length = 20)
    private String rolUpdateBy;
    @Basic(optional = false)
    @Column(name = "rol_update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date rolUpdateDate;
    @ManyToMany(mappedBy = "rolCollection")
    private Collection<Permiso> permisoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rol")
    private Collection<Usuario> usuarioCollection;

    public Rol() {
    }

    public Rol(Integer rolId) {
        this.rolId = rolId;
    }

    public Rol(Integer rolId, String rolNombre, String rolDescripcion, char rolStatus, String rolUpdateBy, Date rolUpdateDate) {
        this.rolId = rolId;
        this.rolNombre = rolNombre;
        this.rolDescripcion = rolDescripcion;
        this.rolStatus = rolStatus;
        this.rolUpdateBy = rolUpdateBy;
        this.rolUpdateDate = rolUpdateDate;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public char getRolStatus() {
        return rolStatus;
    }

    public void setRolStatus(char rolStatus) {
        this.rolStatus = rolStatus;
    }

    public String getRolUpdateBy() {
        return rolUpdateBy;
    }

    public void setRolUpdateBy(String rolUpdateBy) {
        this.rolUpdateBy = rolUpdateBy;
    }

    public Date getRolUpdateDate() {
        return rolUpdateDate;
    }

    public void setRolUpdateDate(Date rolUpdateDate) {
        this.rolUpdateDate = rolUpdateDate;
    }

    public Collection<Permiso> getPermisoCollection() {
        return permisoCollection;
    }

    public void setPermisoCollection(Collection<Permiso> permisoCollection) {
        this.permisoCollection = permisoCollection;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolId != null ? rolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolId == null && other.rolId != null) || (this.rolId != null && !this.rolId.equals(other.rolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Rol[rolId=" + rolId + "]";
    }

}
