/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Usuarios", catalog = "SYSCAFIL_DB", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"usr_login"})})
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsrId", query = "SELECT u FROM Usuario u WHERE u.usrId = :usrId"),
    @NamedQuery(name = "Usuario.findByUsrLogin", query = "SELECT u FROM Usuario u WHERE u.usrLogin = :usrLogin"),
    @NamedQuery(name = "Usuario.findByUsrPassword", query = "SELECT u FROM Usuario u WHERE u.usrPassword = :usrPassword"),
    @NamedQuery(name = "Usuario.findByUsrFechaCreacion", query = "SELECT u FROM Usuario u WHERE u.usrFechaCreacion = :usrFechaCreacion"),
    @NamedQuery(name = "Usuario.findByUsrVerificado", query = "SELECT u FROM Usuario u WHERE u.usrVerificado = :usrVerificado"),
    @NamedQuery(name = "Usuario.findByUsrUpdateBy", query = "SELECT u FROM Usuario u WHERE u.usrUpdateBy = :usrUpdateBy"),
    @NamedQuery(name = "Usuario.findByUsrUpdateDate", query = "SELECT u FROM Usuario u WHERE u.usrUpdateDate = :usrUpdateDate")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usr_id", nullable = false)
    private Integer usrId;
    @Basic(optional = false)
    @Column(name = "usr_login", nullable = false, length = 20)
    private String usrLogin;
    @Basic(optional = false)
    @Column(name = "usr_password", nullable = false, length = 10)
    private String usrPassword;
    @Basic(optional = false)
    @Column(name = "usr_fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date usrFechaCreacion;
    @Basic(optional = false)
    @Column(name = "usr_verificado", nullable = false)
    private short usrVerificado;
    @Basic(optional = false)
    @Column(name = "usr_update_by", nullable = false, length = 10)
    private String usrUpdateBy;
    @Basic(optional = false)
    @Column(name = "usr_update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date usrUpdateDate;
    @JoinColumn(name = "rol_id", referencedColumnName = "rol_id", nullable = false)
    @ManyToOne(optional = false)
    private Rol rol;

    public Usuario() {
    }

    public Usuario(Integer usrId) {
        this.usrId = usrId;
    }

    public Usuario(Integer usrId, String usrLogin, String usrPassword, Date usrFechaCreacion, short usrVerificado, String usrUpdateBy, Date usrUpdateDate) {
        this.usrId = usrId;
        this.usrLogin = usrLogin;
        this.usrPassword = usrPassword;
        this.usrFechaCreacion = usrFechaCreacion;
        this.usrVerificado = usrVerificado;
        this.usrUpdateBy = usrUpdateBy;
        this.usrUpdateDate = usrUpdateDate;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrLogin() {
        return usrLogin;
    }

    public void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Date getUsrFechaCreacion() {
        return usrFechaCreacion;
    }

    public void setUsrFechaCreacion(Date usrFechaCreacion) {
        this.usrFechaCreacion = usrFechaCreacion;
    }

    public short getUsrVerificado() {
        return usrVerificado;
    }

    public void setUsrVerificado(short usrVerificado) {
        this.usrVerificado = usrVerificado;
    }

    public String getUsrUpdateBy() {
        return usrUpdateBy;
    }

    public void setUsrUpdateBy(String usrUpdateBy) {
        this.usrUpdateBy = usrUpdateBy;
    }

    public Date getUsrUpdateDate() {
        return usrUpdateDate;
    }

    public void setUsrUpdateDate(Date usrUpdateDate) {
        this.usrUpdateDate = usrUpdateDate;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Usuario[usrId=" + usrId + "]";
    }

}
