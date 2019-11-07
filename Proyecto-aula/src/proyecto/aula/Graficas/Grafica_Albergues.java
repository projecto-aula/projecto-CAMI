/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Graficas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javafx.animation.Animation;
import javafx.animation.PathTransition;

/**
 *
 * @author Equipo 4
 */
public class Grafica_Albergues extends JPanel{
    Animation anim = new PathTransition();
    JLabel aver = new JLabel("AVR");
    Grafica_Albergues(){
        this.setBackground(Color.red);
        this.setLayout(new BorderLayout());
        this.add(aver, BorderLayout.CENTER);
    }
}
