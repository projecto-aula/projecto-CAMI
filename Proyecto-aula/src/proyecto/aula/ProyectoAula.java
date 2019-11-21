/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;


import javax.swing.JFrame;
import proyecto.aula.Derechos.*;
import proyecto.aula.Graficas.Panel_Graficas;
import modulosofia.*;


/**
 *
 * @author Equipo 4
 */
public class ProyectoAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Login log= new Login();
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setVisible(true);
        /*
        Ventana vent = new Ventana("CAMI v1.0.0");
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Principal der = new Principal();
        vent.add(new Panel_Menu());
        
        vent.setVisible(true);
                */
    }
    
}
