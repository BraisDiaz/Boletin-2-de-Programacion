/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3boletin2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Ejercicio3Boletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros; //declaramos la variable euros
        euros = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad en euros"));
        JOptionPane.showMessageDialog(null,"La cantidad en dolares es de" + euros * 0.89);
      
        
    }
    
}
