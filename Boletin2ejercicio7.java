/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2ejercicio7.pkg2;

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
         Double n,t,i,renda;
        n= Double.parseDouble(JOptionPane.showInputDialog("Valor n:"));
        t= Double.parseDouble(JOptionPane.showInputDialog("Valor t:"));
        i= Double.parseDouble(JOptionPane.showInputDialog("Valor 1:"));
        renda= (n* Math.pow((1+i),t)*i)/Math.pow((1+i), t);
        System.out.println("A renda é: "+ renda);
       
    }
    
}
