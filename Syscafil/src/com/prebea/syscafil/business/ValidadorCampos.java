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
package com.prebea.syscafil.business;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class ValidadorCampos {

    private static void turnLabel(JLabel outLabel) {
        if (outLabel != null) {
            outLabel.setText("*");
            outLabel.setForeground(Color.red);
            outLabel.setVisible(true);
        }
    }

    public static boolean dateCompliesPattern(String matcher, String pattern) {
        // YYYY-MM-DD -> \d\d\d\d-\d\d-\d\d
        boolean validDate = false;

        if (Pattern.matches(pattern, matcher)) {
            String[] dateFields = matcher.split("-");
            if ((Integer.parseInt(dateFields[1]) <= 12) && (Integer.parseInt(dateFields[2]) <= 31)) {
                validDate = true;
            }
        }

        return validDate;
    }

    public static boolean phoneCompliesPattern(String matcher, String pattern) {
        // (999)-999-9999 -> \\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d
        boolean phone = false;

        if (Pattern.matches(pattern, matcher)) {
            phone = true;
        }
        return phone;
    }

    public static boolean validarCampoVacio(JComponent campo, JLabel outLabel) {
        boolean valido = true;
        if (campo instanceof JTextComponent && ((JTextComponent) campo).getText().isEmpty()) {
            valido = false;
            if (outLabel != null) {
                turnLabel(outLabel);
            }
        } else if (campo instanceof JComboBox && ((JComboBox) campo).getSelectedItem().toString().equalsIgnoreCase("seleccion")) {
            valido = false;
            if (outLabel != null) {
                turnLabel(outLabel);
            }
        }
        return valido;
    }

    public static boolean validarCampoTelefono(JComponent campo, JLabel outLabel) {
        boolean valido = true;
        if (campo instanceof JTextComponent) {
            JTextComponent textComp = (JTextComponent) campo;
            if ((textComp.getName().toLowerCase().contains("telefono") || (textComp.getName().toLowerCase().contains("fax")))
                    && !phoneCompliesPattern(((JTextComponent) campo).getText(), "\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d")) {
                valido = false;
                if (outLabel != null) {
                    turnLabel(outLabel);
                }
            }
        }
        return valido;
    }

    public static boolean validarCampoFecha(JComponent campo, JLabel outLabel) {
        boolean valido = true;
        if (campo instanceof JTextComponent) {
            JTextComponent textComp = (JTextComponent) campo;
            if (textComp.getName().toLowerCase().contains("fecha")
                    && !dateCompliesPattern(((JTextComponent) campo).getText(), "\\d\\d\\d\\d-\\d\\d-\\d\\d")) {
                valido = false;
                if (outLabel != null) {
                    turnLabel(outLabel);
                }
            }
        }
        return valido;
    }

    public static boolean validar(JComponent campo, JLabel outLabel) {
        return validarCampoVacio(campo, outLabel) && validarCampoFecha(campo, outLabel) && validarCampoTelefono(campo, outLabel);
    }

    public static boolean validar(HashMap<JComponent, JLabel> campos) {
        boolean valido = true;
        for (Entry<JComponent, JLabel> map : campos.entrySet()) {
            valido &= validar(map.getKey(), map.getValue());
        }
        return valido;
    }
}
