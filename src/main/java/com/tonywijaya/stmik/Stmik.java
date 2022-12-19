/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tonywijaya.stmik;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author tonyw
 */
public class Stmik 
{
    public static void main(String[] args) 
    {
        //System.out.println("Hello World!");
        //new SwingApplication(); //Create and show the GUI.
        
        UI ui = new UI();
        ui.System();
        //ui.CrossPlatform();
        
        UtamaForm uf = new UtamaForm();
        uf.setVisible(true);
    }
}
