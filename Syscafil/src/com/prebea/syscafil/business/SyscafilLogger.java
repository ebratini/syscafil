/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.XMLFileManager;
import syscafil.Syscafil;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class SyscafilLogger extends AppLogger {

    private String baseAppURL = XMLFileManager.getElemento(Syscafil.scm.getSyscafilConfFilePath(), "Syscafil").getAttribute("BaseAppURL").getValue();
    private String toFilePath = String.format("%1$s%2$sapp_files%2$sbitlogger.syscafil", baseAppURL, System.getProperty("path.separator").toString());
    private File toFile = new File(toFilePath);
    private AppLogger al = new AppLogger(toFile);

    public SyscafilLogger() {
        createAppFileDir();
        al.setBaseAppURL(baseAppURL);
    }

    private void createAppFileDir() {
        File appFileDir = new File(String.format("%1$s%2$sapp_files", baseAppURL, System.getProperty("path.separator").toString()));
        if (appFileDir.exists() != true) {
            appFileDir.mkdir();
        }
    }

    public void logBitacora(String... bitFields) {
        if (bitFields.length > 0) {
            String mensaje = String.format("%s|%s|%s|%s|%s", bitFields[0], bitFields[1], bitFields[2], bitFields[3], bitFields[4]);
            al.log(mensaje, true);
        }
    }

    public void logBitacora(Date fecha, Integer userId, String fuente, String categoria, String descripcion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);

        logBitacora(new String[]{String.format("%1$tD %1$tr", cal), userId.toString(), fuente, categoria, descripcion});
    }

    public void flushToDataBase() {
        // TODO: bitacora manager implementation
    }
}
