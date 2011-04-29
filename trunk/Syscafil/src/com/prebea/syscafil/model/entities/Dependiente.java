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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "dependientes", catalog = "SYSCAFIL_DB", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"dep_dni"})})
@NamedQueries({
    @NamedQuery(name = "Dependiente.findAll", query = "SELECT d FROM Dependiente d"),
    @NamedQuery(name = "Dependiente.findByDepId", query = "SELECT d FROM Dependiente d WHERE d.depId = :depId"),
    @NamedQuery(name = "Dependiente.findByDepDni", query = "SELECT d FROM Dependiente d WHERE d.depDni = :depDni"),
    @NamedQuery(name = "Dependiente.findByDepTipoDni", query = "SELECT d FROM Dependiente d WHERE d.depTipoDni = :depTipoDni"),
    @NamedQuery(name = "Dependiente.findByDepNombre", query = "SELECT d FROM Dependiente d WHERE d.depNombre = :depNombre"),
    @NamedQuery(name = "Dependiente.findByDepApellido", query = "SELECT d FROM Dependiente d WHERE d.depApellido = :depApellido"),
    @NamedQuery(name = "Dependiente.findByDepParentesco", query = "SELECT d FROM Dependiente d WHERE d.depParentesco = :depParentesco"),
    @NamedQuery(name = "Dependiente.findByDepFechaIngreso", query = "SELECT d FROM Dependiente d WHERE d.depFechaIngreso = :depFechaIngreso"),
    @NamedQuery(name = "Dependiente.findByDepFechaNacimiento", query = "SELECT d FROM Dependiente d WHERE d.depFechaNacimiento = :depFechaNacimiento"),
    @NamedQuery(name = "Dependiente.findByDepNacionalidad", query = "SELECT d FROM Dependiente d WHERE d.depNacionalidad = :depNacionalidad"),
    @NamedQuery(name = "Dependiente.findByDepGenero", query = "SELECT d FROM Dependiente d WHERE d.depGenero = :depGenero"),
    @NamedQuery(name = "Dependiente.findByDepEstadoCivil", query = "SELECT d FROM Dependiente d WHERE d.depEstadoCivil = :depEstadoCivil"),
    @NamedQuery(name = "Dependiente.findByDepDireccion", query = "SELECT d FROM Dependiente d WHERE d.depDireccion = :depDireccion"),
    @NamedQuery(name = "Dependiente.findByDepCiudad", query = "SELECT d FROM Dependiente d WHERE d.depCiudad = :depCiudad"),
    @NamedQuery(name = "Dependiente.findByDepRegion", query = "SELECT d FROM Dependiente d WHERE d.depRegion = :depRegion"),
    @NamedQuery(name = "Dependiente.findByDepPais", query = "SELECT d FROM Dependiente d WHERE d.depPais = :depPais"),
    @NamedQuery(name = "Dependiente.findByDepEmail", query = "SELECT d FROM Dependiente d WHERE d.depEmail = :depEmail"),
    @NamedQuery(name = "Dependiente.findByDepExtra", query = "SELECT d FROM Dependiente d WHERE d.depExtra = :depExtra"),
    @NamedQuery(name = "Dependiente.findByDepStatus", query = "SELECT d FROM Dependiente d WHERE d.depStatus = :depStatus")})
public class Dependiente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dep_id", nullable = false)
    private Integer depId;
    @Basic(optional = false)
    @Column(name = "dep_dni", nullable = false, length = 11)
    private String depDni;
    @Basic(optional = false)
    @Column(name = "dep_tipo_dni", nullable = false, length = 10)
    private String depTipoDni;
    @Basic(optional = false)
    @Column(name = "dep_nombre", nullable = false, length = 20)
    private String depNombre;
    @Basic(optional = false)
    @Column(name = "dep_apellido", nullable = false, length = 20)
    private String depApellido;
    @Basic(optional = false)
    @Column(name = "dep_parentesco", nullable = false, length = 20)
    private String depParentesco;
    @Basic(optional = false)
    @Column(name = "dep_fecha_ingreso", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date depFechaIngreso;
    @Basic(optional = false)
    @Column(name = "dep_fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date depFechaNacimiento;
    @Column(name = "dep_nacionalidad", length = 20)
    private String depNacionalidad;
    @Basic(optional = false)
    @Column(name = "dep_genero", nullable = false)
    private char depGenero;
    @Column(name = "dep_estado_civil", length = 10)
    private String depEstadoCivil;
    @Basic(optional = false)
    @Column(name = "dep_direccion", nullable = false, length = 40)
    private String depDireccion;
    @Basic(optional = false)
    @Column(name = "dep_ciudad", nullable = false, length = 40)
    private String depCiudad;
    @Basic(optional = false)
    @Column(name = "dep_region", nullable = false, length = 40)
    private String depRegion;
    @Basic(optional = false)
    @Column(name = "dep_pais", nullable = false, length = 40)
    private String depPais;
    @Column(name = "dep_email", length = 40)
    private String depEmail;
    @Basic(optional = false)
    @Column(name = "dep_extra", nullable = false)
    private boolean depExtra;
    @Basic(optional = false)
    @Column(name = "dep_status", nullable = false)
    private char depStatus;
    @JoinColumn(name = "afl_id", referencedColumnName = "afl_id", nullable = false)
    @ManyToOne(optional = false)
    private Afiliado afiliado;

    public Dependiente() {
    }

    public Dependiente(Integer depId) {
        this.depId = depId;
    }

    public Dependiente(Integer depId, String depDni, String depTipoDni, String depNombre, String depApellido, String depParentesco, Date depFechaIngreso, Date depFechaNacimiento, char depGenero, String depDireccion, String depCiudad, String depRegion, String depPais, boolean depExtra, char depStatus) {
        this.depId = depId;
        this.depDni = depDni;
        this.depTipoDni = depTipoDni;
        this.depNombre = depNombre;
        this.depApellido = depApellido;
        this.depParentesco = depParentesco;
        this.depFechaIngreso = depFechaIngreso;
        this.depFechaNacimiento = depFechaNacimiento;
        this.depGenero = depGenero;
        this.depDireccion = depDireccion;
        this.depCiudad = depCiudad;
        this.depRegion = depRegion;
        this.depPais = depPais;
        this.depExtra = depExtra;
        this.depStatus = depStatus;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepDni() {
        return depDni;
    }

    public void setDepDni(String depDni) {
        this.depDni = depDni;
    }

    public String getDepTipoDni() {
        return depTipoDni;
    }

    public void setDepTipoDni(String depTipoDni) {
        this.depTipoDni = depTipoDni;
    }

    public String getDepNombre() {
        return depNombre;
    }

    public void setDepNombre(String depNombre) {
        this.depNombre = depNombre;
    }

    public String getDepApellido() {
        return depApellido;
    }

    public void setDepApellido(String depApellido) {
        this.depApellido = depApellido;
    }

    public String getDepParentesco() {
        return depParentesco;
    }

    public void setDepParentesco(String depParentesco) {
        this.depParentesco = depParentesco;
    }

    public Date getDepFechaIngreso() {
        return depFechaIngreso;
    }

    public void setDepFechaIngreso(Date depFechaIngreso) {
        this.depFechaIngreso = depFechaIngreso;
    }

    public Date getDepFechaNacimiento() {
        return depFechaNacimiento;
    }

    public void setDepFechaNacimiento(Date depFechaNacimiento) {
        this.depFechaNacimiento = depFechaNacimiento;
    }

    public String getDepNacionalidad() {
        return depNacionalidad;
    }

    public void setDepNacionalidad(String depNacionalidad) {
        this.depNacionalidad = depNacionalidad;
    }

    public char getDepGenero() {
        return depGenero;
    }

    public void setDepGenero(char depGenero) {
        this.depGenero = depGenero;
    }

    public String getDepEstadoCivil() {
        return depEstadoCivil;
    }

    public void setDepEstadoCivil(String depEstadoCivil) {
        this.depEstadoCivil = depEstadoCivil;
    }

    public String getDepDireccion() {
        return depDireccion;
    }

    public void setDepDireccion(String depDireccion) {
        this.depDireccion = depDireccion;
    }

    public String getDepCiudad() {
        return depCiudad;
    }

    public void setDepCiudad(String depCiudad) {
        this.depCiudad = depCiudad;
    }

    public String getDepRegion() {
        return depRegion;
    }

    public void setDepRegion(String depRegion) {
        this.depRegion = depRegion;
    }

    public String getDepPais() {
        return depPais;
    }

    public void setDepPais(String depPais) {
        this.depPais = depPais;
    }

    public String getDepEmail() {
        return depEmail;
    }

    public void setDepEmail(String depEmail) {
        this.depEmail = depEmail;
    }

    public boolean getDepExtra() {
        return depExtra;
    }

    public void setDepExtra(boolean depExtra) {
        this.depExtra = depExtra;
    }

    public char getDepStatus() {
        return depStatus;
    }

    public void setDepStatus(char depStatus) {
        this.depStatus = depStatus;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depId != null ? depId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependiente)) {
            return false;
        }
        Dependiente other = (Dependiente) object;
        if ((this.depId == null && other.depId != null) || (this.depId != null && !this.depId.equals(other.depId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Dependiente[depId=" + depId + "]";
    }

}
