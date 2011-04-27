/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syscafil;

import com.prebea.syscafil.model.XMLFileManager;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class Syscafil {

    private static String syscafilConfFilePath = "META-INF/syscafil_conf.xml";
    private static String diaFacturacion;
    private static String ultimaFechaFacturacion;

    public Syscafil() {
        setDiaFacturacion();
        setUltimaFechaFacturacion();
    }

    public static enum PrecioPlanes {
        BasicoFamiliar(Double.parseDouble(getPrecioPlan(""))),
        PlusFamiliar(Double.parseDouble(getPrecioPlan(""))),
        OptimoFamiliar(Double.parseDouble(getPrecioPlan(""))),
        SupremoFamiliar(Double.parseDouble(getPrecioPlan(""))),
        PremiumFamiliar(Double.parseDouble(getPrecioPlan(""))),
        BasicoEmpresarial(Double.parseDouble(getPrecioPlan(""))),
        PlusEmpresarial(Double.parseDouble(getPrecioPlan(""))),
        EmpresarialEmpresarial(Double.parseDouble(getPrecioPlan(""))),
        PremiumEmpresarial(Double.parseDouble(getPrecioPlan("")));

        private PrecioPlanes(double precio) {
            this.precio = precio;
        }
        private double precio;

        public double getPrecio() {
            return this.precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    };

    public static enum PrecioPlanesDependientesExtreas {
        BasicoFamiliar(Double.parseDouble(getPrecioPlan(""))),
        PlusFamiliar(Double.parseDouble(getPrecioPlan(""))),
        OptimoFamiliar(Double.parseDouble(getPrecioPlan(""))),
        SupremoFamiliar(Double.parseDouble(getPrecioPlan(""))),
        PremiumFamiliar(Double.parseDouble(getPrecioPlan(""))),
        BasicoEmpresarial(Double.parseDouble(getPrecioPlan(""))),
        PlusEmpresarial(Double.parseDouble(getPrecioPlan(""))),
        EmpresarialEmpresarial(Double.parseDouble(getPrecioPlan(""))),
        PremiumEmpresarial(Double.parseDouble(getPrecioPlan("")));

        private PrecioPlanesDependientesExtreas(double precio) {
            this.precio = precio;
        }
        private double precio;

        public double getPrecio() {
            return this.precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    };

    public static String getSyscafilConfFilePath() {
        return syscafilConfFilePath;
    }

    public static void setSyscafilConfFilePath(String syscafilConfFilePath) {
        Syscafil.syscafilConfFilePath = syscafilConfFilePath;
    }

    public static String getDiaFacturacion() {
        return diaFacturacion;
    }

    public static void setDiaFacturacion(String diaFac) {
        Syscafil.diaFacturacion = diaFac;
    }

    public static void setDiaFacturacion() {
        Syscafil.diaFacturacion = XMLFileManager.getElemento(syscafilConfFilePath, "Syscafil/Facturacion/DiaFacturacion").getTextTrim();
    }

    public static String getUltimaFechaFacturacion() {
        return ultimaFechaFacturacion;
    }

    private static void setUltimaFechaFacturacion() {
        Syscafil.ultimaFechaFacturacion = XMLFileManager.getElemento(syscafilConfFilePath, "Syscafil/Facturacion/UltimaFechaFacturacion").getTextTrim();
    }

    public static void setUltimaFechaFacturacion(String ultimaFechaFacturacion) {
        XMLFileManager.getElemento(syscafilConfFilePath, "Syscafil/Facturacion/UltimaFechaFacturacion").setText(ultimaFechaFacturacion);
    }

    private static String getPrecioPlan(String xpathElem) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
