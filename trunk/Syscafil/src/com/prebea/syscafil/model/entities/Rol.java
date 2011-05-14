/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini <edwin.bratini@gmail.com>.
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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Roles", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r"),
    @NamedQuery(name = "Rol.findByRolId", query = "SELECT r FROM Rol r WHERE r.rolId = :rolId"),
    @NamedQuery(name = "Rol.findByRolNombre", query = "SELECT r FROM Rol r WHERE r.rolNombre = :rolNombre"),
    @NamedQuery(name = "Rol.findByRolDescripcion", query = "SELECT r FROM Rol r WHERE r.rolDescripcion = :rolDescripcion"),
    @NamedQuery(name = "Rol.findByRolFechaCreacion", query = "SELECT r FROM Rol r WHERE r.rolFechaCreacion = :rolFechaCreacion"),
    @NamedQuery(name = "Rol.findByRolStatus", query = "SELECT r FROM Rol r WHERE r.rolStatus = :rolStatus"),
    @NamedQuery(name = "Rol.findByRolUpdateBy", query = "SELECT r FROM Rol r WHERE r.rolUpdateBy = :rolUpdateBy"),
    @NamedQuery(name = "Rol.findByRolUpdateDate", query = "SELECT r FROM Rol r WHERE r.rolUpdateDate = :rolUpdateDate")})
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "rol_id", nullable = false)
    private Integer rolId;
    @Basic(optional = false)
    @Column(name = "rol_nombre", nullable = false, length = 20)
    private String rolNombre;
    @Basic(optional = false)
    @Column(name = "rol_descripcion", nullable = false, length = 60)
    private String rolDescripcion;
    @Basic(optional = false)
    @Column(name = "rol_fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date rolFechaCreacion;
    @Basic(optional = false)
    @Column(name = "rol_status", nullable = false)
    private char rolStatus;
    @Basic(optional = false)
    @Column(name = "rol_update_by", nullable = false, length = 40)
    private String rolUpdateBy;
    @Basic(optional = false)
    @Column(name = "rol_update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date rolUpdateDate;
    @ManyToMany(mappedBy = "rolCollection")
    private Collection<Privilegio> privilegioCollection;
    @JoinTable(name = "Usuarios_Roles", joinColumns = {
        @JoinColumn(name = "rol_id", referencedColumnName = "rol_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "usr_id", referencedColumnName = "usr_id", nullable = false)})
    @ManyToMany
    private Collection<Usuario> usuarioCollection;

    public Rol() {
    }

    public Rol(Integer rolId) {
        this.rolId = rolId;
    }

    public Rol(Integer rolId, String rolNombre, String rolDescripcion, Date rolFechaCreacion, char rolStatus, String rolUpdateBy, Date rolUpdateDate) {
        this.rolId = rolId;
        this.rolNombre = rolNombre;
        this.rolDescripcion = rolDescripcion;
        this.rolFechaCreacion = rolFechaCreacion;
        this.rolStatus = rolStatus;
        this.rolUpdateBy = rolUpdateBy;
        this.rolUpdateDate = rolUpdateDate;
    }
    
    public Rol(String rolNombre, String rolDescripcion, Date rolFechaCreacion, char rolStatus, String rolUpdateBy, Date rolUpdateDate) {
        this.rolNombre = rolNombre;
        this.rolDescripcion = rolDescripcion;
        this.rolFechaCreacion = rolFechaCreacion;
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

    public Date getRolFechaCreacion() {
        return rolFechaCreacion;
    }

    public void setRolFechaCreacion(Date rolFechaCreacion) {
        this.rolFechaCreacion = rolFechaCreacion;
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

    public Collection<Privilegio> getPrivilegioCollection() {
        return privilegioCollection;
    }

    public void setPrivilegioCollection(Collection<Privilegio> privilegioCollection) {
        this.privilegioCollection = privilegioCollection;
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
