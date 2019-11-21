package modulosofia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import proyecto.aula.Panel_Menu;
import proyecto.aula.Ventana;

public class Panel2 extends JPanel {
    private Boolean animacion=false;
    //Esta variable indicara estado de la animacion estamos y tilizar el boton para diferentes 
    private int estado = 0;
    //iniciamos cada panel que vamos a poner en el panel
    private Panel1 animacion0 = new Panel1();
    private PanelA2 animacion1 = new PanelA2();
    private PanelA3 animacion2 = new PanelA3();
    private PanelA4 animacion3 = new PanelA4();
    public Panel2(){
        
        
        //Establecemos el color de fondo del panel 2
        setBackground(Color.white);
        //cambiamos el tamaño del panel
        //pd le cambie el tamaño
        setBounds(0, 0, 800, 600);
        //
        setLayout(null);
        //Ejecutamos el metodo 
        componentes();
        
       
        
    }
    ActionListener oyente1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(estado){
                case 0:
                    System.out.println("Estado 0 a 1");
                    cambiarPanel(animacion0, animacion1);
                    estado++;
                    break;
                case 1:
                    System.out.println("Estado 1 a 2");
                    cambiarPanel(animacion1, animacion2);
                    setAnimacion((Boolean) true);   
                    estado++;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "No puedes robar, robar es ilegal");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "No puedes robar, robar es ilegal");
                    break;
            }
        }
    };
    
    ActionListener oyente2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(estado){
                case 0:
                    cambiarPanel(animacion0, animacion1);
                    System.out.println("Estado 1 a 2");
                    estado++;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "No es lo primero que necesitas, no podrías entrar a México aunque ya hayas conseguido alojamiento");
                    break;
                case 2:
                    System.out.println("2 a 3");
                    cambiarPanel(animacion2, animacion3);
                    setAnimacion((Boolean) true);   
                    estado++;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "No es lo primero que necesitas, no podrías entrar a México aunque ya hayas conseguido alojamiento");
                    break;
            }
 
        }
    };
    ActionListener oyente3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(estado){
                case 0:
                    cambiarPanel(animacion0, animacion1);
                    estado++;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "No es lo primero que necesitas, no podrías entrar a México aunque ya hayas conseguido transporte");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "No puedes conseguir dinero si no tienes dónde vivir");
                    break;
                case 3:
                    System.out.println("3 a 4");
                    JOptionPane.showMessageDialog(null, "Felicidades, has completado el juego de sofia");
                    setAnimacion((Boolean) true);   
                    estado++;
                    break;
            }
        }
    };
    ActionListener oyente4 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ventana vent = new Ventana("Panel Menu");
            vent.add(new Panel_Menu());
            vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vent.setVisible(true);
        }
    };
    public void componentes(){
        JButton boton1 = new JButton("OPCIÓN 1");
        boton1.setBounds(20,430,230,60);
        boton1.setEnabled(true);
        add(boton1); 
        boton1.addActionListener(oyente1);
        JButton boton2 = new JButton("OPCIÓN 2");
        boton2.setBounds(280,430,230,60);
        boton2.setEnabled(true);
        add(boton2);
        boton2.addActionListener(oyente2);
        JButton boton3 = new JButton("OPCIÓN 3");
        boton3.setBounds(540,430,230,60);
        boton3.setEnabled(true);
        add(boton3);
        boton3.addActionListener(oyente3);
        JButton boton4 = new JButton("VOLVER");
        boton4.setBounds(595,500,180,60);
        add(boton4);
        boton4.setEnabled(true);
        boton4.addActionListener(oyente4);
        //Añadimos panel1
        this.add(animacion0);
    }
    /**
     * Bien esto es lo que hace el metodo.
     * panelr es el antiguo panel que quieres remover
     * paneln es el uevo panel que quieres poner
     * lo puedes llamar en cualqier momento
     * 
     * remueve panelr y pondra el panel nuevo
     * @param panelr es el antiguo panel que quieres remover
     * @param paneln es el nuevo panel que quieres poner
     */
    public void cambiarPanel(JPanel panelr, JPanel paneln){
        this.remove(panelr);
        this.add(paneln);
        this.repaint();
        this.revalidate();
    }

    public Boolean getAnimacion() {
        return animacion;
    }

    public void setAnimacion(Boolean animacion) {
        this.animacion = animacion;
    }
    
    
   
}
