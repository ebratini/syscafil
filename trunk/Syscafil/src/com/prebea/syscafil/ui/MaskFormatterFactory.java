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

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class MaskFormatterFactory {

    private String pattern = "(###) ###-####";
    private char placeHolder = '_';

    public MaskFormatterFactory() {
    }

    public MaskFormatterFactory(String pattern, char placeHolder) {
        this.pattern = pattern;
        this.placeHolder = placeHolder;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public char getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(char placeHolder) {
        this.placeHolder = placeHolder;
    }

    public MaskFormatter makeMaskFormatter() {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(pattern);
            mask.setPlaceholderCharacter(placeHolder);
        } catch (ParseException ex) {
            Logger.getLogger(MaskFormatterFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mask;
    }
}
