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

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Facturaciones", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f"),
    @NamedQuery(name = "Facturacion.findByFcnId", query = "SELECT f FROM Facturacion f WHERE f.fcnId = :fcnId"),
    @NamedQuery(name = "Facturacion.findByFcnFechaFacturacion", query = "SELECT f FROM Facturacion f WHERE f.fcnFechaFacturacion = :fcnFechaFacturacion"),
    @NamedQuery(name = "Facturacion.findByFcnDiasLimiteSaldo", query = "SELECT f FROM Facturacion f WHERE f.fcnDiasLimiteSaldo = :fcnDiasLimiteSaldo"),
    @NamedQuery(name = "Facturacion.findByFcnFechaLimitePago", query = "SELECT f FROM Facturacion f WHERE f.fcnFechaLimitePago = :fcnFechaLimitePago"),
    @NamedQuery(name = "Facturacion.findByFcnAfiliadosFacturados", query = "SELECT f FROM Facturacion f WHERE f.fcnAfiliadosFacturados = :fcnAfiliadosFacturados"),
    @NamedQuery(name = "Facturacion.findByFcnFacturasGeneradas", query = "SELECT f FROM Facturacion f WHERE f.fcnFacturasGeneradas = :fcnFacturasGeneradas"),
    @NamedQuery(name = "Facturacion.findByFcnImporteFacturasGeneradas", query = "SELECT f FROM Facturacion f WHERE f.fcnImporteFacturasGeneradas = :fcnImporteFacturasGeneradas"),
    @NamedQuery(name = "Facturacion.findByFcnStatusFacturacion", query = "SELECT f FROM Facturacion f WHERE f.fcnStatusFacturacion = :fcnStatusFacturacion")})
public class Facturacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "fcn_id", nullable = false)
    private Integer fcnId;
    @Basic(optional = false)
    @Column(name = "fcn_fecha_facturacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcnFechaFacturacion;
    @Basic(optional = false)
    @Column(name = "fcn_dias_limite_saldo", nullable = false)
    private int fcnDiasLimiteSaldo;
    @Basic(optional = false)
    @Column(name = "fcn_fecha_limite_pago", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcnFechaLimitePago;
    @Basic(optional = false)
    @Column(name = "fcn_afiliados_facturados", nullable = false)
    private int fcnAfiliadosFacturados;
    @Basic(optional = false)
    @Column(name = "fcn_facturas_generadas", nullable = false)
    private int fcnFacturasGeneradas;
    @Basic(optional = false)
    @Column(name = "fcn_importe_facturas_generadas", nullable = false, precision = 10, scale = 2)
    private BigDecimal fcnImporteFacturasGeneradas;
    @Basic(optional = false)
    @Column(name = "fcn_status_facturacion", nullable = false, length = 200)
    private String fcnStatusFacturacion;
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id", nullable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Facturacion() {
    }

    public Facturacion(Integer fcnId) {
        this.fcnId = fcnId;
    }

    public Facturacion(Integer fcnId, Date fcnFechaFacturacion, int fcnDiasLimiteSaldo, Date fcnFechaLimitePago, int fcnAfiliadosFacturados, int fcnFacturasGeneradas, BigDecimal fcnImporteFacturasGeneradas, String fcnStatusFacturacion) {
        this.fcnId = fcnId;
        this.fcnFechaFacturacion = fcnFechaFacturacion;
        this.fcnDiasLimiteSaldo = fcnDiasLimiteSaldo;
        this.fcnFechaLimitePago = fcnFechaLimitePago;
        this.fcnAfiliadosFacturados = fcnAfiliadosFacturados;
        this.fcnFacturasGeneradas = fcnFacturasGeneradas;
        this.fcnImporteFacturasGeneradas = fcnImporteFacturasGeneradas;
        this.fcnStatusFacturacion = fcnStatusFacturacion;
    }

    public Facturacion(Date fcnFechaFacturacion, int fcnDiasLimiteSaldo, Date fcnFechaLimitePago, int fcnAfiliadosFacturados, int fcnFacturasGeneradas, BigDecimal fcnImporteFacturasGeneradas, String fcnStatusFacturacion) {
        this.fcnFechaFacturacion = fcnFechaFacturacion;
        this.fcnDiasLimiteSaldo = fcnDiasLimiteSaldo;
        this.fcnFechaLimitePago = fcnFechaLimitePago;
        this.fcnAfiliadosFacturados = fcnAfiliadosFacturados;
        this.fcnFacturasGeneradas = fcnFacturasGeneradas;
        this.fcnImporteFacturasGeneradas = fcnImporteFacturasGeneradas;
        this.fcnStatusFacturacion = fcnStatusFacturacion;
    }

    public Integer getFcnId() {
        return fcnId;
    }

    public void setFcnId(Integer fcnId) {
        this.fcnId = fcnId;
    }

    public Date getFcnFechaFacturacion() {
        return fcnFechaFacturacion;
    }

    public void setFcnFechaFacturacion(Date fcnFechaFacturacion) {
        this.fcnFechaFacturacion = fcnFechaFacturacion;
    }

    public int getFcnDiasLimiteSaldo() {
        return fcnDiasLimiteSaldo;
    }

    public void setFcnDiasLimiteSaldo(int fcnDiasLimiteSaldo) {
        this.fcnDiasLimiteSaldo = fcnDiasLimiteSaldo;
    }

    public Date getFcnFechaLimitePago() {
        return fcnFechaLimitePago;
    }

    public void setFcnFechaLimitePago(Date fcnFechaLimitePago) {
        this.fcnFechaLimitePago = fcnFechaLimitePago;
    }

    public int getFcnAfiliadosFacturados() {
        return fcnAfiliadosFacturados;
    }

    public void setFcnAfiliadosFacturados(int fcnAfiliadosFacturados) {
        this.fcnAfiliadosFacturados = fcnAfiliadosFacturados;
    }

    public int getFcnFacturasGeneradas() {
        return fcnFacturasGeneradas;
    }

    public void setFcnFacturasGeneradas(int fcnFacturasGeneradas) {
        this.fcnFacturasGeneradas = fcnFacturasGeneradas;
    }

    public BigDecimal getFcnImporteFacturasGeneradas() {
        return fcnImporteFacturasGeneradas;
    }

    public void setFcnImporteFacturasGeneradas(BigDecimal fcnImporteFacturasGeneradas) {
        this.fcnImporteFacturasGeneradas = fcnImporteFacturasGeneradas;
    }

    public String getFcnStatusFacturacion() {
        return fcnStatusFacturacion;
    }

    public void setFcnStatusFacturacion(String fcnStatusFacturacion) {
        this.fcnStatusFacturacion = fcnStatusFacturacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fcnId != null ? fcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.fcnId == null && other.fcnId != null) || (this.fcnId != null && !this.fcnId.equals(other.fcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Facturacion[fcnId=" + fcnId + "]";
    }

}
