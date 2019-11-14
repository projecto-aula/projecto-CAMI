package proyecto.aula.Sofia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel1 extends JPanel implements Runnable{
    Image img;
    int x= getWidth()/2;
    Thread hilo;
    int incremento = 0;
    public Panel1(){
        //establecemos el color del panel
        setBackground(Color.lightGray);
        //cambiamos el tamaño del panel
        setBounds(20, 20, 755, 400);
        //
        setLayout(null);
        
        
        
        hilo = new Thread(this);
        //hilo.start();
        Animaciones();
        
        
    }
    
    ActionListener oyente1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          hilo.start();
         
        }
    };
    
    public void Animaciones(){
        
        JButton boton1 = new JButton("Iniciar");
        boton1.setBounds(0,0,100,30);
        add(boton1); 
        boton1.addActionListener(oyente1);
        
        ImageIcon imagen = new ImageIcon("fondo00.png");
        ImageIcon imagen1 = new ImageIcon("fondo01.png");
        JLabel label0 = new JLabel();
        
            label0.setBounds(0, 0, 755, 400);
            label0.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(label0.getWidth(), label0.getHeight(), Image.SCALE_SMOOTH)));
            
        JLabel label = new JLabel();
        label.setBounds(0, 0, 400, 200);
        label.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel label2 = new JLabel("Algo");
        label2.setBounds(100,100, 100, 20);
        
        add(label0);
        add(label2);
        //add(label); 
       
        
    }
    
    static int columna = 3;
    static int fila = 195;
    static int numero = 0;
    
    @Override
    public void paint(Graphics g){
        
        
        g.setColor(getBackground());
        g.fillRect(0,0, getWidth(), getHeight());
        g.setColor(Color.RED); 
        g.fillOval(x,getHeight()/2,30,30);
        
        
        
        
    }
    
    
    public void inicio(){
        hilo.start();
    }
    
    public void pausa(){
        hilo.suspend();
    }
    
    public void continuar(){
        hilo.resume();
    }
    
    @Override
    public void run() {
        
        try{
            while(true){
                while(x<getWidth()-30){
                    Thread.sleep(50);
                    x+=10;
                    repaint();
                }
                while(x>10){
                    Thread.sleep(50);
                    x-=10;
                    repaint();
                }
            }
        }
        catch(Exception e){
            
        }
        
    }
}