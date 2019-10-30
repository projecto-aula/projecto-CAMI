/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Equipo
 */

/*Esta es la clase de panel que vendra por default para cualquier ventana.
Esta clase es una extension de Propanel, por lo cual ya nos ayudara a 
instanciar objetos. Viene con objetos incluidos*/
public class Panel_Default extends ProPanel{
    //Establesco un boton como una prueba
    JButton subir = new JButton("Seguir");
    private final int ancho = 800, largo = 600;
    //ActionListener escuchadorBotones;
    /*Este es el constructor del panel
    aqui se van a agregar algunos valores por defecto
    para el panel
    */
    Panel_Default(){
        
        this.setLayout(new GridLayout(2, 2));
        this.setSize(ancho, largo);
        //this.setMinimumSize(new Dimension(300, 200));
        //subir.setSize(100, 40);
        //subir.addActionListener(escuchadorBotones);
        this.setBackground(Color.red);
    }
    
    /**
     *Basicamente este metodo sirve para dibujar los componentes necesarios 
     * que se van a mostrar en el panel
     */
    @Override
    public void Dibujar(){
        this.add(subir);
    }
    
    
}
