/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import proyecto.aula.Administrador;

/**
 *
 * @author HP
 */
public class Panel_Login extends javax.swing.JFrame{
    public Font fuente1 = new Font("Arial", Font.BOLD, 60);//Para el titulo de bienvenida
    public Font fuente2 = new Font("Arial", 0, 15);
    private final JButton ingresar = new JButton("INGRESAR");//EL titulo de la grafica 1
    
    private final JButton registrar = new JButton("REGISTRAR");//EL titulo de la grafica 2
    private final JLabel label_vacio = new JLabel("");//EL titulo de la grafica 3
    private final JLabel usuario = new JLabel("USUARIO:");//EL boton de volver al menu
    private final JLabel contraseña = new JLabel("CONTRASEÑA");
    private final JPanel panelPrincipal = new JPanel();
    private ArrayList titulos = new ArrayList();
    //Constructor de la clase graficas. Aqui es a donde se añade los elementos
    public Panel_Login() {
        this.setBackground(Color.white);//Establemos color de fondo
        this.setSize(800, 600);//establecemos tamaño del panel
        this.setLayout(new BorderLayout());//establecemos el tipo de layout que va a tener. Este es el verdadero layout principal
        titulos.add(ingresar);
        titulos.add(registrar);

        anadirTitulos();//Hacemos todas las funciones para agregar los titulos
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.white);//Añadimos color al panel como una guia

        
    }
    private final MouseListener EscuchadorRaton = new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource().equals(ingresar)) {
                
                panelPrincipal.removeAll();
                
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }else if(e.getSource().equals(registrar)) {
                
                panelPrincipal.removeAll();
                
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource().equals(ingresar)) {
                ingresar.setBackground(Color.GRAY);
            }else if(e.getSource().equals(registrar)) {
                registrar.setBackground(Color.GRAY);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getSource().equals(ingresar)) {
                ingresar.setBackground(Color.white);
            }else if(e.getSource().equals(registrar)) {
                registrar.setBackground(Color.white);
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
        panel.setLayout(new GridLayout(3, 1));//Establecemos el layout del panel
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
}
