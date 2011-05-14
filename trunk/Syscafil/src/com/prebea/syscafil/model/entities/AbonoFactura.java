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
import java.math.BigDecimal;
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

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Abono_Facturas", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "AbonoFactura.findAll", query = "SELECT a FROM AbonoFactura a"),
    @NamedQuery(name = "AbonoFactura.findByAbfId", query = "SELECT a FROM AbonoFactura a WHERE a.abfId = :abfId"),
    @NamedQuery(name = "AbonoFactura.findByAbfFechaAbonoFactura", query = "SELECT a FROM AbonoFactura a WHERE a.abfFechaAbonoFactura = :abfFechaAbonoFactura"),
    @NamedQuery(name = "AbonoFactura.findByAbfPorcientoInteres", query = "SELECT a FROM AbonoFactura a WHERE a.abfPorcientoInteres = :abfPorcientoInteres"),
    @NamedQuery(name = "AbonoFactura.findByAbfMontoInteres", query = "SELECT a FROM AbonoFactura a WHERE a.abfMontoInteres = :abfMontoInteres"),
    @NamedQuery(name = "AbonoFactura.findByAbfBalanceAnterior", query = "SELECT a FROM AbonoFactura a WHERE a.abfBalanceAnterior = :abfBalanceAnterior"),
    @NamedQuery(name = "AbonoFactura.findByAbfMontoAbonar", query = "SELECT a FROM AbonoFactura a WHERE a.abfMontoAbonar = :abfMontoAbonar"),
    @NamedQuery(name = "AbonoFactura.findByAbfBalanceActual", query = "SELECT a FROM AbonoFactura a WHERE a.abfBalanceActual = :abfBalanceActual")})
public class AbonoFactura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "abf_id", nullable = false)
    private Integer abfId;
    @Basic(optional = false)
    @Column(name = "abf_fecha_abono_factura", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date abfFechaAbonoFactura;
    @Basic(optional = false)
    @Column(name = "abf_porciento_interes", nullable = false, precision = 5, scale = 2)
    private BigDecimal abfPorcientoInteres;
    @Basic(optional = false)
    @Column(name = "abf_monto_interes", nullable = false, precision = 10, scale = 2)
    private BigDecimal abfMontoInteres;
    @Basic(optional = false)
    @Column(name = "abf_balance_anterior", nullable = false, precision = 10, scale = 2)
    private BigDecimal abfBalanceAnterior;
    @Basic(optional = false)
    @Column(name = "abf_monto_abonar", nullable = false, precision = 10, scale = 2)
    private BigDecimal abfMontoAbonar;
    @Basic(optional = false)
    @Column(name = "abf_balance_actual", nullable = false, precision = 10, scale = 2)
    private BigDecimal abfBalanceActual;
    @JoinColumn(name = "fac_no", referencedColumnName = "fac_no", nullable = false)
    @ManyToOne(optional = false)
    private Factura factura;

    public AbonoFactura() {
    }

    public AbonoFactura(Integer abfId) {
        this.abfId = abfId;
    }

    public AbonoFactura(Integer abfId, Date abfFechaAbonoFactura, BigDecimal abfPorcientoInteres, BigDecimal abfMontoInteres, BigDecimal abfBalanceAnterior, BigDecimal abfMontoAbonar, BigDecimal abfBalanceActual) {
        this.abfId = abfId;
        this.abfFechaAbonoFactura = abfFechaAbonoFactura;
        this.abfPorcientoInteres = abfPorcientoInteres;
        this.abfMontoInteres = abfMontoInteres;
        this.abfBalanceAnterior = abfBalanceAnterior;
        this.abfMontoAbonar = abfMontoAbonar;
        this.abfBalanceActual = abfBalanceActual;
    }

    public Integer getAbfId() {
        return abfId;
    }

    public void setAbfId(Integer abfId) {
        this.abfId = abfId;
    }

    public Date getAbfFechaAbonoFactura() {
        return abfFechaAbonoFactura;
    }

    public void setAbfFechaAbonoFactura(Date abfFechaAbonoFactura) {
        this.abfFechaAbonoFactura = abfFechaAbonoFactura;
    }

    public BigDecimal getAbfPorcientoInteres() {
        return abfPorcientoInteres;
    }

    public void setAbfPorcientoInteres(BigDecimal abfPorcientoInteres) {
        this.abfPorcientoInteres = abfPorcientoInteres;
    }

    public BigDecimal getAbfMontoInteres() {
        return abfMontoInteres;
    }

    public void setAbfMontoInteres(BigDecimal abfMontoInteres) {
        this.abfMontoInteres = abfMontoInteres;
    }

    public BigDecimal getAbfBalanceAnterior() {
        return abfBalanceAnterior;
    }

    public void setAbfBalanceAnterior(BigDecimal abfBalanceAnterior) {
        this.abfBalanceAnterior = abfBalanceAnterior;
    }

    public BigDecimal getAbfMontoAbonar() {
        return abfMontoAbonar;
    }

    public void setAbfMontoAbonar(BigDecimal abfMontoAbonar) {
        this.abfMontoAbonar = abfMontoAbonar;
    }

    public BigDecimal getAbfBalanceActual() {
        return abfBalanceActual;
    }

    public void setAbfBalanceActual(BigDecimal abfBalanceActual) {
        this.abfBalanceActual = abfBalanceActual;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abfId != null ? abfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbonoFactura)) {
            return false;
        }
        AbonoFactura other = (AbonoFactura) object;
        if ((this.abfId == null && other.abfId != null) || (this.abfId != null && !this.abfId.equals(other.abfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.AbonoFactura[abfId=" + abfId + "]";
    }

}
