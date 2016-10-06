/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author bdiaznunez
 */
public class Boletin2ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n, i, t; 
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Introducir nominal"));
        i = Double.parseDouble(JOptionPane.showInputDialog("Introducir interés"));
        t = Double.parseDouble(JOptionPane.showInputDialog("Introducir años"));
        
        t= t*12;
        i= 1/1200;
        
        JOptionPane.showMessageDialog(null, "La renta mensual a pagar es" + (n*i*t));
        
        
                
        
        
       
    }
    
}
