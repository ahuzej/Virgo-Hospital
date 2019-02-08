/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.main;

import com.ahuzej.ConditionDetails;
import com.ahuzej.ConditionDetails.ConditionDetaisBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Albert
 */
public class Main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        
        int selected = readFromFile();
        
        switch(selected) {
            case 1:
                com.ahuzej.console.Main.start();
                break;
            case 2:
                com.ahuzej.SwingTest.start();
                break;
                
        }
        
    }

    private static int readFromFile() {
        try (Scanner s = new Scanner(new File("init.txt"))){
            return s.nextInt();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 2;    
    }
    
}
