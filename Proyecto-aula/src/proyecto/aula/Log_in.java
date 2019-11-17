/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import proyecto.aula.Graficas.Panel_Graficas;
import proyecto.aula.Panel_Base;

/**
 *
 * @author HP
 */
public class Log_in extends JFrame{
    
    private String titulo;
    private final int ancho = 800, largo = 600;
    
    //Es un contructor vacio de la clase
    Log_in(){
        
    }

    //Es un constructor para estalbecer el titilo 
    //de la clase
    Log_in(String titulo){
        this.setTitle(titulo);
        this.setResizable(true);//Para que no pueda cambiar de tamano
        this.setSize(ancho, largo);//Establecemos tamano
        this.setLocationRelativeTo(null);//Para ponerla en el centro de la pantallla
        this.setMinimumSize(new Dimension(690, 400));
        Login panel = new Login();
        
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        
    }
    
    /*Esta es un metodo importante, pues nos permite establecer un panel 
    en especifico para cambiar de paneles y cambiar de escenas, unicamente 
    se necesita poner un panel como argumento, de ahora en adelante no es necsario crear 
    una vantana, basta con crear el panel con sus respectivos elementos
    */
    public void setEscena(Panel_Base panel){
        this.removeAll();
        this.add(panel);
        this.repaint();
        this.revalidate();
    }
    
    
    /*Aqui en adelante son los getters and setters de la clase*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }
}
