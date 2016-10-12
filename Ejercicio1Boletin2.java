/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1boletin2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Ejercicio1Boletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base,altura;
        
        base = Float.parseFloat(JOptionPane.showInputDialog("base"));
        altura= Float.parseFloat(JOptionPane.showInputDialog("altura"));
        
        JOptionPane.showMessageDialog(null,"el area del triangulo es" + base*altura/2);
    }
    
}
