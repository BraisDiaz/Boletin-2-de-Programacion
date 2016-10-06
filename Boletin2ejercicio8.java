/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author bdiaznunez
 */
public class Boletin2ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        float temperaturaC,temperaturaK = 273;
        
        temperaturaC = Float.parseFloat(JOptionPane.showInputDialog("Introducir temperatura en grados centígrados"));
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es" + (temperaturaC *(9/5)+32) +"grados") ;
        JOptionPane.showMessageDialog(null, "La temperatura en Kelvin es" + (temperaturaC+temperaturaK) +"grados");
        
      
    }
    
}
