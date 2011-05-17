/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini <edwin.bratini@gmail.com>.
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
package com.prebea.syscafil.ui;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import javax.swing.text.DateFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class FormattedTextFieldExample extends JFrame {

    public FormattedTextFieldExample() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(200, 200));
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

        MaskFormatter mask = null;
        try {
            //
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            //
            mask = new MaskFormatter("(###) ###-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //
        // Create a formatted text field that accept a valid phone number.
        //
        JFormattedTextField phoneField = new JFormattedTextField(mask);
        phoneField.setPreferredSize(new Dimension(100, 20));

        //
        // Here we create a formatted text field that accept a date value. We
        // create an instance of SimpleDateFormat and use it to create a
        // DateFormatter instance which will be passed to the JFormattedTextField.
        //
        DateFormat format = new SimpleDateFormat("dd-MMMM-yyyy");
        DateFormatter df = new DateFormatter(format);
        JFormattedTextField dateField = new JFormattedTextField(df);
        dateField.setPreferredSize(new Dimension(100, 20));
        dateField.setValue(new Date());

        getContentPane().add(phoneField);
        getContentPane().add(dateField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new FormattedTextFieldExample().setVisible(true);
            }
        });
    }
}
