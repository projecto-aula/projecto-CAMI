/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author familia
 */

/*Esta es la clase ventana esta es una de las importantes
pue snos permite elborar una ventana, es una extension de JFrame.
Es asi por que podemos sobrecargas metodos de la clase original, y manipularla
a nuestro gusto*/
public class Ventana extends JFrame{
    private String titulo;
    private final int ancho = 800, largo = 600;
    private Panel_Default pan = new Panel_Default();
    //Es un contructor vacio de la clase
    Ventana(){
        
    }

    //Es un constructor para estalbecer el titilo 
    //de la clase
    Ventana(String titulo){
        this.setTitle(titulo);
        this.setResizable(false);//Para que no pueda cambiar de tamano
        this.setSize(ancho, largo);//Establecemos tamano
        this.setLocationRelativeTo(null);//Para ponerla en el centro de la pantallla
        this.add(pan);//Anadimos el panel
        pan.Dibujar();
        
    }
    
    /*Esta es un metodo importante, pues nos permite establecer un panel 
    en especifico para cambiar de paneles y cambiar de escenas, unicamente 
    se necesita poner un panel como argumento*/
    public void setEscena(ProPanel panel){
        this.add(panel);
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
