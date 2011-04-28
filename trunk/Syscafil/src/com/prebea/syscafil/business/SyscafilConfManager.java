/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.XMLFileManager;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class SyscafilConfManager {

    private String syscafilConfFilePath = "META-INF/syscafil_conf.xml";
    private String diaFacturacion;
    // TODO: no necesitare metodo getter y setter para esta variable cuando cree la tabla de Facturaciones
    private String ultimaFechaFacturacion;
    private int diasLmtParaSaldarFactura;

    public String getDiaFacturacion() {
        return diaFacturacion;
    }

    public void setDiaFacturacion(String diaFacturacion) {
        this.diaFacturacion = diaFacturacion;
        XMLFileManager.getElemento(syscafilConfFilePath, "Syscafil/Facturacion/DiaFacturacion").setText(diaFacturacion);
    }

    public String getSyscafilConfFilePath() {
        return syscafilConfFilePath;
    }

    public void setSyscafilConfFilePath(String syscafilConfFilePath) {
        this.syscafilConfFilePath = syscafilConfFilePath;
    }

    public String getUltimaFechaFacturacion() {
        return ultimaFechaFacturacion;
    }

    public void setUltimaFechaFacturacion(String ultimaFechaFacturacion) {
        this.ultimaFechaFacturacion = ultimaFechaFacturacion;
        XMLFileManager.getElemento(syscafilConfFilePath, "Syscafil/Facturacion/UltimaFechaFacturacion").setText(ultimaFechaFacturacion);
    }

    public int getDiasLmtParaSaldar() {
        return diasLmtParaSaldarFactura;
    }

    public void setDiasLmtParaSaldar(int diasLmtParaSaldar) {
        this.diasLmtParaSaldarFactura = diasLmtParaSaldar;
        XMLFileManager.getElemento(syscafilConfFilePath, "Syscafil/Facturacion/DiasLmtParaSaldarFactura").setText(Integer.toString(diasLmtParaSaldar));
    }
}
