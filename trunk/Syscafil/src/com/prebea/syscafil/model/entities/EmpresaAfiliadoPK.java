/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Embeddable
public class EmpresaAfiliadoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "afl_id", nullable = false)
    private int aflId;
    @Basic(optional = false)
    @Column(name = "emp_id", nullable = false)
    private int empId;

    public EmpresaAfiliadoPK() {
    }

    public EmpresaAfiliadoPK(int aflId, int empId) {
        this.aflId = aflId;
        this.empId = empId;
    }

    public int getAflId() {
        return aflId;
    }

    public void setAflId(int aflId) {
        this.aflId = aflId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) aflId;
        hash += (int) empId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaAfiliadoPK)) {
            return false;
        }
        EmpresaAfiliadoPK other = (EmpresaAfiliadoPK) object;
        if (this.aflId != other.aflId) {
            return false;
        }
        if (this.empId != other.empId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.EmpresaAfiliadoPK[aflId=" + aflId + ", empId=" + empId + "]";
    }

}
