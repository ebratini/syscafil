/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Edwin Bratini
 */
@Entity
@Table(name = "Empresas_Afiliados", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "EmpresaAfiliado.findAll", query = "SELECT e FROM EmpresaAfiliado e"),
    @NamedQuery(name = "EmpresaAfiliado.findByAflId", query = "SELECT e FROM EmpresaAfiliado e WHERE e.empresaAfiliadoPK.aflId = :aflId"),
    @NamedQuery(name = "EmpresaAfiliado.findByEmpId", query = "SELECT e FROM EmpresaAfiliado e WHERE e.empresaAfiliadoPK.empId = :empId"),
    @NamedQuery(name = "EmpresaAfiliado.findByEmaPosicion", query = "SELECT e FROM EmpresaAfiliado e WHERE e.emaPosicion = :emaPosicion"),
    @NamedQuery(name = "EmpresaAfiliado.findByEmaDepartamento", query = "SELECT e FROM EmpresaAfiliado e WHERE e.emaDepartamento = :emaDepartamento")})
public class EmpresaAfiliado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpresaAfiliadoPK empresaAfiliadoPK;
    @Basic(optional = false)
    @Column(name = "ema_posicion", nullable = false, length = 10)
    private String emaPosicion;
    @Basic(optional = false)
    @Column(name = "ema_departamento", nullable = false, length = 10)
    private String emaDepartamento;
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Empresa empresa;
    @JoinColumn(name = "afl_id", referencedColumnName = "afl_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Afiliado afiliado;

    public EmpresaAfiliado() {
    }

    public EmpresaAfiliado(EmpresaAfiliadoPK empresaAfiliadoPK) {
        this.empresaAfiliadoPK = empresaAfiliadoPK;
    }

    public EmpresaAfiliado(EmpresaAfiliadoPK empresaAfiliadoPK, String emaPosicion, String emaDepartamento) {
        this.empresaAfiliadoPK = empresaAfiliadoPK;
        this.emaPosicion = emaPosicion;
        this.emaDepartamento = emaDepartamento;
    }

    public EmpresaAfiliado(int aflId, int empId) {
        this.empresaAfiliadoPK = new EmpresaAfiliadoPK(aflId, empId);
    }

    public EmpresaAfiliadoPK getEmpresaAfiliadoPK() {
        return empresaAfiliadoPK;
    }

    public void setEmpresaAfiliadoPK(EmpresaAfiliadoPK empresaAfiliadoPK) {
        this.empresaAfiliadoPK = empresaAfiliadoPK;
    }

    public String getEmaPosicion() {
        return emaPosicion;
    }

    public void setEmaPosicion(String emaPosicion) {
        this.emaPosicion = emaPosicion;
    }

    public String getEmaDepartamento() {
        return emaDepartamento;
    }

    public void setEmaDepartamento(String emaDepartamento) {
        this.emaDepartamento = emaDepartamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        hash += (empresaAfiliadoPK != null ? empresaAfiliadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaAfiliado)) {
            return false;
        }
        EmpresaAfiliado other = (EmpresaAfiliado) object;
        if ((this.empresaAfiliadoPK == null && other.empresaAfiliadoPK != null) || (this.empresaAfiliadoPK != null && !this.empresaAfiliadoPK.equals(other.empresaAfiliadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.EmpresaAfiliado[empresaAfiliadoPK=" + empresaAfiliadoPK + "]";
    }

}
