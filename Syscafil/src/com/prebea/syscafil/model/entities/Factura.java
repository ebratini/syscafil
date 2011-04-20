/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prebea.syscafil.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Facturas", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByFacNo", query = "SELECT f FROM Factura f WHERE f.facNo = :facNo"),
    @NamedQuery(name = "Factura.findByFacFechaGeneracionFactura", query = "SELECT f FROM Factura f WHERE f.facFechaGeneracionFactura = :facFechaGeneracionFactura"),
    @NamedQuery(name = "Factura.findByFacFechaLimitePago", query = "SELECT f FROM Factura f WHERE f.facFechaLimitePago = :facFechaLimitePago"),
    @NamedQuery(name = "Factura.findByFacPrecioUnitario", query = "SELECT f FROM Factura f WHERE f.facPrecioUnitario = :facPrecioUnitario"),
    @NamedQuery(name = "Factura.findByFacPrecioDependienteExtra", query = "SELECT f FROM Factura f WHERE f.facPrecioDependienteExtra = :facPrecioDependienteExtra"),
    @NamedQuery(name = "Factura.findByFacDescripcion", query = "SELECT f FROM Factura f WHERE f.facDescripcion = :facDescripcion"),
    @NamedQuery(name = "Factura.findByFacDescuento", query = "SELECT f FROM Factura f WHERE f.facDescuento = :facDescuento"),
    @NamedQuery(name = "Factura.findByFacImpuestos", query = "SELECT f FROM Factura f WHERE f.facImpuestos = :facImpuestos"),
    @NamedQuery(name = "Factura.findByFacSubtotal", query = "SELECT f FROM Factura f WHERE f.facSubtotal = :facSubtotal"),
    @NamedQuery(name = "Factura.findByFacImporteTotal", query = "SELECT f FROM Factura f WHERE f.facImporteTotal = :facImporteTotal"),
    @NamedQuery(name = "Factura.findByFacCargoA", query = "SELECT f FROM Factura f WHERE f.facCargoA = :facCargoA"),
    @NamedQuery(name = "Factura.findByFacFechaPagoFactura", query = "SELECT f FROM Factura f WHERE f.facFechaPagoFactura = :facFechaPagoFactura"),
    @NamedQuery(name = "Factura.findByFacMetodoPago", query = "SELECT f FROM Factura f WHERE f.facMetodoPago = :facMetodoPago"),
    @NamedQuery(name = "Factura.findByFacStatusFactura", query = "SELECT f FROM Factura f WHERE f.facStatusFactura = :facStatusFactura"),
    @NamedQuery(name = "Factura.findByFacRazonStatusFactura", query = "SELECT f FROM Factura f WHERE f.facRazonStatusFactura = :facRazonStatusFactura"),
    @NamedQuery(name = "Factura.findByFacUpdateBy", query = "SELECT f FROM Factura f WHERE f.facUpdateBy = :facUpdateBy"),
    @NamedQuery(name = "Factura.findByFacUpdateDate", query = "SELECT f FROM Factura f WHERE f.facUpdateDate = :facUpdateDate")})
public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fac_no", nullable = false)
    private Integer facNo;
    @Basic(optional = false)
    @Column(name = "fac_fecha_generacion_factura", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date facFechaGeneracionFactura;
    @Basic(optional = false)
    @Column(name = "fac_fecha_limite_pago", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date facFechaLimitePago;
    @Basic(optional = false)
    @Column(name = "fac_precio_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal facPrecioUnitario;
    @Basic(optional = false)
    @Column(name = "fac_precio_dependiente_extra", nullable = false, precision = 10, scale = 2)
    private BigDecimal facPrecioDependienteExtra;
    @Basic(optional = false)
    @Column(name = "fac_descripcion", nullable = false, length = 40)
    private String facDescripcion;
    @Basic(optional = false)
    @Column(name = "fac_descuento", nullable = false, precision = 10, scale = 2)
    private BigDecimal facDescuento;
    @Basic(optional = false)
    @Column(name = "fac_impuestos", nullable = false, precision = 10, scale = 2)
    private BigDecimal facImpuestos;
    @Basic(optional = false)
    @Column(name = "fac_subtotal", nullable = false, precision = 10, scale = 2)
    private BigDecimal facSubtotal;
    @Basic(optional = false)
    @Column(name = "fac_importe_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal facImporteTotal;
    @Basic(optional = false)
    @Column(name = "fac_cargo_a", nullable = false, length = 10)
    private String facCargoA;
    @Column(name = "fac_fecha_pago_factura")
    @Temporal(TemporalType.DATE)
    private Date facFechaPagoFactura;
    @Basic(optional = false)
    @Column(name = "fac_metodo_pago", nullable = false, length = 10)
    private String facMetodoPago;
    @Basic(optional = false)
    @Column(name = "fac_status_factura", nullable = false, length = 2)
    private String facStatusFactura;
    @Basic(optional = false)
    @Column(name = "fac_razon_status_factura", nullable = false, length = 10)
    private String facRazonStatusFactura;
    @Basic(optional = false)
    @Column(name = "fac_update_by", nullable = false, length = 10)
    private String facUpdateBy;
    @Basic(optional = false)
    @Column(name = "fac_update_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date facUpdateDate;
    @JoinColumn(name = "pln_id", referencedColumnName = "pln_id", nullable = false)
    @ManyToOne(optional = false)
    private Plan plan;
    @JoinColumn(name = "afl_id", referencedColumnName = "afl_id", nullable = false)
    @ManyToOne(optional = false)
    private Afiliado afiliado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
    private Collection<AbonoFactura> abonoFacturaCollection;

    public Factura() {
    }

    public Factura(Integer facNo) {
        this.facNo = facNo;
    }

    public Factura(Integer facNo, Date facFechaGeneracionFactura, Date facFechaLimitePago, BigDecimal facPrecioUnitario, BigDecimal facPrecioDependienteExtra, String facDescripcion, BigDecimal facDescuento, BigDecimal facImpuestos, BigDecimal facSubtotal, BigDecimal facImporteTotal, String facCargoA, String facMetodoPago, String facStatusFactura, String facRazonStatusFactura, String facUpdateBy, Date facUpdateDate) {
        this.facNo = facNo;
        this.facFechaGeneracionFactura = facFechaGeneracionFactura;
        this.facFechaLimitePago = facFechaLimitePago;
        this.facPrecioUnitario = facPrecioUnitario;
        this.facPrecioDependienteExtra = facPrecioDependienteExtra;
        this.facDescripcion = facDescripcion;
        this.facDescuento = facDescuento;
        this.facImpuestos = facImpuestos;
        this.facSubtotal = facSubtotal;
        this.facImporteTotal = facImporteTotal;
        this.facCargoA = facCargoA;
        this.facMetodoPago = facMetodoPago;
        this.facStatusFactura = facStatusFactura;
        this.facRazonStatusFactura = facRazonStatusFactura;
        this.facUpdateBy = facUpdateBy;
        this.facUpdateDate = facUpdateDate;
    }

    public Factura(Date facFechaGeneracionFactura, Date facFechaLimitePago, BigDecimal facPrecioUnitario, BigDecimal facPrecioDependienteExtra, String facDescripcion, BigDecimal facDescuento, BigDecimal facImpuestos, BigDecimal facSubtotal, BigDecimal facImporteTotal, String facCargoA, String facMetodoPago, String facStatusFactura, String facRazonStatusFactura, String facUpdateBy, Date facUpdateDate) {
        this.facFechaGeneracionFactura = facFechaGeneracionFactura;
        this.facFechaLimitePago = facFechaLimitePago;
        this.facPrecioUnitario = facPrecioUnitario;
        this.facPrecioDependienteExtra = facPrecioDependienteExtra;
        this.facDescripcion = facDescripcion;
        this.facDescuento = facDescuento;
        this.facImpuestos = facImpuestos;
        this.facSubtotal = facSubtotal;
        this.facImporteTotal = facImporteTotal;
        this.facCargoA = facCargoA;
        this.facMetodoPago = facMetodoPago;
        this.facStatusFactura = facStatusFactura;
        this.facRazonStatusFactura = facRazonStatusFactura;
        this.facUpdateBy = facUpdateBy;
        this.facUpdateDate = facUpdateDate;
    }

    public Integer getFacNo() {
        return facNo;
    }

    public void setFacNo(Integer facNo) {
        this.facNo = facNo;
    }

    public Date getFacFechaGeneracionFactura() {
        return facFechaGeneracionFactura;
    }

    public void setFacFechaGeneracionFactura(Date facFechaGeneracionFactura) {
        this.facFechaGeneracionFactura = facFechaGeneracionFactura;
    }

    public Date getFacFechaLimitePago() {
        return facFechaLimitePago;
    }

    public void setFacFechaLimitePago(Date facFechaLimitePago) {
        this.facFechaLimitePago = facFechaLimitePago;
    }

    public BigDecimal getFacPrecioUnitario() {
        return facPrecioUnitario;
    }

    public void setFacPrecioUnitario(BigDecimal facPrecioUnitario) {
        this.facPrecioUnitario = facPrecioUnitario;
    }

    public BigDecimal getFacPrecioDependienteExtra() {
        return facPrecioDependienteExtra;
    }

    public void setFacPrecioDependienteExtra(BigDecimal facPrecioDependienteExtra) {
        this.facPrecioDependienteExtra = facPrecioDependienteExtra;
    }

    public String getFacDescripcion() {
        return facDescripcion;
    }

    public void setFacDescripcion(String facDescripcion) {
        this.facDescripcion = facDescripcion;
    }

    public BigDecimal getFacDescuento() {
        return facDescuento;
    }

    public void setFacDescuento(BigDecimal facDescuento) {
        this.facDescuento = facDescuento;
    }

    public BigDecimal getFacImpuestos() {
        return facImpuestos;
    }

    public void setFacImpuestos(BigDecimal facImpuestos) {
        this.facImpuestos = facImpuestos;
    }

    public BigDecimal getFacSubtotal() {
        return facSubtotal;
    }

    public void setFacSubtotal(BigDecimal facSubtotal) {
        this.facSubtotal = facSubtotal;
    }

    public BigDecimal getFacImporteTotal() {
        return facImporteTotal;
    }

    public void setFacImporteTotal(BigDecimal facImporteTotal) {
        this.facImporteTotal = facImporteTotal;
    }

    public String getFacCargoA() {
        return facCargoA;
    }

    public void setFacCargoA(String facCargoA) {
        this.facCargoA = facCargoA;
    }

    public Date getFacFechaPagoFactura() {
        return facFechaPagoFactura;
    }

    public void setFacFechaPagoFactura(Date facFechaPagoFactura) {
        this.facFechaPagoFactura = facFechaPagoFactura;
    }

    public String getFacMetodoPago() {
        return facMetodoPago;
    }

    public void setFacMetodoPago(String facMetodoPago) {
        this.facMetodoPago = facMetodoPago;
    }

    public String getFacStatusFactura() {
        return facStatusFactura;
    }

    public void setFacStatusFactura(String facStatusFactura) {
        this.facStatusFactura = facStatusFactura;
    }

    public String getFacRazonStatusFactura() {
        return facRazonStatusFactura;
    }

    public void setFacRazonStatusFactura(String facRazonStatusFactura) {
        this.facRazonStatusFactura = facRazonStatusFactura;
    }

    public String getFacUpdateBy() {
        return facUpdateBy;
    }

    public void setFacUpdateBy(String facUpdateBy) {
        this.facUpdateBy = facUpdateBy;
    }

    public Date getFacUpdateDate() {
        return facUpdateDate;
    }

    public void setFacUpdateDate(Date facUpdateDate) {
        this.facUpdateDate = facUpdateDate;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Collection<AbonoFactura> getAbonoFacturaCollection() {
        return abonoFacturaCollection;
    }

    public void setAbonoFacturaCollection(Collection<AbonoFactura> abonoFacturaCollection) {
        this.abonoFacturaCollection = abonoFacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facNo != null ? facNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.facNo == null && other.facNo != null) || (this.facNo != null && !this.facNo.equals(other.facNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Factura[facNo=" + facNo + "]";
    }

}
