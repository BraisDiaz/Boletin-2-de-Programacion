/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author bdiaznunez
 */
public class Boletin2ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float Ppagado;
        float Ptarifa;
        
        Ppagado = Float.parseFloat(JOptionPane.showInputDialog("Introducir el porcentaje pagado"));
        Ptarifa = Float.parseFloat(JOptionPane.showInputDialog("Introducir el precio de la tarifa"));
        JOptionPane.showMessageDialog(null, "El descuento sobre la tarifa es del" + ((Ptarifa-Ppagado)*100/Ptarifa) +"%");
        
    }
    
}
