package modulosofia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel2 extends JPanel {
    Boolean animacion=false;
    public Panel2(){
        
        
        //Establecemos el color de fondo del panel 2
        setBackground(Color.red);
        //cambiamos el tamaño del panel
        setBounds(0, 420, 800, 180);
        //
        setLayout(null);
        //Ejecutamos el metodo 
        componentes();
        
       
        
    }
    ActionListener oyente1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            animacion = true;
        }
    };
    
    ActionListener oyente2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Se esta pudiendo..");
            JButton boton1 = new JButton("OPCION 1");
            boton1.setBounds(20,10,230,60);
        
 
        }
    };
    ActionListener oyente3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("sil se pudo 8u7");
        }
    };
    public void componentes(){
        JButton boton1 = new JButton("AQUI ES");
        boton1.setBounds(20,10,230,60);
        add(boton1); 
        boton1.addActionListener(oyente1);
        JButton boton2 = new JButton("OPCION 2");
        boton2.setBounds(280,10,230,60);
        add(boton2);
        boton2.addActionListener(oyente2);
        JButton boton3 = new JButton("OPCION 3");
        boton3.setBounds(540,10,230,60);
        add(boton3);
        boton3.addActionListener(oyente3);
        JButton boton4 = new JButton("VOLVER");
        boton4.setBounds(595,85,180,60);
        add(boton4);
        boton4.addActionListener(oyente1);
    }
    
    
    
   
}
