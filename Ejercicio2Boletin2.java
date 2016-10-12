/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2boletin2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Ejercicio2Boletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float lado;   
        
        lado = Float.parseFloat(JOptionPane.showInputDialog("lado"));
        //tenemos en primer lugar la salida por impresión (println)
        System.out.println("El área del cuadrado es" + lado * lado);
        //en segundo lugar la salida mediante cuadro de salida.
        JOptionPane.showMessageDialog(null,"el area del cuadrado es" + lado * lado);
        
       
        
       
        
       
   
   
            
       
     
        
        
        
       
        
    }
    
}
