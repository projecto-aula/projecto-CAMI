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
    public Font letratitulo = new Font("Comic Sans MS", Font.BOLD, 20); //Tipo de letra para los titulos de los dos apartados
    public Font letracuerpo = new Font("Comin Sans MS", Font.PLAIN, 6); //Tipo de letra para los titulos del cuerpo (derechos)
    private final JLabel derechosmigrantes = new JLabel("DERECHOS NACIONALES E INTERNACIOALES DE LOS MIGRANTES"); //Titulo de la ventana
    private final JLabel derechosninos = new JLabel("Derechos de niños, niñas y jovenes"); //Titulo del apartado 1
    private final JLabel derechosadultos = new JLabel("Derechos de hombre, mujeres y adultos"); //Titulo del apartado 2
    private final ArrayList derNlis = new ArrayList();
    private final ArrayList derAlis = new ArrayList();
    private final JButton volver = new JButton("Volver a Menu"); 
    private final JPanel principal = new JPanel();
    private final JPanel dereninos = new JPanel();
    private final JPanel dereadul = new JPanel();
    
    public Panel_Derechos(){
        this.setBackground(Color.WHITE);
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        derechosmigrantes.setFont(letratitulo);
        derechosmigrantes.setHorizontalAlignment(JLabel.CENTER);
        this.add(derechosmigrantes, BorderLayout.NORTH);
        this.add(volver, BorderLayout.SOUTH);
        
        
        /*
        JSeparator separador1 = new JSeparator(JSeparator.HORIZONTAL);
        separador1.setBackground(Color.CYAN);
        principal.add(separador1, BorderLayout.NORTH);
        */
        
            dereninos.setLayout(new BorderLayout());
            JLabel dn0 = new JLabel("Bajo la Ley General de Derechos de Niñas, Niños y Adolescentes (LGDNNA) \n tienene derecho a: ");
            derNlis.add(dn0);

            JLabel dn1 = new JLabel("A la vida, a la supervivencia y al desarrollo.");
            derNlis.add(dn1);

            JLabel dn2 = new JLabel("A la identidad.");
            derNlis.add(dn2);

            JLabel dn3 = new JLabel("A no ser discriminado.");
            derNlis.add(dn3);

            JLabel dn4 = new JLabel("A vivir en condiciones de bienestar y aun sano desarrollo integral.");
            derNlis.add(dn4);


            JLabel dn5 = new JLabel("A la protección de la salud y a la seguridad social.");
            derNlis.add(dn5);


            JLabel dn6 = new JLabel("A la educación.");
            derNlis.add(dn6);


            JLabel dn7 = new JLabel("A la libertad de expresión y de acceso a la información.");
            derNlis.add(dn7);


            JLabel dn8 = new JLabel("Al acceso a las tecnologías de la información y comunicación.");
            derNlis.add(dn8);


            JLabel dn9 = new JLabel("A la no detención migratoria.");
            derNlis.add(dn9);


            JLabel dn10 = new JLabel("A la seguridad jurídica y al debido proceso.");
            derNlis.add(dn10);
            //dereninos.add(dn10);
            anadirDerechosNinos();
        this.add(dereninos, BorderLayout.CENTER);
        /*
        JSeparator separador2= new JSeparator(JSeparator.);
        separador2.setBackground(Color.WHITE);
        */
        
        
            JLabel da0 = new JLabel("Segun la Declaracion Universal de los Derechos Humanos (DUDH) \n explica que Todo persona tiene por derecho: ");
            derNlis.add(da0);
 

            JLabel da1 = new JLabel("A circular libremente y a elegir su residencia en el territorio de un Estado.");
            derNlis.add(da1);


            JLabel da2 = new JLabel("A salir de cualquier país, incluso del propio, y a regresar a su país.");
            derNlis.add(da2);
        

            JLabel da3 = new JLabel("Al trabajo, a la libre elección de su trabajo, a condiciones equitativas \n y satisfactorias de trabajo y a la protección contra el desempleo. ");
            derNlis.add(da3);
         

            JLabel da4 = new JLabel("Sin discriminación alguna, a salario igual por trabajo igual.");
            derNlis.add(da4);
            

            JLabel da5 = new JLabel("Toda persona que trabaja tiene derecho a una remuneración equitativa \n satisfactoria que le asegure, así como a su familia, una existencia conforme \n a la dignidad humana.");
            derNlis.add(da5);
            

            JLabel da6 = new JLabel("A fundar sindicatos y a sindicarse para defender sus intereses.");
            derNlis.add(da6);
            

            JLabel da01 = new JLabel("Segun la Ley de Migracion, los migrantes pueden y tienen derecho: ");
            derNlis.add(da01);
            

            JLabel da7 = new JLabel("A pedir asilo al país extranjero y realizar su documentación \n de forma legal y bajo las normas jurídicas del país receptor.");
            derNlis.add(da7);
            JLabel da8 = new JLabel("A no ser objeto de explotación o trato arbitrario.");
            derNlis.add(da8);

            JLabel da9 = new JLabel("A que se les garantizen y se protejan sus derechos humanos.");
            derNlis.add(da9);

            JLabel da10 = new JLabel("En caso de un proceso jurídico, tiene derecho a ser informado \n sobre el procedimiento, a la asesoría jurídica, a un traductor y a ser informado \n sobre sus derechos humanos y los que la ley le ofrece.");
            derNlis.add(da10);
        
        anadirDerechosAdul();
        /*
        JSeparator separador3 = new JSeparator(JSeparator.CENTER);
        separador3.setBackground(Color.WHITE); 
        dereadul.add(separador3, BorderLayout.WEST);
        */
        
            
        
    }

    private void anadirDerechosNinos() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1));
        for (Object e : derNlis) {
            JLabel title = (JLabel)e;
            title.setHorizontalAlignment(JLabel.RIGHT);
            title.setFont(letracuerpo);
            panel.add(title);
        }
        dereninos.add(panel, BorderLayout.CENTER);
    }
    private void anadirDerechosAdul() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 1));
        for (Object e : derNlis) {
            JLabel title = (JLabel)e;
            title.setHorizontalAlignment(JLabel.LEFT);
            title.setFont(letracuerpo);
            panel.add(title);
        }
        dereadul.add(panel, BorderLayout.CENTER);
    }
    
    
}
