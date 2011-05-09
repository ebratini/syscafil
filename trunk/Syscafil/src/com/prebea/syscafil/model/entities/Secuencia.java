/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini.
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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Secuencias", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Secuencia.findAll", query = "SELECT s FROM Secuencia s"),
    @NamedQuery(name = "Secuencia.findBySecId", query = "SELECT s FROM Secuencia s WHERE s.secId = :secId"),
    @NamedQuery(name = "Secuencia.findBySecIncremento", query = "SELECT s FROM Secuencia s WHERE s.secIncremento = :secIncremento"),
    @NamedQuery(name = "Secuencia.findBySecInicio", query = "SELECT s FROM Secuencia s WHERE s.secInicio = :secInicio"),
    @NamedQuery(name = "Secuencia.findBySecActual", query = "SELECT s FROM Secuencia s WHERE s.secActual = :secActual"),
    @NamedQuery(name = "Secuencia.findBySecUpdateBy", query = "SELECT s FROM Secuencia s WHERE s.secUpdateBy = :secUpdateBy"),
    @NamedQuery(name = "Secuencia.findBySecUpdateDate", query = "SELECT s FROM Secuencia s WHERE s.secUpdateDate = :secUpdateDate")})
public class Secuencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sec_id", nullable = false)
    private Integer secId;
    @Basic(optional = false)
    @Column(name = "sec_incremento", nullable = false)
    private int secIncremento;
    @Basic(optional = false)
    @Column(name = "sec_inicio", nullable = false)
    private int secInicio;
    @Basic(optional = false)
    @Column(name = "sec_actual", nullable = false)
    private int secActual;
    @Basic(optional = false)
    @Column(name = "sec_update_by", nullable = false, length = 40)
    private String secUpdateBy;
    @Basic(optional = false)
    @Column(name = "sec_update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date secUpdateDate;

    public Secuencia() {
    }

    public Secuencia(Integer secId) {
        this.secId = secId;
    }

    public Secuencia(Integer secId, int secIncremento, int secInicio, int secActual, String secUpdateBy, Date secUpdateDate) {
        this.secId = secId;
        this.secIncremento = secIncremento;
        this.secInicio = secInicio;
        this.secActual = secActual;
        this.secUpdateBy = secUpdateBy;
        this.secUpdateDate = secUpdateDate;
    }

    public Integer getSecId() {
        return secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    public int getSecIncremento() {
        return secIncremento;
    }

    public void setSecIncremento(int secIncremento) {
        this.secIncremento = secIncremento;
    }

    public int getSecInicio() {
        return secInicio;
    }

    public void setSecInicio(int secInicio) {
        this.secInicio = secInicio;
    }

    public int getSecActual() {
        return secActual;
    }

    public void setSecActual(int secActual) {
        this.secActual = secActual;
    }

    public String getSecUpdateBy() {
        return secUpdateBy;
    }

    public void setSecUpdateBy(String secUpdateBy) {
        this.secUpdateBy = secUpdateBy;
    }

    public Date getSecUpdateDate() {
        return secUpdateDate;
    }

    public void setSecUpdateDate(Date secUpdateDate) {
        this.secUpdateDate = secUpdateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secId != null ? secId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secuencia)) {
            return false;
        }
        Secuencia other = (Secuencia) object;
        if ((this.secId == null && other.secId != null) || (this.secId != null && !this.secId.equals(other.secId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Secuencia[secId=" + secId + "]";
    }

}
