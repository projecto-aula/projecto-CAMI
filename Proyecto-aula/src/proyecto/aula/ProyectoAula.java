/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import javax.swing.JFrame;

/**
 *
 * @author familia
 */
public class ProyectoAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana vent = new Ventana("AMI v1.0.0");
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vent.setVisible(true);
    }
    
}
