/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Satelite obx = new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Introduce meridiano:")), Double.parseDouble(JOptionPane.showInputDialog("Introduce paralelo:")), Double.parseDouble(JOptionPane.showInputDialog("Introduce distancia tierra:")));
obx.verPosicion(); 
        
        
    }
    
}
