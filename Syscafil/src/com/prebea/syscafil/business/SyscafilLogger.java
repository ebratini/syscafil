/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.FileManager;
import com.prebea.syscafil.model.XMLFileManager;
import com.prebea.syscafil.model.entities.Bitacora;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import syscafil.Syscafil;
import java.io.File;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class SyscafilLogger extends AppLogger {

    private BitacoraManager bm = new BitacoraManager();
    private UsuarioManager um = new UsuarioManager();

    public SyscafilLogger() {
        createAppFileDir();
        setBaseAppURL(XMLFileManager.getElemento(Syscafil.scm.getSyscafilConfFilePath(), "Syscafil").getAttribute("BaseAppURL").getValue());
        setToFilePath(String.format("%1$s%2$sapp_files%2$sbitlogger.syscafil", getBaseAppURL(), System.getProperty("path.separator").toString()));
        setToFile(new File(getToFilePath()));
    }

    private void createAppFileDir() {
        File appFileDir = new File(String.format("%1$s%2$sapp_files", getBaseAppURL(), System.getProperty("path.separator").toString()));
        if (appFileDir.exists() != true) {
            appFileDir.mkdir();
        }
    }

    public void logBitacora(String... bitFields) {
        if (bitFields.length > 0) {
            String mensaje = String.format("%s|%s|%s|%s|%s%s", bitFields[0], bitFields[1], bitFields[2], bitFields[3], bitFields[4], System.getProperty("line.separator").toString());
            log(mensaje, true);
        }
    }

    public void logBitacora(Date fecha, Integer userId, String fuente, String categoria, String descripcion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);

        logBitacora(new String[]{String.format("%1$tD %1$tr", cal), userId.toString(), fuente, categoria, descripcion});
    }

    public void flushToDataBase() {
        StringBuilder sbBits = FileManager.loadFile(getToFile());
        String[] bits = sbBits.toString().split(System.getProperty("line.separator").toString());

        for (String bitLine : bits) {
            try {
                String[] bitFields = bitLine.split("|");
                Bitacora bit = new Bitacora(DateFormat.getDateInstance().parse(bitFields[0]), bitFields[2], bitFields[3], bitFields[4]);

                // TODO: revisar / test lo de relaciones bidereccionales (si se agrega la bit a la coleccion del usuario)
                bit.setUsuario(um.getUsuarioById(Integer.parseInt(bitFields[1])));
                bm.crearBitacora(bit);
            } catch (ParseException ex) {
                Logger.getLogger(SyscafilLogger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
