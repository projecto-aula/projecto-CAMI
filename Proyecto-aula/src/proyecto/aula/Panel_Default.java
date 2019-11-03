/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Equipo
 */

/*Esta es la clase de panel que vendra por default para cualquier ventana.
Esta clase es una extension de Propanel, por lo cual ya nos ayudara a 
instanciar objetos. Viene con objetos incluidos*/
public class Panel_Default extends ProPanel{
    //Establesco un boton como una prueba
    JButton subir = new JButton("Ingresar");
    
    JLabel Lnombre = new JLabel("Nombre:");
    JTextField nombre = new JTextField("Ingrese nombre");
    
    JLabel Lcontra = new JLabel("Contraseña:");
    JTextField contra = new JTextField("Ingrese contraseña");
    
    JButton regristro = new JButton("Resgristrar");
    private final int ancho = 800, largo = 600;
    ActionListener escuchadorBotones;
    
    /*Este es el constructor del panel
    aqui se van a agregar algunos valores por defecto
    para el panel
    */
    Panel_Default(){
        this.escuchadorBotones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        };
        this.setLayout(null);
        this.setSize(ancho, largo);
        //this.setMinimumSize(new Dimension(300, 200));
        //subir.setSize(100, 40);
        subir.addActionListener(escuchadorBotones);
        subir.setBounds(0, 130, 100, 20);
        
        this.setBackground(Color.LIGHT_GRAY);
    }
    
    public void Nombre(){
        Lnombre.setBounds(0, 20, 100, 20);
        nombre.setBounds(100, 20, 200, 20);
    }
    
    public void Contrasenna(){
        Lcontra.setBounds(0, 60, 100, 20);
        contra.setBounds(100, 60, 200, 20);
    }
    
    public void Regristro(){
        regristro.setBounds(0, 100, 100, 30);
    }
    /**
     *Basicamente este metodo sirve para dibujar los componentes necesarios 
     * que se van a mostrar en el panel
     */
    @Override
    public void Dibujar(Graphics2D g){
        Nombre();//Agregamos caracteristicas de dichos objetos del metodo
        Contrasenna();
        Regristro();
        this.add(subir);
        this.add(nombre);
        this.add(Lnombre);
        this.add(Lcontra);
        this.add(contra);
        this.add(regristro);
    }
    
    
}
