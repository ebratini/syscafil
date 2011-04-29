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
@Table(name = "empleados", catalog = "SYSCAFIL_DB", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"epd_dni"})})
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByEpdId", query = "SELECT e FROM Empleado e WHERE e.epdId = :epdId"),
    @NamedQuery(name = "Empleado.findByEpdDni", query = "SELECT e FROM Empleado e WHERE e.epdDni = :epdDni"),
    @NamedQuery(name = "Empleado.findByEpdTipoDni", query = "SELECT e FROM Empleado e WHERE e.epdTipoDni = :epdTipoDni"),
    @NamedQuery(name = "Empleado.findByEpdNombre", query = "SELECT e FROM Empleado e WHERE e.epdNombre = :epdNombre"),
    @NamedQuery(name = "Empleado.findByEpdApellido", query = "SELECT e FROM Empleado e WHERE e.epdApellido = :epdApellido"),
    @NamedQuery(name = "Empleado.findByEpdFechaNacimiento", query = "SELECT e FROM Empleado e WHERE e.epdFechaNacimiento = :epdFechaNacimiento"),
    @NamedQuery(name = "Empleado.findByEpdNacionalidad", query = "SELECT e FROM Empleado e WHERE e.epdNacionalidad = :epdNacionalidad"),
    @NamedQuery(name = "Empleado.findByEpdGenero", query = "SELECT e FROM Empleado e WHERE e.epdGenero = :epdGenero"),
    @NamedQuery(name = "Empleado.findByEpdEstadoCivil", query = "SELECT e FROM Empleado e WHERE e.epdEstadoCivil = :epdEstadoCivil"),
    @NamedQuery(name = "Empleado.findByEpdFechaContratacion", query = "SELECT e FROM Empleado e WHERE e.epdFechaContratacion = :epdFechaContratacion"),
    @NamedQuery(name = "Empleado.findByEpdFechaSalida", query = "SELECT e FROM Empleado e WHERE e.epdFechaSalida = :epdFechaSalida"),
    @NamedQuery(name = "Empleado.findByEpdDireccion", query = "SELECT e FROM Empleado e WHERE e.epdDireccion = :epdDireccion"),
    @NamedQuery(name = "Empleado.findByEpdCiudad", query = "SELECT e FROM Empleado e WHERE e.epdCiudad = :epdCiudad"),
    @NamedQuery(name = "Empleado.findByEpdRegion", query = "SELECT e FROM Empleado e WHERE e.epdRegion = :epdRegion"),
    @NamedQuery(name = "Empleado.findByEpdPais", query = "SELECT e FROM Empleado e WHERE e.epdPais = :epdPais"),
    @NamedQuery(name = "Empleado.findByEpdEmail", query = "SELECT e FROM Empleado e WHERE e.epdEmail = :epdEmail"),
    @NamedQuery(name = "Empleado.findByEpdStatus", query = "SELECT e FROM Empleado e WHERE e.epdStatus = :epdStatus")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "epd_id", nullable = false)
    private Integer epdId;
    @Basic(optional = false)
    @Column(name = "epd_dni", nullable = false, length = 11)
    private String epdDni;
    @Basic(optional = false)
    @Column(name = "epd_tipo_dni", nullable = false, length = 10)
    private String epdTipoDni;
    @Basic(optional = false)
    @Column(name = "epd_nombre", nullable = false, length = 20)
    private String epdNombre;
    @Basic(optional = false)
    @Column(name = "epd_apellido", nullable = false, length = 20)
    private String epdApellido;
    @Basic(optional = false)
    @Column(name = "epd_fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date epdFechaNacimiento;
    @Column(name = "epd_nacionalidad", length = 20)
    private String epdNacionalidad;
    @Basic(optional = false)
    @Column(name = "epd_genero", nullable = false)
    private char epdGenero;
    @Column(name = "epd_estado_civil", length = 10)
    private String epdEstadoCivil;
    @Basic(optional = false)
    @Column(name = "epd_fecha_contratacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date epdFechaContratacion;
    @Basic(optional = false)
    @Column(name = "epd_fecha_salida", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date epdFechaSalida;
    @Basic(optional = false)
    @Column(name = "epd_direccion", nullable = false, length = 40)
    private String epdDireccion;
    @Basic(optional = false)
    @Column(name = "epd_ciudad", nullable = false, length = 40)
    private String epdCiudad;
    @Basic(optional = false)
    @Column(name = "epd_region", nullable = false, length = 40)
    private String epdRegion;
    @Basic(optional = false)
    @Column(name = "epd_pais", nullable = false, length = 40)
    private String epdPais;
    @Column(name = "epd_email", length = 40)
    private String epdEmail;
    @Basic(optional = false)
    @Column(name = "epd_status", nullable = false)
    private char epdStatus;

    public Empleado() {
    }

    public Empleado(Integer epdId) {
        this.epdId = epdId;
    }

    public Empleado(Integer epdId, String epdDni, String epdTipoDni, String epdNombre, String epdApellido, Date epdFechaNacimiento, char epdGenero, Date epdFechaContratacion, Date epdFechaSalida, String epdDireccion, String epdCiudad, String epdRegion, String epdPais, char epdStatus) {
        this.epdId = epdId;
        this.epdDni = epdDni;
        this.epdTipoDni = epdTipoDni;
        this.epdNombre = epdNombre;
        this.epdApellido = epdApellido;
        this.epdFechaNacimiento = epdFechaNacimiento;
        this.epdGenero = epdGenero;
        this.epdFechaContratacion = epdFechaContratacion;
        this.epdFechaSalida = epdFechaSalida;
        this.epdDireccion = epdDireccion;
        this.epdCiudad = epdCiudad;
        this.epdRegion = epdRegion;
        this.epdPais = epdPais;
        this.epdStatus = epdStatus;
    }

    public Integer getEpdId() {
        return epdId;
    }

    public void setEpdId(Integer epdId) {
        this.epdId = epdId;
    }

    public String getEpdDni() {
        return epdDni;
    }

    public void setEpdDni(String epdDni) {
        this.epdDni = epdDni;
    }

    public String getEpdTipoDni() {
        return epdTipoDni;
    }

    public void setEpdTipoDni(String epdTipoDni) {
        this.epdTipoDni = epdTipoDni;
    }

    public String getEpdNombre() {
        return epdNombre;
    }

    public void setEpdNombre(String epdNombre) {
        this.epdNombre = epdNombre;
    }

    public String getEpdApellido() {
        return epdApellido;
    }

    public void setEpdApellido(String epdApellido) {
        this.epdApellido = epdApellido;
    }

    public Date getEpdFechaNacimiento() {
        return epdFechaNacimiento;
    }

    public void setEpdFechaNacimiento(Date epdFechaNacimiento) {
        this.epdFechaNacimiento = epdFechaNacimiento;
    }

    public String getEpdNacionalidad() {
        return epdNacionalidad;
    }

    public void setEpdNacionalidad(String epdNacionalidad) {
        this.epdNacionalidad = epdNacionalidad;
    }

    public char getEpdGenero() {
        return epdGenero;
    }

    public void setEpdGenero(char epdGenero) {
        this.epdGenero = epdGenero;
    }

    public String getEpdEstadoCivil() {
        return epdEstadoCivil;
    }

    public void setEpdEstadoCivil(String epdEstadoCivil) {
        this.epdEstadoCivil = epdEstadoCivil;
    }

    public Date getEpdFechaContratacion() {
        return epdFechaContratacion;
    }

    public void setEpdFechaContratacion(Date epdFechaContratacion) {
        this.epdFechaContratacion = epdFechaContratacion;
    }

    public Date getEpdFechaSalida() {
        return epdFechaSalida;
    }

    public void setEpdFechaSalida(Date epdFechaSalida) {
        this.epdFechaSalida = epdFechaSalida;
    }

    public String getEpdDireccion() {
        return epdDireccion;
    }

    public void setEpdDireccion(String epdDireccion) {
        this.epdDireccion = epdDireccion;
    }

    public String getEpdCiudad() {
        return epdCiudad;
    }

    public void setEpdCiudad(String epdCiudad) {
        this.epdCiudad = epdCiudad;
    }

    public String getEpdRegion() {
        return epdRegion;
    }

    public void setEpdRegion(String epdRegion) {
        this.epdRegion = epdRegion;
    }

    public String getEpdPais() {
        return epdPais;
    }

    public void setEpdPais(String epdPais) {
        this.epdPais = epdPais;
    }

    public String getEpdEmail() {
        return epdEmail;
    }

    public void setEpdEmail(String epdEmail) {
        this.epdEmail = epdEmail;
    }

    public char getEpdStatus() {
        return epdStatus;
    }

    public void setEpdStatus(char epdStatus) {
        this.epdStatus = epdStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (epdId != null ? epdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.epdId == null && other.epdId != null) || (this.epdId != null && !this.epdId.equals(other.epdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Empleado[epdId=" + epdId + "]";
    }

}
