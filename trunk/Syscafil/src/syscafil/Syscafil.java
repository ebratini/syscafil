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
    private static String DiaFacturacion;
    private static enum PrecioPlanes {BasicoFamiliar, PremiumFamiliar, BasicoEmpresarial, PremiumEmpresarial};
    private static enum PrecioPlanesDependientesExtreas {BasicoFamiliar, PremiumFamiliar, BasicoEmpresarial, PremiumEmpresarial};

    //private void initCoreVariables() {}
    public static String getDiaFacturacion() {
        return DiaFacturacion;
    }

    public static void setDiaFacturacion(String diaFacturacion) {
        DiaFacturacion = diaFacturacion;
    }

    public static void setDiaFacturacion() {
        DiaFacturacion = XMLFileManager.getElemento("META-INF/syscafil_conf.xml", "Syscafil/Facturacion/DiaFacturacion").getTextTrim();
    }
}
