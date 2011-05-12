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
import java.math.BigDecimal;
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

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
@Entity
@Table(name = "Planes", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Plan.findAll", query = "SELECT p FROM Plan p"),
    @NamedQuery(name = "Plan.findByPlnId", query = "SELECT p FROM Plan p WHERE p.plnId = :plnId"),
    @NamedQuery(name = "Plan.findByPlnNombre", query = "SELECT p FROM Plan p WHERE p.plnNombre = :plnNombre"),
    @NamedQuery(name = "Plan.findByPlnDescripcion", query = "SELECT p FROM Plan p WHERE p.plnDescripcion = :plnDescripcion"),
    @NamedQuery(name = "Plan.findByPlnPrecio", query = "SELECT p FROM Plan p WHERE p.plnPrecio = :plnPrecio"),
    @NamedQuery(name = "Plan.findByPlnPrecioDependienteExtra", query = "SELECT p FROM Plan p WHERE p.plnPrecioDependienteExtra = :plnPrecioDependienteExtra"),
    @NamedQuery(name = "Plan.findByPlnStatus", query = "SELECT p FROM Plan p WHERE p.plnStatus = :plnStatus"),
    @NamedQuery(name = "Plan.findByPlnUpdateBy", query = "SELECT p FROM Plan p WHERE p.plnUpdateBy = :plnUpdateBy"),
    @NamedQuery(name = "Plan.findByPlnUpdateDate", query = "SELECT p FROM Plan p WHERE p.plnUpdateDate = :plnUpdateDate")})
public class Plan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "pln_id", nullable = false)
    private Integer plnId;
    @Basic(optional = false)
    @Column(name = "pln_nombre", nullable = false, length = 20)
    private String plnNombre;
    @Basic(optional = false)
    @Column(name = "pln_descripcion", nullable = false, length = 80)
    private String plnDescripcion;
    @Basic(optional = false)
    @Column(name = "pln_precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal plnPrecio;
    @Basic(optional = false)
    @Column(name = "pln_precio_dependiente_extra", nullable = false, precision = 10, scale = 2)
    private BigDecimal plnPrecioDependienteExtra;
    @Basic(optional = false)
    @Column(name = "pln_status", nullable = false)
    private char plnStatus;
    @Basic(optional = false)
    @Column(name = "pln_update_by", nullable = false, length = 40)
    private String plnUpdateBy;
    @Basic(optional = false)
    @Column(name = "pln_update_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date plnUpdateDate;
    @JoinColumn(name = "sup_id", referencedColumnName = "sup_id", nullable = false)
    @ManyToOne(optional = false)
    private SubcategoriaPlan subcategoriaPlan;
    @JoinColumn(name = "cap_id", referencedColumnName = "cap_id", nullable = false)
    @ManyToOne(optional = false)
    private CategoriaPlan categoriaPlan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Collection<Afiliado> afiliadoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Collection<Factura> facturaCollection;

    public Plan() {
    }

    public Plan(Integer plnId) {
        this.plnId = plnId;
    }

    public Plan(Integer plnId, String plnNombre, String plnDescripcion, BigDecimal plnPrecio, BigDecimal plnPrecioDependienteExtra, char plnStatus, String plnUpdateBy, Date plnUpdateDate) {
        this.plnId = plnId;
        this.plnNombre = plnNombre;
        this.plnDescripcion = plnDescripcion;
        this.plnPrecio = plnPrecio;
        this.plnPrecioDependienteExtra = plnPrecioDependienteExtra;
        this.plnStatus = plnStatus;
        this.plnUpdateBy = plnUpdateBy;
        this.plnUpdateDate = plnUpdateDate;
    }

    public Plan(String plnNombre, String plnDescripcion, BigDecimal plnPrecio, BigDecimal plnPrecioDependienteExtra, char plnStatus, String plnUpdateBy, Date plnUpdateDate) {
        this.plnNombre = plnNombre;
        this.plnDescripcion = plnDescripcion;
        this.plnPrecio = plnPrecio;
        this.plnPrecioDependienteExtra = plnPrecioDependienteExtra;
        this.plnStatus = plnStatus;
        this.plnUpdateBy = plnUpdateBy;
        this.plnUpdateDate = plnUpdateDate;
    }

    public Integer getPlnId() {
        return plnId;
    }

    public void setPlnId(Integer plnId) {
        this.plnId = plnId;
    }

    public String getPlnNombre() {
        return plnNombre;
    }

    public void setPlnNombre(String plnNombre) {
        this.plnNombre = plnNombre;
    }

    public String getPlnDescripcion() {
        return plnDescripcion;
    }

    public void setPlnDescripcion(String plnDescripcion) {
        this.plnDescripcion = plnDescripcion;
    }

    public BigDecimal getPlnPrecio() {
        return plnPrecio;
    }

    public void setPlnPrecio(BigDecimal plnPrecio) {
        this.plnPrecio = plnPrecio;
    }

    public BigDecimal getPlnPrecioDependienteExtra() {
        return plnPrecioDependienteExtra;
    }

    public void setPlnPrecioDependienteExtra(BigDecimal plnPrecioDependienteExtra) {
        this.plnPrecioDependienteExtra = plnPrecioDependienteExtra;
    }

    public char getPlnStatus() {
        return plnStatus;
    }

    public void setPlnStatus(char plnStatus) {
        this.plnStatus = plnStatus;
    }

    public String getPlnUpdateBy() {
        return plnUpdateBy;
    }

    public void setPlnUpdateBy(String plnUpdateBy) {
        this.plnUpdateBy = plnUpdateBy;
    }

    public Date getPlnUpdateDate() {
        return plnUpdateDate;
    }

    public void setPlnUpdateDate(Date plnUpdateDate) {
        this.plnUpdateDate = plnUpdateDate;
    }

    public SubcategoriaPlan getSubcategoriaPlan() {
        return subcategoriaPlan;
    }

    public void setSubcategoriaPlan(SubcategoriaPlan subcategoriaPlan) {
        this.subcategoriaPlan = subcategoriaPlan;
    }

    public CategoriaPlan getCategoriaPlan() {
        return categoriaPlan;
    }

    public void setCategoriaPlan(CategoriaPlan categoriaPlan) {
        this.categoriaPlan = categoriaPlan;
    }

    public Collection<Afiliado> getAfiliadoCollection() {
        return afiliadoCollection;
    }

    public void setAfiliadoCollection(Collection<Afiliado> afiliadoCollection) {
        this.afiliadoCollection = afiliadoCollection;
    }

    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plnId != null ? plnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.plnId == null && other.plnId != null) || (this.plnId != null && !this.plnId.equals(other.plnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Plan[plnId=" + plnId + "]";
    }

}
