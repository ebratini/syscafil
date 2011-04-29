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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "privilegios", catalog = "SYSCAFIL_DB", schema = "")
@NamedQueries({
    @NamedQuery(name = "Privilegio.findAll", query = "SELECT p FROM Privilegio p"),
    @NamedQuery(name = "Privilegio.findByPrvId", query = "SELECT p FROM Privilegio p WHERE p.prvId = :prvId"),
    @NamedQuery(name = "Privilegio.findByPrvNombre", query = "SELECT p FROM Privilegio p WHERE p.prvNombre = :prvNombre"),
    @NamedQuery(name = "Privilegio.findByPrvDescripcion", query = "SELECT p FROM Privilegio p WHERE p.prvDescripcion = :prvDescripcion"),
    @NamedQuery(name = "Privilegio.findByPrvStatus", query = "SELECT p FROM Privilegio p WHERE p.prvStatus = :prvStatus"),
    @NamedQuery(name = "Privilegio.findByPrvUpdateBy", query = "SELECT p FROM Privilegio p WHERE p.prvUpdateBy = :prvUpdateBy"),
    @NamedQuery(name = "Privilegio.findByPrvUpdateDate", query = "SELECT p FROM Privilegio p WHERE p.prvUpdateDate = :prvUpdateDate")})
public class Privilegio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prv_id", nullable = false)
    private Integer prvId;
    @Basic(optional = false)
    @Column(name = "prv_nombre", nullable = false, length = 10)
    private String prvNombre;
    @Basic(optional = false)
    @Column(name = "prv_descripcion", nullable = false, length = 40)
    private String prvDescripcion;
    @Basic(optional = false)
    @Column(name = "prv_status", nullable = false)
    private char prvStatus;
    @Basic(optional = false)
    @Column(name = "prv_update_by", nullable = false, length = 10)
    private String prvUpdateBy;
    @Basic(optional = false)
    @Column(name = "prv_update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date prvUpdateDate;
    @ManyToMany(mappedBy = "privilegioCollection")
    private Collection<Usuario> usuarioCollection;

    public Privilegio() {
    }

    public Privilegio(Integer prvId) {
        this.prvId = prvId;
    }

    public Privilegio(Integer prvId, String prvNombre, String prvDescripcion, char prvStatus, String prvUpdateBy, Date prvUpdateDate) {
        this.prvId = prvId;
        this.prvNombre = prvNombre;
        this.prvDescripcion = prvDescripcion;
        this.prvStatus = prvStatus;
        this.prvUpdateBy = prvUpdateBy;
        this.prvUpdateDate = prvUpdateDate;
    }

    public Integer getPrvId() {
        return prvId;
    }

    public void setPrvId(Integer prvId) {
        this.prvId = prvId;
    }

    public String getPrvNombre() {
        return prvNombre;
    }

    public void setPrvNombre(String prvNombre) {
        this.prvNombre = prvNombre;
    }

    public String getPrvDescripcion() {
        return prvDescripcion;
    }

    public void setPrvDescripcion(String prvDescripcion) {
        this.prvDescripcion = prvDescripcion;
    }

    public char getPrvStatus() {
        return prvStatus;
    }

    public void setPrvStatus(char prvStatus) {
        this.prvStatus = prvStatus;
    }

    public String getPrvUpdateBy() {
        return prvUpdateBy;
    }

    public void setPrvUpdateBy(String prvUpdateBy) {
        this.prvUpdateBy = prvUpdateBy;
    }

    public Date getPrvUpdateDate() {
        return prvUpdateDate;
    }

    public void setPrvUpdateDate(Date prvUpdateDate) {
        this.prvUpdateDate = prvUpdateDate;
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
        hash += (prvId != null ? prvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilegio)) {
            return false;
        }
        Privilegio other = (Privilegio) object;
        if ((this.prvId == null && other.prvId != null) || (this.prvId != null && !this.prvId.equals(other.prvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Privilegio[prvId=" + prvId + "]";
    }

}
