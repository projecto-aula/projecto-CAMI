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
import java.util.ArrayList;
import proyecto.aula.*;//Importamos ha este paquete las clases que se habian hecho hasta el momento
//He decido manejar diferentes paquetes debido a que uno se puede perder con facilidad entre 
//Todas las clases que se van a tener.

/**
 *
 * @author Equipo-Luis Fernando Tenori Aspiros
 */
public class Panel_Graficas extends Panel_Base {

    public Font fuente1 = new Font("Arial", Font.BOLD, 60);//Para el titulo de bienvenida
    public Font fuente2 = new Font("Arial", 0, 15);
    private final JButton titulo1 = new JButton("Albergues en la ciudad de México");//EL titulo de la grafica 1
    private final JButton titulo2 = new JButton("Nivel de volencia que sufren los migrantes");//EL titulo de la grafica 2
    private final JButton titulo3 = new JButton("Población de migrantes");//EL titulo de la grafica 3
    private ArrayList titulos = new ArrayList();
    private final JButton volver = new JButton("Volver");//EL boton de volver al menu
    private final JPanel GraAlb = new JPanel();
    private final JPanel panelPrincipal = new JPanel();

    //Constructor de la clase graficas. Aqui es a donde se añade los elementos
    public Panel_Graficas() {
        this.setBackground(Color.white);//Establemos color de fondo
        this.setSize(800, 600);//establecemos tamaño del panel
        this.setLayout(new BorderLayout());//establecemos el tipo de layout que va a tener. Este es el verdadero layout principal
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(volver);
        anadirTitulos();//Hacemos todas las funciones para agregar los titulos
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.white);//Añadimos color al panel como una guia

        JSeparator sep = new JSeparator(JSeparator.VERTICAL);
        sep.setBackground(Color.DARK_GRAY);
        panelPrincipal.add(sep, BorderLayout.WEST);

        JLabel bienven2 = new JLabel("Da click en cualquiera de las opciones de la izquierda de la ventana");
        bienven2.setHorizontalAlignment(JLabel.CENTER);
        bienven2.setFont(fuente2);
        bienven2.setForeground(new Color(130, 130, 130));

        panelPrincipal.add(bienven2, BorderLayout.CENTER);
        this.add(panelPrincipal, BorderLayout.CENTER);//Añadimos el panel donde iran las diferentes panels de graficas
    }
    private final MouseListener EscuchadorRaton = new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource().equals(titulo1)) {
                Grafica_Albergues alb = new Grafica_Albergues();
                panelPrincipal.add(alb, BorderLayout.CENTER);
                panelPrincipal.removeAll();
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }else if(e.getSource().equals(titulo2)) {
                GraAlb.setBackground(Color.green);
                panelPrincipal.removeAll();
                panelPrincipal.add(GraAlb, BorderLayout.CENTER);
                JSeparator sep = new JSeparator(JSeparator.VERTICAL);
                sep.setBackground(Color.DARK_GRAY);
                panelPrincipal.add(sep, BorderLayout.WEST);
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }else if(e.getSource().equals(titulo3)) {
                GraAlb.setBackground(Color.blue);
                panelPrincipal.removeAll();
                panelPrincipal.add(GraAlb, BorderLayout.CENTER);
                JSeparator sep = new JSeparator(JSeparator.VERTICAL);
                sep.setBackground(Color.DARK_GRAY);
                panelPrincipal.add(sep, BorderLayout.WEST);
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }else if(e.getSource().equals(volver)) {
                GraAlb.setBackground(Color.white);
                panelPrincipal.removeAll();
                panelPrincipal.add(GraAlb, BorderLayout.CENTER);
                JSeparator sep = new JSeparator(JSeparator.VERTICAL);
                sep.setBackground(Color.DARK_GRAY);
                panelPrincipal.add(sep, BorderLayout.WEST);
                JLabel bienven2 = new JLabel("Da click en cualquiera de las opciones de la izquierda de la ventana");
                bienven2.setHorizontalAlignment(JLabel.CENTER);
                bienven2.setFont(fuente2);
                bienven2.setForeground(new Color(130, 130, 130));
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource().equals(titulo1)) {
                titulo1.setBackground(Color.GRAY);
            }else if(e.getSource().equals(titulo2)) {
                titulo2.setBackground(Color.GRAY);
            }else if(e.getSource().equals(titulo3)) {
                titulo3.setBackground(Color.GRAY);
            }else if(e.getSource().equals(volver)) {
                volver.setBackground(Color.GRAY);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getSource().equals(titulo1)) {
                titulo1.setBackground(Color.white);
            }else if(e.getSource().equals(titulo2)) {
                titulo2.setBackground(Color.white);
            }else if(e.getSource().equals(titulo3)) {
                titulo3.setBackground(Color.white);
            }else if(e.getSource().equals(volver)) {
                volver.setBackground(Color.white);
            }
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
    private void anadirTitulos() {
        JPanel panel = new JPanel();//Establecemos un Jpanel donde posteriormente lo agregaremos a una respectiva layout
        panel.setLayout(new GridLayout(4, 1));//Establecemos el layout del panel
        for(Object e: titulos){
            JButton title = (JButton)e;
            title.addMouseListener(EscuchadorRaton);
            title.setHorizontalAlignment(JLabel.CENTER);
            title.setBackground(Color.white);
            title.setBorderPainted(false);
            panel.add(title);
        }
        this.add(panel, BorderLayout.WEST);//Añadimos el panel de este metodo en la parte deseada del panel
    }

    /*Nos permite dibujar diversos componentes en pantalla, nos ayudara para crear las graficas y 
     diversas animaciones que vamos a usar*/
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
    }

    /**
     *
     * @param g Nos permite dibujar elementos con el graphics2D como un
     * parametro de graphics Se utiliza en paintComponent, sive para hacer
     * animaciones y dibujar diferentes componentes en ella.
     */
    @Override
    public void Dibujar(Graphics2D g) {

    }
}
