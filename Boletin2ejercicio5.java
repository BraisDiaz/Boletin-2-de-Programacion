/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author bdiaznunez
 */
public class Boletin2ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double millas;
      final int MILES = 1852;
       
      
      millas = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número de millas"));
      JOptionPane.showMessageDialog(null, "los metros son " + millas*MILES);
    }
    
}
