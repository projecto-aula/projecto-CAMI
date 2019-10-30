/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.Color;
import java.awt.GridLayout;

/**
 *
 * @author Equipo
 */

/*Esta clase es otra case de tipo propanel */
public class Panel_Menu extends ProPanel{
    Panel_Menu(){
        this.setLayout(new GridLayout(2, 2));
        //subir.setSize(100, 40);
        this.setBackground(Color.BLUE);
    }
    
    /**
     *Basicamente este metodo sirve para dibujar los componentes necesarios 
     * que se van a mostrar en el panel
     */
    @Override
    public void Dibujar(){
        //this.add(subir);
    }
}
