package modulosofia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelA3 extends JPanel implements Runnable{
    
    Thread hilo;
    
    public PanelA3(){
        //establecemos el color del panel
        setBackground(Color.lightGray);
        //cambiamos el tamaño del panel
        setBounds(20, 20, 755, 400);
        //
        setLayout(null);
         
        hilo = new Thread(this);
        
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
        boton1.addActionListener(oyente1);
        add(boton1);
       
        
    }
    
    static int x16a=-100,x17a=-100,y16a=-100,y17a=-100, x98a = -100, x99a = -100, x100a = -100, x101a = -100, y98a = -100, y99a = -100, y100a = -100, y101a = -100; 
    static int x00=200, x1 = -100, x2 = -100, x3 = -100, x4 = -100, x5 = -100, x6 = -100, x7 = -100, x8 = -100, x9 = -100, x10 = -100
    ,x11= -100, x12 = -100, x13 = -100, x14 = -100, x15 = -100, x16 = -100, x17 = -100 , x18 = -100, x19 = -100, x20 = -100, x21 = -100, x22 = -100 , x23 = -100
    , x24 = -100, x25 = -100, x26 = -100, x27 = -100, x28 = -100, x29 = -100, x30 = -100, x31 = -100, x32 = -100, x33 = -100, x34 = -100, x35 = -100, x36 = -100, x37 = -100, x38 = -100
    , x39 = -100 , x40 = -100, x41 = -100, x42 = -100, x43 = -100, x44 = -100, x79 = -100, x80 = -100
    , x81 = -100, x82 = -100 , x83 = -100, x98 = -100, x99 = -100, x100 = -100, x101 = -100, x102 = -100, x103 = -1000, x104 = -1000 , x105 = -100, x106 = -100, x107 = -100, x108 = -100, x109 = -100, x110 = -100;
    static int y00=200, y1 = -100, y2 = -100, y3 = -100, y4 = -100, y5 = -100, y6 = -100, y7 = -100, y8 = -100, y9 = -100, y10 = -100, y11= -100, y12 = -100, y13 = -100, y14 = -100
    , y15 = -100, y16 = -100, y17 = -100, y18 = -100, y19 = -100, y20 = -100, y21 = -100, y22 = -100, y23 = -100, y24 = -100, y25 = -100, y26 = -100, y27 = -100, y28 = -100
    , y29 = -100, y30 = -100, y31 = -100, y32 = -100, y33 = -100, y34 = -100, y35 = -100, y36 = -100, y37 = -100, y38 = -100, y39 = -100, y40 = -100, y41 = -100, y42 = -100
    , y43 = -100, y44 = -100, y79 = -100, y80 = -100, y81 = -100, y82 = -100 , y83 = -100, y98 = -100, y99 = -100, y100 = -100, y101 = -100, y102 = -100, y103 = -1000, y104 = -1000 , y105 = -100, y106 = -100, y107 = -100, y108 = -100, y109 = -100, y110 = -100;
    
    
    @Override
    public void paint(Graphics g){
        try {
            
            g.setColor(getBackground());
            g.fillRect(0, 0, 755, 400);
            //componentes de sofia
            //texto
            g.setColor(Color.black);
            g.setFont( new Font( "Monospaced", Font.ITALIC, 13 ) );
            g.drawString( "¿Qué es lo que deberia hacer Sofía estando ya en México?", 120, 20 );
            g.drawString( "1.-Robar", 290, 330 );
            g.drawString( "   dinero", 290, 340 );
            g.drawString( "2.-Conseguir alojamiento", 390, 330 );
            g.drawString( "3.-Conseguir", 620, 330 );
            g.drawString( "   dinero", 620, 340 );
            //cara
            g.setColor(new Color(210, 180, 140));
            g.fillOval(x1, y1, 80, 80 );//figura 1
            //boca
            g.setColor(Color.red);
            g.fillArc(x3, y3, 15, 13, 180,180 );//figura 3
            /*
            g.setColor(Color.red);
            g.fillOval(x2,y2, 15, 13 );//figura 2
            g.setColor(Color.black);
            g.fillArc(x4, y4, 15, 7, 180,180 );//figura 4
            */
            //ojos
            g.setColor(Color.WHITE);
            g.fillOval(x5,y5,10,10);//figura 5
            g.fillOval(x6,y6,10,10);//figura 6
            g.setColor(new Color(93, 64, 55));
            g.fillOval(x7,y7,6,10);//figura 7
            g.fillOval(x8,y8,6,10);//figura 8
            //cabello
            g.setColor(Color.BLACK);
            Polygon polygonc = new Polygon();
            polygonc.addPoint( x9, y9 );//figura 9
            polygonc.addPoint( x10, y10 );//figura 10
            polygonc.addPoint( x11, y11 );//figura 11
            g.fillPolygon( polygonc ); 
            Polygon polygonc1 = new Polygon();
            polygonc1.addPoint( x12, y12 );//figura 12
            polygonc1.addPoint( x13, y13 );//figura 13
            polygonc1.addPoint( x14, y14 );//figura 14
            g.fillPolygon( polygonc1 ); 
            g.fillArc(x15, y15, 80, 60, 0,180 );//figura 15
            //nariz
            g.setColor(new Color(255, 204, 128));
            g.drawLine(x16,y16,x16a,y16a);//figura 16
            //aqui
            //125,145
            g.drawLine(x17,y17,x17a,y17a);//figura 17
            //
            //125,145
            //cuerpo
            g.setColor(Color.PINK);
            Polygon polygon1 = new Polygon();
            polygon1.addPoint( x18, y18 );//figura 18
            polygon1.addPoint( x19, y19 );//figura 19
            polygon1.addPoint( x20, y20 );//figura 20
            g.fillPolygon( polygon1 ); 
            //pies
            g.setColor(new Color(210, 180, 140));
            Polygon polygonp = new Polygon();
            polygonp.addPoint( x21, y21 );//figura 21
            polygonp.addPoint( x22, y22 );//figura 22
            polygonp.addPoint( x23, y23 );//figura 23
            polygonp.addPoint( x24, y24);//figura 24
            g.fillPolygon( polygonp ); 
            Polygon polygonp2 = new Polygon();
            polygonp2.addPoint( x25, y25 );//figura 25
            polygonp2.addPoint( x26, y26);//figura 26
            polygonp2.addPoint( x27, y27 );//figura 27
            polygonp2.addPoint( x28, y28 );//figura 28
            g.fillPolygon( polygonp2 ); 
            //zapatos
            g.setColor(Color.black);
            Polygon polygonz = new Polygon();
            polygonz.addPoint( x29, y29 );//figura 29
            polygonz.addPoint( x30, y30 );//figura 30
            polygonz.addPoint( x31, y31);//figura 31
            polygonz.addPoint( x32, y32 );//figura 32
            g.fillPolygon( polygonz );
            g.setColor(Color.black);
            Polygon polygonz2 = new Polygon();
            polygonz2.addPoint( x33, y33 );//figura 33
            polygonz2.addPoint( x34, y34 );//figura 34
            polygonz2.addPoint( x35, y35);//figura 35
            polygonz2.addPoint( x36, y36 );//figura 36
            g.fillPolygon( polygonz2 );
            //manos
            g.setColor(new Color(210, 180, 140));
            Polygon polygonm = new Polygon();
            polygonm.addPoint( x37, y37 );//figura 37
            polygonm.addPoint( x38, y38 );//figura 38
            polygonm.addPoint( x39, y39 );//figura 39
            polygonm.addPoint( x40, y40 );//figura 40
            g.fillPolygon( polygonm ); 
            g.setColor(new Color(210, 180, 140));
            Polygon polygonm2 = new Polygon();
            polygonm2.addPoint( x41, y41 );//figura 41
            polygonm2.addPoint( x42, y42 );//figura 42
            polygonm2.addPoint( x43, y43 );//figura 43
            polygonm2.addPoint( x44, y44 );//figura 44
            g.fillPolygon( polygonm2 );
            //casa
            g.setColor(new Color(255, 112, 67));
            Polygon polygonc3 = new Polygon();
            polygonc3.addPoint( x79, y79 );//figura 79
            polygonc3.addPoint( x80, y80 );//figura 80
            polygonc3.addPoint( x81, y81 );//figura 81
            polygonc3.addPoint( x82, y82 );//figura 82
            polygonc3.addPoint( x83, y83 );//figura 83
            g.fillPolygon( polygonc3 );
            //arma y dinero 
            g.setColor(new Color(255, 209, 128));
            g.drawArc(x98, y98, 90, 90, x98a, y98a);//figura 98
            g.drawLine(x99, y99, x99a, y99a);//figura 99
            g.drawLine(x100, y100, x100a, y100a);//figura 100
            g.drawLine(x101, y101, x101a, y101a);//figura 101
            g.setColor(new Color(27, 94, 32));
            g.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
            g.drawString( "$$$", 320, 230 );//figura 104   
            g.setColor(new Color(51, 105, 30));
            Polygon polygona = new Polygon();
            polygona.addPoint( 640, 170 );//figura 105
            polygona.addPoint( 640, 200 );//figura 106
            polygona.addPoint( 720, 200 );//figura 107
            polygona.addPoint( 720, 170 );//figura 108
            g.fillPolygon( polygona );
            
        }
        catch(Exception e){
            System.out.println("Error en el hilo");
        }
    }
    
    @Override
    public void run() {
        try{
            while(true){
                
                while(x1<80){
                    Thread.sleep(2);
                    x1+=10;
                    repaint();
                    
                }
                while(y1<90){
                    Thread.sleep(2);
                    y1+=10;
                    repaint();
                }
                while(x2<115){
                    Thread.sleep(2);
                    x2+=5;
                    repaint();
                    
                }
                while(y2<150){
                    Thread.sleep(2);
                    y2+=10;
                    repaint();
                }
                while(x3<115){
                    Thread.sleep(2);
                    x3+=5;
                    repaint();
                    
                }
                while(y3<150){
                    Thread.sleep(2);
                    y3+=10;
                    repaint();
                }
                while(x4<115){
                    Thread.sleep(2);
                    x4+=5;
                    repaint();
                    
                }
                while(y4<150){
                    Thread.sleep(2);
                    y4+=2;
                    repaint();
                }
                while(x5<100){
                    Thread.sleep(2);
                    x5+=10;
                    repaint();
                    
                }
                while(y5<120){
                    Thread.sleep(2);
                    y5+=10;
                    repaint();
                }
                while(x6<130){
                    Thread.sleep(2);
                    x6+=1;
                    repaint();
                    
                }
                while(y6<120){
                    Thread.sleep(2);
                    y6+=1;
                    repaint();
                }
                while(x7<102){
                    Thread.sleep(2);
                    x7+=1;
                    repaint();
                    
                }
                while(y7<120){
                    Thread.sleep(2);
                    y7+=1;
                    repaint();
                }
                while(x8<132){
                    Thread.sleep(2);
                    x8+=1;
                    repaint();
                    
                }
                while(y8<120){
                    Thread.sleep(2);
                    y8+=1;
                    repaint();
                }
                while(x9<157){
                    Thread.sleep(2);
                    x9+=1;
                    repaint();
                    
                }
                while(y9<117){
                    Thread.sleep(2);
                    y9+=1;
                    repaint();
                }
                while(x10<200){
                    Thread.sleep(2);
                    x10+=1;
                    repaint();
                    
                }
                while(y10<150){
                    Thread.sleep(2);
                    y10+=1;
                    repaint();
                }
                while(x11<170){
                    Thread.sleep(2);
                    x11+=1;
                    repaint();
                    
                }
                while(y11<170){
                    Thread.sleep(2);
                    y11+=1;
                    repaint();
                }
                while(x12<83){
                    Thread.sleep(2);
                    x12+=1;
                    repaint();
                    
                }
                while(y12<117){
                    Thread.sleep(2);
                    y12+=1;
                    repaint();
                }
                while(x13<40){
                    Thread.sleep(2);
                    x13+=1;
                    repaint();
                    
                }
                while(y13<150){
                    Thread.sleep(2);
                    y13+=1;
                    repaint();
                }
                while(x14<70){
                    Thread.sleep(2);
                    x14+=10;
                    repaint();
                    
                }
                
                while(y14<170){
                    Thread.sleep(2);
                    y14+=10;
                    repaint();
                }
                while(x15<80){
                    Thread.sleep(2);
                    x15+=10;
                    repaint();
                    
                }
                while(y15<90){
                    Thread.sleep(2);
                    y15+=10;
                    repaint();
                }
                while(x16<120){
                    Thread.sleep(2);
                    x16+=10;
                    repaint();
                    
                }
                while(y16<130){
                    Thread.sleep(2);
                    y16+=10;
                    repaint();
                }
                while(x16a<125){
                    Thread.sleep(2);
                    x16a+=10;
                    repaint();
                    
                }
                while(y16a<145){
                    Thread.sleep(2);
                    y16a+=10;
                    repaint();
                }
                while(x17<120){
                    Thread.sleep(2);
                    x17+=10;
                    repaint();
                    
                }
                while(y17<145){
                    Thread.sleep(2);
                    y17+=5;
                    repaint();
                }
                while(x17a<125){
                    Thread.sleep(2);
                    x17a+=10;
                    repaint();
                    
                }
                while(y17a<145){
                    Thread.sleep(2);
                    y17a+=5;
                    repaint();
                }
                while(x18<70){
                    Thread.sleep(2);
                    x18+=10;
                    repaint();
                    
                }
                while(y18<300){
                    Thread.sleep(2);
                    y18+=10;
                    repaint();
                }
                while(x19<120){
                    Thread.sleep(2);
                    x19+=10;
                    repaint();
                    
                }
                while(y19<170){
                    Thread.sleep(2);
                    y19+=10;
                    repaint();
                }
                while(x20<180){
                    Thread.sleep(2);
                    x20+=10;
                    repaint();
                    
                }
                while(y20<300){
                    Thread.sleep(2);
                    y20+=10;
                    repaint();
                }
                while(x21<100){
                    Thread.sleep(2);
                    x21+=10;
                    repaint();
                    
                }
                while(y21<300){
                    Thread.sleep(2);
                    y21+=10;
                    repaint();
                }
                while(x22<100){
                    Thread.sleep(2);
                    x22+=10;
                    repaint();
                    
                }
                while(y22<350){
                    Thread.sleep(2);
                    y22+=10;
                    repaint();
                }
                while(x23<115){
                    Thread.sleep(2);
                    x23+=5;
                    repaint();
                    
                }
                while(y23<350){
                    Thread.sleep(2);
                    y23+=10;
                    repaint();
                }
                while(x24<115){
                    Thread.sleep(2);
                    x24+=5;
                    repaint();
                    
                }
                while(y24<300){
                    Thread.sleep(2);
                    y24+=10;
                    repaint();
                }
                while(x25<135){
                    Thread.sleep(2);
                    x25+=5;
                    repaint();
                    
                }
                while(y25<300){
                    Thread.sleep(2);
                    y25+=10;
                    repaint();
                }
                while(x26<135){
                    Thread.sleep(2);
                    x26+=10;
                    repaint();
                    
                }
                while(y26<350){
                    Thread.sleep(2);
                    y26+=10;
                    repaint();
                }
                while(x27<150){
                    Thread.sleep(2);
                    x27+=10;
                    repaint();
                    
                }
                while(y27<350){
                    Thread.sleep(2);
                    y27+=10;
                    repaint();
                }
                while(x28<150){
                    Thread.sleep(2);
                    x28+=10;
                    repaint();
                    
                }
                while(y28<300){
                    Thread.sleep(2);
                    y28+=10;
                    repaint();
                }
                while(x29<100){
                    Thread.sleep(2);
                    x29+=10;
                    repaint();
                    
                }
                while(y29<350){
                    Thread.sleep(2);
                    y29+=10;
                    repaint();
                }
                while(x30<100){
                    Thread.sleep(2);
                    x30+=10;
                    repaint();
                    
                }
                while(y30<360){
                    Thread.sleep(2);
                    y30+=10;
                    repaint();
                }
                while(x31<125){
                    Thread.sleep(2);
                    x31+=5;
                    repaint();
                    
                }
                while(y31<360){
                    Thread.sleep(2);
                    y31+=10;
                    repaint();
                }
                while(x32<125){
                    Thread.sleep(2);
                    x32+=5;
                    repaint();
                    
                }
                while(y32<350){
                    Thread.sleep(2);
                    y32+=10;
                    repaint();
                }
                while(x33<135){
                    Thread.sleep(2);
                    x33+=5;
                    repaint();
                    
                }
                while(y33<350){
                    Thread.sleep(2);
                    y33+=10;
                    repaint();
                }
                while(x34<135){
                    Thread.sleep(2);
                    x34+=5;
                    repaint();
                    
                }
                while(y34<360){
                    Thread.sleep(2);
                    y34+=10;
                    repaint();
                }
                while(x35<160){
                    Thread.sleep(2);
                    x35+=10;
                    repaint();
                    
                }
                while(y35<360){
                    Thread.sleep(2);
                    y35+=10;
                    repaint();
                }
                while(x36<160){
                    Thread.sleep(2);
                    x36+=10;
                    repaint();
                    
                }
                while(y36<350){
                    Thread.sleep(2);
                    y36+=10;
                    repaint();
                }
                
                while(x37<40){
                    Thread.sleep(2);
                    x37+=10;
                    repaint();
                    
                }
                while(y37<200){
                    Thread.sleep(2);
                    y37+=10;
                    repaint();
                }
                while(x38<40){
                    Thread.sleep(2);
                    x38+=10;
                    repaint();
                    
                }
                while(y38<215){
                    Thread.sleep(2);
                    y38+=5;
                    repaint();
                }
                while(x39<103){
                    Thread.sleep(2);
                    x39+=1;
                    repaint();
                    
                }
                while(y39<215){
                    Thread.sleep(2);
                    y39+=5;
                    repaint();
                }
                while(x40<109){
                    Thread.sleep(2);
                    x40+=1;
                    repaint();
                    
                }
                while(y40<200){
                    Thread.sleep(2);
                    y40+=10;
                    repaint();
                }
                while(x41<134){
                    Thread.sleep(2);
                    x41+=1;
                    repaint();
                    
                }
                while(y41<200){
                    Thread.sleep(2);
                    y41+=10;
                    repaint();
                }
                while(x42<140){
                    Thread.sleep(2);
                    x42+=10;
                    repaint();
                    
                }
                while(y42<215){
                    Thread.sleep(2);
                    y42+=5;
                    repaint();
                }
                while(x43<203){
                    Thread.sleep(2);
                    x43+=1;
                    repaint();
                    
                }
                while(y43<215){
                    Thread.sleep(2);
                    y43+=5;
                    repaint();
                }
                while(x44<203){
                    Thread.sleep(2);
                    x44+=1;
                    repaint();
                    
                }
                while(y44<200){
                    Thread.sleep(2);
                    y44+=10;
                    repaint();
                }
                while(x79<400){
                    Thread.sleep(2);
                    x79+=10;
                    repaint();
                    
                }
                while(y79<200){
                    Thread.sleep(2);
                    y79+=10;
                    repaint();
                }
                while(x80<400){
                    Thread.sleep(2);
                    x80+=10;
                    repaint();
                    
                }
                while(y80<280){
                    Thread.sleep(2);
                    y80+=10;
                    repaint();
                }
                while(x81<570){
                    Thread.sleep(2);
                    x81+=10;
                    repaint();
                    
                }
                while(y81<280){
                    Thread.sleep(2);
                    y81+=10;
                    repaint();
                }
                while(x82<570){
                    Thread.sleep(2);
                    x82+=10;
                    repaint();
                    
                }
                while(y82<200){
                    Thread.sleep(2);
                    y82+=10;
                    repaint();
                }
                while(x83<485){
                    Thread.sleep(2);
                    x83+=5;
                    repaint();
                    
                }
                while(y83<150){
                    Thread.sleep(2);
                    y83+=10;
                    repaint();
                }
                while(x98<300){
                    Thread.sleep(2);
                    x98+=1;
                    repaint();
                    
                }
                while(y98<180){
                    Thread.sleep(2);
                    y98+=1;
                    repaint();
                }
                while(x98a<130){
                    Thread.sleep(2);
                    x98a+=1;
                    repaint();
                    
                }
                while(y98a<280){
                    Thread.sleep(2);
                    y98a+=1;
                    repaint();
                }
                while(x99<317){
                    Thread.sleep(2);
                    x99+=1;
                    repaint();
                    
                }
                while(y99<191){
                    Thread.sleep(2);
                    y99+=1;
                    repaint();
                }
                while(x99a<280){
                    Thread.sleep(2);
                    x99a+=1;
                    repaint();
                    
                }
                while(y99a<155){
                    Thread.sleep(2);
                    y99a+=1;
                    repaint();
                }
                while(x100<280){
                    Thread.sleep(2);
                    x100+=1;
                    repaint();
                    
                }
                while(y100<155){
                    Thread.sleep(2);
                    y100+=1;
                    repaint();
                }
                while(x100a<400){
                    Thread.sleep(2);
                    x100a+=1;
                    repaint();
                    
                }
                while(y100a<155){
                    Thread.sleep(2);
                    y100a+=1;
                    repaint();
                }
                while(x101<400){
                    Thread.sleep(2);
                    x101+=1;
                    repaint();
                    
                }
                while(y101<155){
                    Thread.sleep(2);
                    y101+=1;
                    repaint();
                }
                while(x101a<375){
                    Thread.sleep(2);
                    x101a+=1;
                    repaint();
                    
                }
                while(y101a<191){
                    Thread.sleep(2);
                    y101a+=1;
                    repaint();
                }
                /*
                while(x104<640){
                    Thread.sleep(2);
                    x104+=1;
                    repaint();
                   
            polygona.addPoint( 720, 170 );//figura 108
*/

            }
        }
        catch(Exception e){
            System.out.println("Error en el hilo");
        }
    }
    
    
}
