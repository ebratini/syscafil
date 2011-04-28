/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prebea.syscafil.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class FileManager {

    public static void makeFolder(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    // This method is used to load the file into a StringBuilder object for later use.
    /**
     *
     * Method used to load the file into a StringBuilder object for later use.
     *
     * @param inputFile a File object from wich to read.
     * @return a StringBuilder object with the all the lines of the file argument read.
     */
    public static StringBuilder loadFile(File inputFile) {
        StringBuilder sbInputFile = new StringBuilder();
        String recLine = "";

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(inputFile);
            br = new BufferedReader(fr);

            while ((recLine = br.readLine()) != null) {
                sbInputFile.append(String.format("%s%s", recLine, System.getProperty("line.separator")));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

        return sbInputFile;
    }

    // This method write the files into physical directory structure.
    /**
     *
     * Method used to write the files into physical directory structure.
     *
     * @param content a StringBuilder object with the future content of the file
     * @param file a File object to which the content is to be intended to be written.
     */
    public static void writeToFile(StringBuilder content, File file, boolean append) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            if (!append) {
                bw.write(content.toString());
            } else {
                bw.append(content);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
