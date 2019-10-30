/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import javax.swing.*;

/**
 *
 * @author familia
 */

/*Esta clase nos permite utilizar panel para nuestro programa
Es una clase que se necesita agregar a la ventana para agregar metodos.
Es una clase abstracta por que vamos a manejar muchos tipos de paneles*/
abstract public class ProPanel extends JPanel{
    
    //private final int ancho = 800, largo = 600;
    
    /*Se establecen valores por defecto en el constructor*/
    ProPanel(){
        
    }
    
    //Este metodo abstracto nos ayudara a anadir objetos y demas elementos a
    //Nustra ventana
    public void Dibujar(){
        
    }
    
    
}
