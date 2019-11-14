/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;


import javax.swing.JFrame;
import proyecto.aula.Graficas.Panel_Graficas;
import proyecto.aula.Sofia.Panel1;

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
        Ventana vent = new Ventana("CAMI v1.0.0");
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel1 panel = new Panel1();
        Panel_Graficas g = new Panel_Graficas();
        vent.setEscena(g);
        vent.setVisible(true);
    }
    
}
