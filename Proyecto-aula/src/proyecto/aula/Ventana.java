/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import proyecto.aula.Graficas.Panel_Graficas;
import javax.swing.*;

/**
 *
 * @author familia
 */

/*Esta es la clase ventana esta es una de las importantes
pue snos permite elborar una ventana, es una extension de JFrame.
Es asi por que podemos sobrecargas metodos de la clase original, y manipularla
a nuestro gusto.Solo vamos a cambiar de paneles con el metodo setEscena 
Por ende solo vamos a tenr una sola ventana*/
public class Ventana extends JFrame{
    private String titulo;
    private final int ancho = 800, largo = 600;
    
    //Es un contructor vacio de la clase
    Ventana(){
        
    }

    //Es un constructor para estalbecer el titilo 
    //de la clase
    Ventana(String titulo){
        this.setTitle(titulo);
        this.setResizable(true);//Para que no pueda cambiar de tamano
        this.setSize(ancho, largo);//Establecemos tamano
        this.setLocationRelativeTo(null);//Para ponerla en el centro de la pantallla
        this.setMinimumSize(new Dimension(690, 400));
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));//LLamamos al icono 
        setIconImage(image); //Establecemos el icono del programa
        Panel_Graficas panel = new Panel_Graficas();
        this.add(panel);
    }
    
    /*Esta es un metodo importante, pues nos permite establecer un panel 
    en especifico para cambiar de paneles y cambiar de escenas, unicamente 
    se necesita poner un panel como argumento, de ahora en adelante no es necsario crear 
    una vantana, basta con crear el panel con sus respectivos elementos
    */
    public void setEscena(ProPanel panel){
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
