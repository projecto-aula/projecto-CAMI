/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Derechos;

/**
 *
 * @author Velazquez Matias Saul
 */

import proyecto.aula.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Panel_Derechos extends Panel_Base{
    public Font letratitulo = new Font("Comic Sans MS", Font.BOLD, 30); //Tipo de letra para los titulos de los dos apartados
    public Font letracuerpo = new Font("Comin Sans MS", Font.BOLD, 20); //Tipo de letra para los titulos del cuerpo (derechos)
    private JLabel derechosmigrantes = new JLabel("DERECHOS NACIONALES E INTERNACIOALES DE LOS MIGRANTES"); //Titulo de la ventana
    private JLabel derechosninos = new JLabel("Derechos de niños, niñas y jovenes"); //Titulo del apartado 1
    private JLabel derechosadultos = new JLabel("Derechos de hombre, mujeres y adultos"); //Titulo del apartado 2
    private ArrayList derechos = new ArrayList();
    private JButton volver = new JButton("Volver a Menu");
    private JPanel principal = new JPanel();
    private JPanel dereninos = new JPanel();
    private JPanel dereadul = new JPanel();
    
    public Panel_Derechos(){
        this.setBackground(Color.WHITE);
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        
        derechos.add(derechosmigrantes);
        
        JSeparator separador1 = new JSeparator(JSeparator.HORIZONTAL);
        separador1.setBackground(Color.CYAN);
        principal.add(separador1, BorderLayout.NORTH);
        
        derechos.add(derechosninos);
        
            JLabel dn0 = new JLabel("Bajo la Ley General de Derechos de Niñas, Niños y Adolescentes (LGDNNA) \n tienene derecho a: ");
            dn0.setBounds(0, 100, 300, 40);
            dereninos.add(dn0);

            JLabel dn1 = new JLabel("A la vida, a la supervivencia y al desarrollo.");
            dn1.setBounds(0, 150, 300, 25);
            dereninos.add(dn1);

            JLabel dn2 = new JLabel("A la identidad.");
            dn2.setBounds(0, 200, 300, 25);
            dereninos.add(dn2);

            JLabel dn3 = new JLabel("A no ser discriminado.");
            dn3.setBounds(0, 250, 300, 25);
            dereninos.add(dn3);

            JLabel dn4 = new JLabel("A vivir en condiciones de bienestar y aun sano desarrollo integral.");
            dn4.setBounds(0, 300, 300, 25);
            dereninos.add(dn4);

            JLabel dn5 = new JLabel("A la protección de la salud y a la seguridad social.");
            dn5.setBounds(0, 350, 300, 25);
            dereninos.add(dn5);

            JLabel dn6 = new JLabel("A la educación.");
            dn6.setBounds(0, 400, 300, 25);
            dereninos.add(dn6);

            JLabel dn7 = new JLabel("A la libertad de expresión y de acceso a la información.");
            dn7.setBounds(0, 450, 300, 25);
            dereninos.add(dn7);

            JLabel dn8 = new JLabel("Al acceso a las tecnologías de la información y comunicación.");
            dn8.setBounds(0, 500, 300, 25);
            dereninos.add(dn8);

            JLabel dn9 = new JLabel("A la no detención migratoria.");
            dn9.setBounds(0, 550, 300, 25);
            dereninos.add(dn9);

            JLabel dn10 = new JLabel("A la seguridad jurídica y al debido proceso.");
            dn10.setBounds(0, 600, 300, 25);
            dereninos.add(dn10);       
        
        JSeparator separador2= new JSeparator(JSeparator.CENTER);
        separador2.setBackground(Color.WHITE);
        dereninos.add(separador2, BorderLayout.WEST);
        
        derechos.add(derechosadultos);
        
            JLabel da0 = new JLabel("Segun la Declaracion Universal de los Derechos Humanos (DUDH) \n explica que Todo persona tiene por derecho: ");
            da0.setBounds(300, 100, 300, 50);
            dereadul.add(da0);

            JLabel da1 = new JLabel("A circular libremente y a elegir su residencia en el territorio de un Estado.");
            da1.setBounds(300, 150, 300, 25);
            dereadul.add(da1);

            JLabel da2 = new JLabel("A salir de cualquier país, incluso del propio, y a regresar a su país.");
            da1.setBounds(300, 200, 300, 25);
            dereadul.add(da1);

            JLabel da3 = new JLabel("Al trabajo, a la libre elección de su trabajo, a condiciones equitativas \n y satisfactorias de trabajo y a la protección contra el desempleo. ");
            da1.setBounds(300, 250, 300, 25);
            dereadul.add(da1);

            JLabel da4 = new JLabel("Sin discriminación alguna, a salario igual por trabajo igual.");
            da1.setBounds(300, 300, 300, 25);
            dereadul.add(da1);

            JLabel da5 = new JLabel("Toda persona que trabaja tiene derecho a una remuneración equitativa \n satisfactoria que le asegure, así como a su familia, una existencia conforme \n a la dignidad humana.");
            da1.setBounds(300, 350, 300, 25);
            dereadul.add(da1);

            JLabel da6 = new JLabel("A fundar sindicatos y a sindicarse para defender sus intereses.");
            da1.setBounds(300, 400, 300, 25);
            dereadul.add(da1);

            JLabel da01 = new JLabel("Segun la Ley de Migracion, los migrantes pueden y tienen derecho: ");
            da1.setBounds(300, 450, 300, 100);
            dereadul.add(da1);

            JLabel da7 = new JLabel("A pedir asilo al país extranjero y realizar su documentación \n de forma legal y bajo las normas jurídicas del país receptor.");
            da1.setBounds(300, 550, 300, 25);
            dereadul.add(da1);

            JLabel da8 = new JLabel("A no ser objeto de explotación o trato arbitrario.");
            da1.setBounds(300, 600, 300, 25);
            dereadul.add(da1);

            JLabel da9 = new JLabel("A que se les garantizen y se protejan sus derechos humanos.");
            da1.setBounds(300, 650, 300, 25);
            dereadul.add(da1);

            JLabel da10 = new JLabel("En caso de un proceso jurídico, tiene derecho a ser informado \n sobre el procedimiento, a la asesoría jurídica, a un traductor y a ser informado \n sobre sus derechos humanos y los que la ley le ofrece.");
            da1.setBounds(300, 700, 300, 25);
            dereadul.add(da1);
        
        JSeparator separador3 = new JSeparator(JSeparator.CENTER);
        separador3.setBackground(Color.WHITE);
        dereadul.add(separador3, BorderLayout.WEST);
        
        añadirDerechos();
            
        
    }

    private void añadirDerechos() {
        
    }
    
    
}
