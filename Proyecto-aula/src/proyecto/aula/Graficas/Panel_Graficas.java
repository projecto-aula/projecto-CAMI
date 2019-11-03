/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Graficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import proyecto.aula.*;//Importamos ha este paquete las clases que se habian hecho hasta el momento
//He decido manejar diferentes paquetes debido a que uno se puede perder con facilidad entre 
//Todas las clases que se van a tener.

/**
 *
 * @author Equipo-Luis Fernando Tenori Aspiros
 */
public class Panel_Graficas extends ProPanel{
    
    public Font fuente1 = new Font("Arial", Font.BOLD, 60);//Para el titulo de bienvenida
    public Font fuente2 = new Font("Arial", 0, 15);
    private final JLabel titulo1 = new JLabel("Albergues en la ciudad de México");//EL titulo de la grafica 1
    private final JLabel titulo2 = new JLabel("Nivel de volencia que sufren los migrantes");//EL titulo de la grafica 2
    private final JLabel titulo3 = new JLabel("Población de migrantes");//EL titulo de la grafica 3
    private final JButton volver = new JButton("Volver");//EL boton de volver al menu
    private final JPanel GraAlb = new JPanel();
    private final JPanel panelPrincipal = new JPanel();
    
    //Constructor de la clase graficas
    public Panel_Graficas(){
        this.setBackground(Color.white);//Establemos color de fondo
        this.setSize(800, 600);//establecemos tamaño del panel
        this.setLayout(new BorderLayout());//establecemos el tipo de layout que va a tener. Este es el verdadero layout principal
        anadirTitulos();//Hacemos todas las funciones para agregar los titulos
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.white);//Añadimos color al panel como una guia
        JLabel bienven = new JLabel("¡Bienvenido!");
        bienven.setFont(fuente1);
        JSeparator sep = new JSeparator(JSeparator.VERTICAL);
        sep.setBackground(Color.DARK_GRAY);
        panelPrincipal.add(sep, BorderLayout.WEST);
        bienven.setHorizontalAlignment(JLabel.CENTER);
        JLabel bienven2 = new JLabel("Presiona cualquiera de las opciones de la izquierda de la ventana");
        bienven2.setHorizontalAlignment(JLabel.CENTER);
        bienven2.setFont(fuente2);
        bienven2.setForeground(new Color(130, 130, 130));
        panelPrincipal.add(bienven, BorderLayout.NORTH);
        panelPrincipal.add(bienven2, BorderLayout.CENTER);
        this.add(volver, BorderLayout.SOUTH);
        this.add(panelPrincipal, BorderLayout.CENTER);//Añadimos el panel donde iran las diferentes panels de graficas
    }
    private final MouseListener EscuchadorRaton = new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource().equals(titulo1)){
                GraAlb.setBackground(Color.red);
                panelPrincipal.removeAll();
                panelPrincipal.add(GraAlb, BorderLayout.CENTER);
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }
    };
    
    /*Basicamente este metodo creara un un panel que contendra un layaout. El panel que se a creado
    se agregara al panel principal en donde va su respectivo lugar*/
    private void anadirTitulos(){
        JPanel panel = new JPanel();//Establecemos un Jpanel donde posteriormente lo agregaremos a una respectiva layout
        panel.setLayout(new GridLayout(3,1));//Establecemos el layout del panel
        panel.setBackground(Color.white);
        titulo1.addMouseListener(EscuchadorRaton);//Le añadimos los eventos del raton
        titulo1.setHorizontalAlignment(JLabel.CENTER);//Establecemos el texto del label
        
        panel.add(titulo1);//añadimos titulos
        
        panel.add(titulo2);//añadimos titulos
        panel.add(titulo3);//añadimos titulos
        this.add(panel, BorderLayout.WEST);//Añadimos el panel de este metodo en la parte deseada del panel
    }
    
    
    /*Nos permite dibujar diversos componentes en pantalla, nos ayudara para crear las graficas y 
    diversas animaciones que vamos a usar*/
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.red);
        
    }
    
    /**
     *
     * @param g
     * Nos permite dibujar elementos con el graphics2D como un parametro de graphics
     * Se utiliza en paintComponent, sive para hacer animaciones y dibujar 
     * diferentes componentes en ella.
     */
    @Override
    public void Dibujar(Graphics2D g){
        
    }
}
