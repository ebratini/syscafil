/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Empresas", catalog = "SYSCAFIL_DB", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"emp_dni"})})
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByEmpId", query = "SELECT e FROM Empresa e WHERE e.empId = :empId"),
    @NamedQuery(name = "Empresa.findByEmpRazonSocial", query = "SELECT e FROM Empresa e WHERE e.empRazonSocial = :empRazonSocial"),
    @NamedQuery(name = "Empresa.findByEmpDni", query = "SELECT e FROM Empresa e WHERE e.empDni = :empDni"),
    @NamedQuery(name = "Empresa.findByEmpTipoDni", query = "SELECT e FROM Empresa e WHERE e.empTipoDni = :empTipoDni"),
    @NamedQuery(name = "Empresa.findByEmpContacto", query = "SELECT e FROM Empresa e WHERE e.empContacto = :empContacto"),
    @NamedQuery(name = "Empresa.findByEmpTelefono", query = "SELECT e FROM Empresa e WHERE e.empTelefono = :empTelefono"),
    @NamedQuery(name = "Empresa.findByEmpFax", query = "SELECT e FROM Empresa e WHERE e.empFax = :empFax"),
    @NamedQuery(name = "Empresa.findByEmpDireccion", query = "SELECT e FROM Empresa e WHERE e.empDireccion = :empDireccion"),
    @NamedQuery(name = "Empresa.findByEmpCiudad", query = "SELECT e FROM Empresa e WHERE e.empCiudad = :empCiudad"),
    @NamedQuery(name = "Empresa.findByEmpRegion", query = "SELECT e FROM Empresa e WHERE e.empRegion = :empRegion"),
    @NamedQuery(name = "Empresa.findByEmpPais", query = "SELECT e FROM Empresa e WHERE e.empPais = :empPais"),
    @NamedQuery(name = "Empresa.findByEmpEmail", query = "SELECT e FROM Empresa e WHERE e.empEmail = :empEmail"),
    @NamedQuery(name = "Empresa.findByEmpWeb", query = "SELECT e FROM Empresa e WHERE e.empWeb = :empWeb"),
    @NamedQuery(name = "Empresa.findByEmpStatus", query = "SELECT e FROM Empresa e WHERE e.empStatus = :empStatus")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_id", nullable = false)
    private Integer empId;
    @Basic(optional = false)
    @Column(name = "emp_razon_social", nullable = false, length = 40)
    private String empRazonSocial;
    @Basic(optional = false)
    @Column(name = "emp_dni", nullable = false, length = 10)
    private String empDni;
    @Basic(optional = false)
    @Column(name = "emp_tipo_dni", nullable = false, length = 20)
    private String empTipoDni;
    @Basic(optional = false)
    @Column(name = "emp_contacto", nullable = false, length = 40)
    private String empContacto;
    @Basic(optional = false)
    @Column(name = "emp_telefono", nullable = false, length = 10)
    private String empTelefono;
    @Column(name = "emp_fax", length = 10)
    private String empFax;
    @Basic(optional = false)
    @Column(name = "emp_direccion", nullable = false, length = 40)
    private String empDireccion;
    @Basic(optional = false)
    @Column(name = "emp_ciudad", nullable = false, length = 40)
    private String empCiudad;
    @Basic(optional = false)
    @Column(name = "emp_region", nullable = false, length = 40)
    private String empRegion;
    @Basic(optional = false)
    @Column(name = "emp_pais", nullable = false, length = 40)
    private String empPais;
    @Column(name = "emp_email", length = 20)
    private String empEmail;
    @Column(name = "emp_web", length = 20)
    private String empWeb;
    @Basic(optional = false)
    @Column(name = "emp_status", nullable = false)
    private char empStatus;
    @OneToMany(mappedBy = "empresa")
    private Collection<Afiliado> afiliadoCollection;

    public Empresa() {
    }

    public Empresa(Integer empId) {
        this.empId = empId;
    }

    public Empresa(Integer empId, String empRazonSocial, String empDni, String empTipoDni, String empContacto, String empTelefono, String empDireccion, String empCiudad, String empRegion, String empPais, char empStatus) {
        this.empId = empId;
        this.empRazonSocial = empRazonSocial;
        this.empDni = empDni;
        this.empTipoDni = empTipoDni;
        this.empContacto = empContacto;
        this.empTelefono = empTelefono;
        this.empDireccion = empDireccion;
        this.empCiudad = empCiudad;
        this.empRegion = empRegion;
        this.empPais = empPais;
        this.empStatus = empStatus;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(String empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public String getEmpDni() {
        return empDni;
    }

    public void setEmpDni(String empDni) {
        this.empDni = empDni;
    }

    public String getEmpTipoDni() {
        return empTipoDni;
    }

    public void setEmpTipoDni(String empTipoDni) {
        this.empTipoDni = empTipoDni;
    }

    public String getEmpContacto() {
        return empContacto;
    }

    public void setEmpContacto(String empContacto) {
        this.empContacto = empContacto;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public String getEmpFax() {
        return empFax;
    }

    public void setEmpFax(String empFax) {
        this.empFax = empFax;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpCiudad() {
        return empCiudad;
    }

    public void setEmpCiudad(String empCiudad) {
        this.empCiudad = empCiudad;
    }

    public String getEmpRegion() {
        return empRegion;
    }

    public void setEmpRegion(String empRegion) {
        this.empRegion = empRegion;
    }

    public String getEmpPais() {
        return empPais;
    }

    public void setEmpPais(String empPais) {
        this.empPais = empPais;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpWeb() {
        return empWeb;
    }

    public void setEmpWeb(String empWeb) {
        this.empWeb = empWeb;
    }

    public char getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(char empStatus) {
        this.empStatus = empStatus;
    }

    public Collection<Afiliado> getAfiliadoCollection() {
        return afiliadoCollection;
    }

    public void setAfiliadoCollection(Collection<Afiliado> afiliadoCollection) {
        this.afiliadoCollection = afiliadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Empresa[empId=" + empId + "]";
    }

}
