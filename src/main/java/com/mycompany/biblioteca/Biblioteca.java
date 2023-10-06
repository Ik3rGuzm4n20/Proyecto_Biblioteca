/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import interfaces.Menu;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author mario
 */
public class Biblioteca {

    public static void main(String[] args) throws UnsupportedLookAndFeelException{
        Color color=new Color (0,51,102);
        UIManager.put("nimbusBase", color);
        Menu vMenu=new Menu();
    }
    
}
