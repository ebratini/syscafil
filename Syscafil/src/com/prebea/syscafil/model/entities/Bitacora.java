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
@Table(name = "Bitacora", catalog = "SYSCAFIL_DB", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b"),
    @NamedQuery(name = "Bitacora.findByBitId", query = "SELECT b FROM Bitacora b WHERE b.bitId = :bitId"),
    @NamedQuery(name = "Bitacora.findByBitFecha", query = "SELECT b FROM Bitacora b WHERE b.bitFecha = :bitFecha"),
    @NamedQuery(name = "Bitacora.findByBitUsuario", query = "SELECT b FROM Bitacora b WHERE b.bitUsuario = :bitUsuario"),
    @NamedQuery(name = "Bitacora.findByBitFuente", query = "SELECT b FROM Bitacora b WHERE b.bitFuente = :bitFuente"),
    @NamedQuery(name = "Bitacora.findByBitCategoria", query = "SELECT b FROM Bitacora b WHERE b.bitCategoria = :bitCategoria"),
    @NamedQuery(name = "Bitacora.findByBitDescripcion", query = "SELECT b FROM Bitacora b WHERE b.bitDescripcion = :bitDescripcion")})
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "bit_id", nullable = false)
    private Integer bitId;
    @Basic(optional = false)
    @Column(name = "bit_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitFecha;
    @Basic(optional = false)
    @Column(name = "bit_usuario", nullable = false, length = 10)
    private String bitUsuario;
    @Basic(optional = false)
    @Column(name = "bit_fuente", nullable = false, length = 20)
    private String bitFuente;
    @Basic(optional = false)
    @Column(name = "bit_categoria", nullable = false, length = 20)
    private String bitCategoria;
    @Basic(optional = false)
    @Column(name = "bit_descripcion", nullable = false, length = 40)
    private String bitDescripcion;

    public Bitacora() {
    }

    public Bitacora(Integer bitId) {
        this.bitId = bitId;
    }

    public Bitacora(Integer bitId, Date bitFecha, String bitUsuario, String bitFuente, String bitCategoria, String bitDescripcion) {
        this.bitId = bitId;
        this.bitFecha = bitFecha;
        this.bitUsuario = bitUsuario;
        this.bitFuente = bitFuente;
        this.bitCategoria = bitCategoria;
        this.bitDescripcion = bitDescripcion;
    }

    public Integer getBitId() {
        return bitId;
    }

    public void setBitId(Integer bitId) {
        this.bitId = bitId;
    }

    public Date getBitFecha() {
        return bitFecha;
    }

    public void setBitFecha(Date bitFecha) {
        this.bitFecha = bitFecha;
    }

    public String getBitUsuario() {
        return bitUsuario;
    }

    public void setBitUsuario(String bitUsuario) {
        this.bitUsuario = bitUsuario;
    }

    public String getBitFuente() {
        return bitFuente;
    }

    public void setBitFuente(String bitFuente) {
        this.bitFuente = bitFuente;
    }

    public String getBitCategoria() {
        return bitCategoria;
    }

    public void setBitCategoria(String bitCategoria) {
        this.bitCategoria = bitCategoria;
    }

    public String getBitDescripcion() {
        return bitDescripcion;
    }

    public void setBitDescripcion(String bitDescripcion) {
        this.bitDescripcion = bitDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bitId != null ? bitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.bitId == null && other.bitId != null) || (this.bitId != null && !this.bitId.equals(other.bitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prebea.syscafil.model.entities.Bitacora[bitId=" + bitId + "]";
    }

}
