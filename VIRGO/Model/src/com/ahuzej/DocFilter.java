/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej;

import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author User
 */
public class DocFilter extends DocumentFilter {
    
    private Pattern regexCheck = Pattern.compile("[0-9]+");

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text == null) {
                return;
            }

            if (regexCheck.matcher(text).matches()) {
                fb.replace(offset, length, text, attrs);
            }
    }
    

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string == null) {
                return;
            }

            if (regexCheck.matcher(string).matches()) {
                super.insertString(fb, offset, string, attr);
            }
    }

}
    
