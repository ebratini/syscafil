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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Afiliados", catalog = "SYSCAFIL_DB", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"afl_dni"})})
@NamedQueries({
    @NamedQuery(name = "Afiliado.findAll", query = "SELECT a FROM Afiliado a"),
    @NamedQuery(name = "Afiliado.findByAflId", query = "SELECT a FROM Afiliado a WHERE a.aflId = :aflId"),
    @NamedQuery(name = "Afiliado.findByAflDni", query = "SELECT a FROM Afiliado a WHERE a.aflDni = :aflDni"),
    @NamedQuery(name = "Afiliado.findByAflTipoDni", query = "SELECT a FROM Afiliado a WHERE a.aflTipoDni = :aflTipoDni"),
    @NamedQuery(name = "Afiliado.findByAflNombre", query = "SELECT a FROM Afiliado a WHERE a.aflNombre = :aflNombre"),
    @NamedQuery(name = "Afiliado.findByAflApellido", query = "SELECT a FROM Afiliado a WHERE a.aflApellido = :aflApellido"),
    @NamedQuery(name = "Afiliado.findByAflFechaIngreso", query = "SELECT a FROM Afiliado a WHERE a.aflFechaIngreso = :aflFechaIngreso"),
    @NamedQuery(name = "Afiliado.findByAflFechaNacimiento", query = "SELECT a FROM Afiliado a WHERE a.aflFechaNacimiento = :aflFechaNacimiento"),
    @NamedQuery(name = "Afiliado.findByAflNacionalidad", query = "SELECT a FROM Afiliado a WHERE a.aflNacionalidad = :aflNacionalidad"),
    @NamedQuery(name = "Afiliado.findByAflGenero", query = "SELECT a FROM Afiliado a WHERE a.aflGenero = :aflGenero"),
    @NamedQuery(name = "Afiliado.findByAflEstadoCivil", query = "SELECT a FROM Afiliado a WHERE a.aflEstadoCivil = :aflEstadoCivil"),
    @NamedQuery(name = "Afiliado.findByAflTelefono", query = "SELECT a FROM Afiliado a WHERE a.aflTelefono = :aflTelefono"),
    @NamedQuery(name = "Afiliado.findByAflDireccion", query = "SELECT a FROM Afiliado a WHERE a.aflDireccion = :aflDireccion"),
    @NamedQuery(name = "Afiliado.findByAflCiudad", query = "SELECT a FROM Afiliado a WHERE a.aflCiudad = :aflCiudad"),
    @NamedQuery(name = "Afiliado.findByAflRegion", query = "SELECT a FROM Afiliado a WHERE a.aflRegion = :aflRegion"),
    @NamedQuery(name = "Afiliado.findByAflPais", query = "SELECT a FROM Afiliado a WHERE a.aflPais = :aflPais"),
    @NamedQuery(name = "Afiliado.findByAflEmail", query = "SELECT a FROM Afiliado a WHERE a.aflEmail = :aflEmail"),
    @NamedQuery(name = "Afiliado.findByAflStatus", query = "SELECT a FROM Afiliado a WHERE a.aflStatus = :aflStatus")})
public class Afiliado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "afl_id", nullable = false)
    private Integer aflId;
    @Basic(optional = false)
    @Column(name = "afl_dni", nullable = false, length = 20)
    private String aflDni;
    @Basic(optional = false)
    @Column(name = "afl_tipo_dni", nullable = false, length = 20)
    private String aflTipoDni;
    @Basic(optional = false)
    @Column(name = "afl_nombre", nullable = false, length = 20)
    private String aflNombre;
    @Basic(optional = false)
    @Column(name = "afl_apellido", nullable = false, length = 20)
    private String aflApellido;
    @Basic(optional = false)
    @Column(name = "afl_fecha_ingreso", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date aflFechaIngreso;
    @Basic(optional = false)
    @Column(name = "afl_fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date aflFechaNacimiento;
    @Column(name = "afl_nacionalidad", length = 20)
    private String aflNacionalidad;
    @Basic(optional = false)
    @Column(name = "afl_genero", nullable = false)
    private char aflGenero;
    @Column(name = "afl_estado_civil", length = 20)
    private String aflEstadoCivil;
    @Basic(optional = false)
    @Column(name = "afl_telefono", nullable = false, length = 20)
    private String aflTelefono;
    @Basic(optional = false)
    @Column(name = "afl_direccion", nullable = false, length = 80)
    private String aflDireccion;
    @Basic(optional = false)
    @Column(name = "afl_ciudad", nullable = false, length = 40)
    private String aflCiudad;
    @Basic(optional = false)
    @Column(name = "afl_region", nullable = false, length = 40)
    private String aflRegion;
    @Basic(optional = false)
    @Column(name = "afl_pais", nullable = false, length = 40)
    private String aflPais;
    @Column(name = "afl_email", length = 40)
    private String aflEmail;
    @Basic(optional = false)
    @Column(name = "afl_status", nullable = false)
    private char aflStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "afiliado")
    private Collection<Factura> facturaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "afiliado")
    private Collection<Dependiente> dependienteCollection;
    @JoinColumn(name = "pln_id", referencedColumnName = "pln_id", nullable = false)
    @ManyToOne(optional = false)
    private Plan plan;
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
    @ManyToOne
    private Empresa empresa;

    public Afiliado() {
    }

    public Afiliado(Integer aflId) {
        this.aflId = aflId;
    }

    public Afiliado(Integer aflId, String aflDni, String aflTipoDni, String aflNombre, String aflApellido, Date aflFechaIngreso, Date aflFechaNacimiento, char aflGenero, String aflTelefono, String aflDireccion, String aflCiudad, String aflRegion, String aflPais, char aflStatus) {
        this.aflId = aflId;
        this.aflDni = aflDni;
        this.aflTipoDni = aflTipoDni;
        this.aflNombre = aflNombre;
        this.aflApellido = aflApellido;
        this.aflFechaIngreso = aflFechaIngreso;
        this.aflFechaNacimiento = aflFechaNacimiento;
        this.aflGenero = aflGenero;
        this.aflTelefono = aflTelefono;
        this.aflDireccion = aflDireccion;
        this.aflCiudad = aflCiudad;
        this.aflRegion = aflRegion;
        this.aflPais = aflPais;
        this.aflStatus = aflStatus;
    }

    public Afiliado(String aflDni, String aflTipoDni, String aflNombre, String aflApellido, Date aflFechaIngreso, Date aflFechaNacimiento, char aflGenero, String aflTelefono, String aflDireccion, String aflCiudad, String aflRegion, String aflPais, char aflStatus) {
        this.aflDni = aflDni;
        this.aflTipoDni = aflTipoDni;
        this.aflNombre = aflNombre;
        this.aflApellido = aflApellido;
        this.aflFechaIngreso = aflFechaIngreso;
        this.aflFechaNacimiento = aflFechaNacimiento;
        this.aflGenero = aflGenero;
        this.aflTelefono = aflTelefono;
        this.aflDireccion = aflDireccion;
        this.aflCiudad = aflCiudad;
        this.aflRegion = aflRegion;
        this.aflPais = aflPais;
        this.aflStatus = aflStatus;
    }

    public Integer getAflId() {
        return aflId;
    }

    public void setAflId(Integer aflId) {
        this.aflId = aflId;
    }

    public String getAflDni() {
        return aflDni;
    }

    public void setAflDni(String aflDni) {
        this.aflDni = aflDni;
    }

    public String getAflTipoDni() {
        return aflTipoDni;
    }

    public void setAflTipoDni(String aflTipoDni) {
        this.aflTipoDni = aflTipoDni;
    }

    public String getAflNombre() {
        return aflNombre;
    }

    public void setAflNombre(String aflNombre) {
        this.aflNombre = aflNombre;
    }

    public String getAflApellido() {
        return aflApellido;
    }

    public void setAflApellido(String aflApellido) {
        this.aflApellido = aflApellido;
    }

    public Date getAflFechaIngreso() {
        return aflFechaIngreso;
    }

    public void setAflFechaIngreso(Date aflFechaIngreso) {
        this.aflFechaIngreso = aflFechaIngreso;
    }

    public Date getAflFechaNacimiento() {
        return aflFechaNacimiento;
    }

    public void setAflFechaNacimiento(Date aflFechaNacimiento) {
        this.aflFechaNacimiento = aflFechaNacimiento;
    }

    public String getAflNacionalidad() {
        return aflNacionalidad;
    }

    public void setAflNacionalidad(String aflNacionalidad) {
        this.aflNacionalidad = aflNacionalidad;
    }

    public char getAflGenero() {
        return aflGenero;
    }

    public void setAflGenero(char aflGenero) {
        this.aflGenero = aflGenero;
    }

    public String getAflEstadoCivil() {
        return aflEstadoCivil;
    }

    public void setAflEstadoCivil(String aflEstadoCivil) {
        this.aflEstadoCivil = aflEstadoCivil;
    }

    public String getAflTelefono() {
        return aflTelefono;
    }

    public void setAflTelefono(String aflTelefono) {
        this.aflTelefono = aflTelefono;
    }

    public String getAflDireccion() {
        return aflDireccion;
    }

    public void setAflDireccion(String aflDireccion) {
        this.aflDireccion = aflDireccion;
    }

    public String getAflCiudad() {
        return aflCiudad;
    }

    public void setAflCiudad(String aflCiudad) {
        this.aflCiudad = aflCiudad;
    }

    public String getAflRegion() {
        return aflRegion;
    }

    public void setAflRegion(String aflRegion) {
        this.aflRegion = aflRegion;
    }

    public String getAflPais() {
        return aflPais;
    }

    public void setAflPais(String aflPais) {
        this.aflPais = aflPais;
    }

    public String getAflEmail() {
        return aflEmail;
    }

    public void setAflEmail(String aflEmail) {
        this.aflEmail = aflEmail;
    }

    public char getAflStatus() {
        return aflStatus;
    }

    public void setAflStatus(char aflStatus) {
        this.aflStatus = aflStatus;
    }

    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    public Collection<Dependiente> getDependienteCollection() {
        return dependienteCollection;
    }

    public void setDependienteCollection(Collection<Dependiente> dependienteCollection) {
        this.dependienteCollection = dependienteCollection;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aflId != null ? aflId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afiliado)) {
            return false;
        }
        Afiliado other = (Afiliado) object;
        if ((this.aflId == null && other.aflId != null) || (this.aflId != null && !this.aflId.equals(other.aflId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Afiliado[aflId=" + aflId + "]";
    }

}
