/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 *
 * @author Laynecito
 */
public class Main extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Programa de prueba");
        frame.setBounds(10, 10, 400, 300);
        
        JTextPane text = new JTextPane();
        text.setText("HOLA MUNDO DESDE SWING");
       
        frame.setVisible(true);
        frame.add(text);
    }

}
