/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.business;

import com.prebea.syscafil.model.FileManager;
import java.io.File;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public abstract class AppLogger {

    private String baseAppURL;
    private String toFilePath;
    private File toFile;

    public AppLogger() {
    }

    public AppLogger(File toFile) {
        this.toFile = toFile;
        this.toFilePath = toFile.getAbsolutePath();
    }

    public AppLogger(String toFilePath) {
        this.toFilePath = toFilePath;
        this.toFile = new File(toFilePath);
    }

    public String getBaseAppURL() {
        return baseAppURL;
    }

    public void setBaseAppURL(String baseAppURL) {
        this.baseAppURL = baseAppURL;
    }
    
    public File getToFile() {
        return toFile;
    }

    public void setToFile(File toFile) {
        this.toFile = toFile;
        this.toFilePath = toFile.getAbsolutePath();
    }

    public String getToFilePath() {
        return toFilePath;
    }

    public void setToFilePath(String toFilePath) {
        this.toFilePath = toFilePath;
        this.toFile = new File(toFilePath);
    }
    
    public void log(String mensaje, boolean append) {
        log(mensaje, toFile, append);
    }

    public static void log(String mensaje, File toFile, boolean append) {
        FileManager.writeToFile(new StringBuilder(mensaje), toFile, append);
    }

    public static void log(String mensaje, String toFilePath, boolean append) {
        log(mensaje, new File(toFilePath), append);
    }
}
