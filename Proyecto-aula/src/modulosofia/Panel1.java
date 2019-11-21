    package modulosofia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel1 extends JPanel implements Runnable{
    
    Thread hilo;
    
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
        
        JLabel instrucciones = new JLabel("¿Cómo debería Sofia irse a México?");
        instrucciones.setBounds(100,100, 200, 20);
        JLabel opcion1 = new JLabel("1.-Ir por la selva");
        opcion1.setBounds(100,100, 100, 20);
        JButton boton1 = new JButton("INICIAR");
        boton1.setBounds(0,0,100,30);
         
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
        
        JButton op1 = new JButton();
        op1.setBounds(0,430,200,50);
        // Image img1 = new ImageIcon(getClass().getResource("fondo01.png")).getImage();
        add(op1);
        add(opcion1);
        add(instrucciones);
        add(label2);
        add(boton1);
        //add(boton2);
        add(label0);
        
        //add(label); 
       
        
    }
    static int x16a=-100,x17a=-100,y16a=-100,y17a=-100,x75a = -100, y75a = -100 ,columna = 3, fila = 195, numero = 0, cx = 3, cy = 130;
    static int x00=200, x1 = -100, x2 = -100, x3 = -100, x4 = -100, x5 = -100, x6 = -100, x7 = -100, x8 = -100, x9 = -100, x10 = -100;
    static int x11= -100, x12 = -100, x13 = -100, x14 = -100, x15 = -100, x16 = -100, x17 = -100 , x18 = -100, x19 = -100, x20 = -100, x21 = -100, x22 = -100 , x23 = -100
    , x24 = -100, x25 = -100, x26 = -100, x27 = -100, x28 = -100, x29 = -100, x30 = -100, x31 = -100, x32 = -100, x33 = -100, x34 = -100, x35 = -100, x36 = -100, x37 = -100, x38 = -100
    , x39 = -100 , x40 = -100, x41 = -100, x42 = -100, x43 = -100, x44 = -100, x45 = -100, x46 = -100 , x47 = -100, x48 = -100, x49 = -100, x50 = -100, x51 = -100, x52 = -100
    , x53 = -100 , x54 = -100, x55 = -100, x56 = -100, x57 = -100, x58 = -100, x59 = -100, x60 = -100 , x61 = -100, x62 = -100, x63 = -100, x64 = -100, x65 = -100, x66 = -100
    , x67 = -100 , x68 = -100, x69 = -100, x70 = -100, x71 = -100, x72 = -100, x73 = -1000, x74 = -1000 , x75 = -100, x76 = -100, x77 = -100, x78 = -100, x79 = -100, x80 = -100
    , x81 = -100, x82 = -100 , x83 = -100, x84 = -100, x85 = -100, x86 = -100, x87 = -100, x88 = -1000, x89 = -1000 , x90 = -100, x91 = -100, x92 = -100, x93 = -100, x94 = -100, x95 = -100
    , x96 = -100, x97 = -100 , x98 = -100, x99 = -100, x100 = -100, x101 = -100, x102 = -100, x103 = -1000, x104 = -1000 , x105 = -100, x106 = -100, x107 = -100, x108 = -100, x109 = -100, x110 = -100;
    static int y00=200, y1 = -100, y2 = -100, y3 = -100, y4 = -100, y5 = -100, y6 = -100, y7 = -100, y8 = -100, y9 = -100, y10 = -100, y11= -100, y12 = -100, y13 = -100, y14 = -100
    , y15 = -100, y16 = -100, y17 = -100, y18 = -100, y19 = -100, y20 = -100, y21 = -100, y22 = -100, y23 = -100, y24 = -100, y25 = -100, y26 = -100, y27 = -100, y28 = -100
    , y29 = -100, y30 = -100, y31 = -100, y32 = -100, y33 = -100, y34 = -100, y35 = -100, y36 = -100, y37 = -100, y38 = -100, y39 = -100, y40 = -100, y41 = -100, y42 = -100
    , y43 = -100, y44 = -100, y45 = -100, y46 = -100 , y47 = -100, y48 = -100, y49 = -100, y50 = -100, y51 = -100, y52 = -100, y53 = -100 , y54 = -100, y55 = -100, y56 = -100, y57 = -100
    ,y58 = -100, y59 = -100, y60 = -100 , y61 = -100, y62 = -100, y63 = -100, y64 = -100, y65 = -100, y66 = -100
    , y67 = -100 , y68 = -100, y69 = -100, y70 = -100, y71 = -100, y72 = -100, y73 = -100, y74 = -100 , y75 = -100, y76 = -100, y77 = -100, y78 = -100, y79 = -100, y80 = -100
    , y81 = -100, y82 = -100 , y83 = -100, y84 = -100, y85 = -100, y86 = -100, y87 = -100, y88 = -1000, y89 = -1000 , y90 = -100, y91 = -100, y92 = -100, y93 = -100, y94 = -100, y95 = -100
    , y96 = -100, y97 = -100 , y98 = -100, y99 = -100, y100 = -100, y101 = -100, y102 = -100, y103 = -1000, y104 = -1000 , y105 = -100, y106 = -100, y107 = -100, y108 = -100, y109 = -100, y110 = -100;
    
    
    @Override
    public void paint(Graphics g){
        try {
            
            g.setColor(getBackground());
            g.fillRect(0, 0, 755, 400);
            //ANIMACION 1 **********************************************************************************
            //texto
            
            g.setColor(Color.black);
            g.setFont( new Font( "Monospaced", Font.ITALIC, 13 ) );
            g.drawString( "Ella es Sofía, su país presenta una situación económica difícil, ya que", 120, 20 );
            g.drawString( "se presenta una alza a los precios en la canasta básica, además de que los ", 120, 40 );
              g.drawString( "trabajos se hacen cada vez más escasos y peor remunerados", 120, 60 );
            //componentes de sofia
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
            
            //Estadisticas
            /*
            g.setColor(Color.red);
            Polygon polygone = new Polygon();
            polygone.addPoint( 100, 100 );//figura 46
            polygone.addPoint( 140, 140 );//figura 47
            polygone.addPoint( 160, 120 );//figura 48
            polygone.addPoint( 200, 160 );//figura 49
            polygone.addPoint( 180, 170 );//figura 50
            polygone.addPoint( 220, 190 );//figura 51
            polygone.addPoint( 230, 170 );//figura 52
            polygone.addPoint( 210, 165 );//figura 53
            polygone.addPoint( 110, 110 );//figura 54
            polygone.addPoint( 140, 130 );//figura 55
            polygone.addPoint( 100, 80 );//figura 56
            g.fillPolygon( polygone ); 
            */
            
            //Canasta basica deficiente
            g.setColor(Color.black);
            Polygon polygoncb = new Polygon();
            polygoncb.addPoint( x56, y56 );//figura 56
            polygoncb.addPoint( x57, y57 );//figura 57
            polygoncb.addPoint( x58, y58 );//figura 58
            polygoncb.addPoint( x59, y59 );//figura 59
            g.fillPolygon( polygoncb );
            g.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
            g.drawString( "== $$$", x60, y60 );//figura 60
            //sin empleos
            g.setColor(new Color(62, 39, 35));
            Polygon polygonse = new Polygon();
            polygonse.addPoint( x61, y61 );//figura 61
            polygonse.addPoint( x62, y62 );//figura 62
            polygonse.addPoint( x63, y63 );//figura 63
            polygonse.addPoint( x64, y64 );//figura 64
            g.fillPolygon( polygonse );
            g.setColor(Color.yellow);
            Polygon polygonse1 = new Polygon();
            polygonse1.addPoint( x65, y65 );//figura 65
            polygonse1.addPoint( x66, y66 );//figura 66
            polygonse1.addPoint( x67, y67 );//figura 67
            polygonse1.addPoint( x68, y68 );//figura 68
            polygonse1.addPoint( x69, y69 );//figura 69
            polygonse1.addPoint( x70, y70 );//figura 70
            polygonse1.addPoint( x71, y71 );//figura 71
            polygonse1.addPoint( x72, y72 );//figura 72
            g.fillPolygon( polygonse1 );
            g.setColor(Color.red);
            g.drawOval(x73, y73, 240, 240);//figura 73
            g.drawLine(x74, y74, x75a, y75a);//figura 74
            //715,120
            //ANIMACION 2 ***************************************************************************************************
            //documentos
            g.setColor(Color.white);
            Polygon polygond = new Polygon();
            polygond.addPoint( x75, y75 );//figura 75
            polygond.addPoint( x76, y76 );//figura 76
            polygond.addPoint( x77, y77 );//figura 77
            polygond.addPoint( x78, y78 );//figura 78
            g.fillPolygon( polygond );
            //casa
            g.setColor(new Color(255, 112, 67));
            Polygon polygonc3 = new Polygon();
            polygonc3.addPoint( x79, y79 );//figura 79
            polygonc3.addPoint( x80, y80 );//figura 80
            polygonc3.addPoint( x81, y81 );//figura 81
            polygonc3.addPoint( x82, y82 );//figura 82
            polygonc3.addPoint( x83, y83 );//figura 83
            g.fillPolygon( polygonc3 );
            //auto
            
            g.setColor(Color.red);
            Polygon polygonc4 = new Polygon();
            polygonc4.addPoint( x84, y84 );//figura 84
            polygonc4.addPoint( x85, y85 );//figura 85
            polygonc4.addPoint( x86, y86 );//figura 86
            polygonc4.addPoint( x87, y87 );//figura 87
            polygonc4.addPoint( x88, y88 );//figura 88
            polygonc4.addPoint( x89,y89 );//figura 89
            polygonc4.addPoint( x90, y90 );//figura 90
            polygonc4.addPoint( x91, y91 );//figura 91
            g.fillPolygon( polygonc4 );
            g.setColor(Color.blue);
            Polygon polygonc5 = new Polygon();
            polygonc5.addPoint( x92, y92 );//figura 92
            polygonc5.addPoint( x93, y93 );//figura 93
            polygonc5.addPoint( x94, y94 );//figura 94
            polygonc5.addPoint( x95, y95 );//figura 95
            g.fillPolygon( polygonc5 );
            g.setColor(Color.black);
            g.fillOval(x96, y96, 25, 25);//figura96
            g.fillOval(x97, y97, 25, 25);//figura 97
            
            /*
            //ANIMACION 3****************************************************************************************************
            //arma y dinero 
            g.setColor(new Color(255, 209, 128));
            g.drawArc(300, 180, 90, 90, 130, 280);//figura 98
            g.drawLine(317, 191, 280, 155);//figura 99
            g.drawLine(280, 155, 400, 155);//figura 100
            g.drawLine(400, 155, 375, 191);//figura 101
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
            */
            //ANIMACION 4 ***************************************************************************************************
            //
            
        } catch(Exception e){
            System.out.println("Error en el hilo ");
        }   
        
        
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
                //Animacion 1 ************************************************
                
                while(x00<300){
                    Thread.sleep(2);
                    x00+=10;
                    repaint();
                    
                }
                while(y00<30){
                    Thread.sleep(2);
                    y00+=10;
                    repaint();
                }
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
                /*
                while(x45<100){
                    Thread.sleep(2);
                    x45+=1;
                    repaint();
                    
                }
                while(y45<120){
                    Thread.sleep(2);
                    y45+=1;
                    repaint();
                }
                while(x46<100){
                    Thread.sleep(2);
                    x46+=1;
                    repaint();
                    
                }
                while(y46<120){
                    Thread.sleep(2);
                    y46+=1;
                    repaint();
                }
                while(x47<140){
                    Thread.sleep(2);
                    x47+=1;
                    repaint();
                    
                }
                while(y47<140){
                    Thread.sleep(2);
                    y47+=1;
                    repaint();
                }
                while(x48<100){
                    Thread.sleep(2);
                    x48+=1;
                    repaint();
                    
                }
                while(y48<120){
                    Thread.sleep(2);
                    y48+=1;
                    repaint();
                }
                while(x49<100){
                    Thread.sleep(2);
                    x49+=1;
                    repaint();
                    
                }
                while(y49<120){
                    Thread.sleep(2);
                    y49+=1;
                    repaint();
                }
                while(x50<100){
                    Thread.sleep(2);
                    x50+=1;
                    repaint();
                    
                }
                while(y50<120){
                    Thread.sleep(2);
                    y50+=1;
                    repaint();
                }
                while(x51<100){
                    Thread.sleep(2);
                    x51+=1;
                    repaint();
                    
                }
                while(y51<120){
                    Thread.sleep(2);
                    y51+=1;
                    repaint();
                }
                while(x52<100){
                    Thread.sleep(2);
                    x52+=1;
                    repaint();
                    
                }
                while(y52<120){
                    Thread.sleep(2);
                    y52+=1;
                    repaint();
                }
                while(x53<100){
                    Thread.sleep(2);
                    x+=1;
                    repaint();
                    
                }
                while(y53<120){
                    Thread.sleep(2);
                    y53+=1;
                    repaint();
                }
                while(x54<100){
                    Thread.sleep(2);
                    x54+=1;
                    repaint();
                    
                }
                while(y54<120){
                    Thread.sleep(2);
                    y54+=1;
                    repaint();
                }
                while(x55<100){
                    Thread.sleep(2);
                    x55+=1;
                    repaint();
                    
                }
                while(y55<120){
                    Thread.sleep(2);
                    y55+=1;
                    repaint();
                }
                */
                while(x56<300){
                    Thread.sleep(2);
                    x56+=10;
                    repaint();
                    
                }
                while(y56<300){
                    Thread.sleep(2);
                    y56+=10;
                    repaint();
                }

                while(x57<300){
                    Thread.sleep(2);
                    x57+=10;
                    repaint();
                    
                }
                while(y57<350){
                    Thread.sleep(2);
                    y57+=10;
                    repaint();
                }
                while(x58<350){
                    Thread.sleep(2);
                    x58+=10;
                    repaint();
                    
                }
                while(y58<350){
                    Thread.sleep(2);
                    y58+=10;
                    repaint();
                }
                while(x59<350){
                    Thread.sleep(2);
                    x59+=10;
                    repaint();
                    
                }
                while(y59<300){
                    Thread.sleep(2);
                    y59+=10;
                    repaint();
                }
                while(x60<370){
                    Thread.sleep(2);
                    x60+=10;
                    repaint();
                    
                }
                while(y60<325){
                    Thread.sleep(2);
                    y60+=5;
                    repaint();
                }
                while(x61<575){
                    Thread.sleep(2);
                    x61+=5;
                    repaint();
                    
                }
                while(y61<150){
                    Thread.sleep(2);
                    y61+=10;
                    repaint();
                }
                while(x62<575){
                    Thread.sleep(2);
                    x62+=5;
                    repaint();
                    
                }
                while(y62<300){
                    Thread.sleep(2);
                    y62+=10;
                    repaint();
                }
                while(x63<725){
                    Thread.sleep(2);
                    x63+=5;
                    repaint();
                    
                }
                while(y63<300){
                    Thread.sleep(2);
                    y63+=10;
                    repaint();
                }
                while(x64<725){
                    Thread.sleep(2);
                    x64+=5;
                    repaint();
                    
                }
                while(y64<150){
                    Thread.sleep(2);
                    y64+=10;
                    repaint();
                }
                while(x65<600){
                    Thread.sleep(2);
                    x65+=10;
                    repaint();
                    
                }
                while(y65<125){
                    Thread.sleep(2);
                    y65+=5;
                    repaint();
                }
                while(x66<600){
                    Thread.sleep(2);
                    x66+=10;
                    repaint();
                    
                }
                while(y66<150){
                    Thread.sleep(2);
                    y66+=10;
                    repaint();
                }
                while(x67<620){
                    Thread.sleep(2);
                    x67+=10;
                    repaint();
                    
                }
                while(y67<150){
                    Thread.sleep(2);
                    y67+=10;
                    repaint();
                }
                while(x68<620){
                    Thread.sleep(2);
                    x68+=10;
                    repaint();
                    
                }
                while(y68<135){
                    Thread.sleep(2);
                    y68+=5;
                    repaint();
                }
                while(x69<690){
                    Thread.sleep(2);
                    x69+=10;
                    repaint();
                    
                }
                while(y69<135){
                    Thread.sleep(2);
                    y69+=5;
                    repaint();
                }
                while(x70<690){
                    Thread.sleep(2);
                    x70+=10;
                    repaint();
                    
                }
                while(y70<150){
                    Thread.sleep(2);
                    y70+=10;
                    repaint();
                }
                while(x71<710){
                    Thread.sleep(2);
                    x71+=10;
                    repaint();
                    
                }
                while(y71<150){
                    Thread.sleep(2);
                    y71+=10;
                    repaint();
                }
                while(x72<710){
                    Thread.sleep(2);
                    x72+=10;
                    repaint();
                    
                }
                while(y72<125){
                    Thread.sleep(2);
                    y72+=5;
                    repaint();
                }
                while(x73<525){
                    Thread.sleep(2);
                    x73+=5;
                    repaint();
                    
                }
                while(y73<100){
                    Thread.sleep(2);
                    y73+=10;
                    repaint();
                }
                while(x74<575){
                    Thread.sleep(2);
                    x74+=5;
                    repaint();
                    
                }
                while(y74<315){
                    Thread.sleep(2);
                    y74+=5;
                    repaint();
                }
                while(x75a<715){
                    Thread.sleep(2);
                    x75a+=5;
                    repaint();
                    
                }
                while(y75a<120){
                    Thread.sleep(2);
                    y75a+=10;
                    repaint();
                }
                
                //Animacion 2 ****************************************************
                /*
                while(x75<240){
                    Thread.sleep(2);
                    x75+=10;
                    repaint();
                    
                }
                while(y75<200){
                    Thread.sleep(2);
                    y75+=10;
                    repaint();
                }
                while(x76<240){
                    Thread.sleep(2);
                    x76+=10;
                    repaint();
                    
                }
                while(y76<280){
                    Thread.sleep(2);
                    y76+=10;
                    repaint();
                }
                while(x77<300){
                    Thread.sleep(2);
                    x77+=10;
                    repaint();
                    
                }
                while(y77<280){
                    Thread.sleep(2);
                    y77+=10;
                    repaint();
                }
                while(x78<300){
                    Thread.sleep(2);
                    x78+=10;
                    repaint();
                    
                }
                while(y78<200){
                    Thread.sleep(2);
                    y78+=10;
                    repaint();
                }
                while(x79<350){
                    Thread.sleep(2);
                    x79+=10;
                    repaint();
                    
                }
                while(y79<200){
                    Thread.sleep(2);
                    y79+=10;
                    repaint();
                }
                while(x80<350){
                    Thread.sleep(2);
                    x80+=10;
                    repaint();
                    
                }
                while(y80<280){
                    Thread.sleep(2);
                    y80+=10;
                    repaint();
                }
                while(x81<520){
                    Thread.sleep(2);
                    x81+=10;
                    repaint();
                    
                }
                while(y81<280){
                    Thread.sleep(2);
                    y81+=10;
                    repaint();
                }
                while(x82<520){
                    Thread.sleep(2);
                    x82+=10;
                    repaint();
                    
                }
                while(y82<200){
                    Thread.sleep(2);
                    y82+=10;
                    repaint();
                }
                while(x83<435){
                    Thread.sleep(2);
                    x83+=5;
                    repaint();
                    
                }
                while(y83<150){
                    Thread.sleep(2);
                    y83+=10;
                    repaint();
                }
                while(x84<570){
                    Thread.sleep(2);
                    x84+=10;
                    repaint();
                    
                }
                while(y84<200){
                    Thread.sleep(2);
                    y84+=10;
                    repaint();
                }
                while(x85<570){
                    Thread.sleep(2);
                    x85+=10;
                    repaint();
                    
                }
                while(y85<240){
                    Thread.sleep(2);
                    y85+=10;
                    repaint();
                }
                while(x86<700){
                    Thread.sleep(2);
                    x86+=10;
                    repaint();
                    
                }
                while(y86<240){
                    Thread.sleep(2);
                    y86+=10;
                    repaint();
                }
                while(x87<700){
                    Thread.sleep(2);
                    x87+=10;
                    repaint();
                    
                }
                while(y87<200){
                    Thread.sleep(2);
                    y87+=10;
                    repaint();
                }
                while(x88<685){
                    Thread.sleep(2);
                    x88+=5;
                    repaint();
                    
                }
                while(y88<200){
                    Thread.sleep(2);
                    y88+=10;
                    repaint();
                }
                while(x89<685){
                    Thread.sleep(2);
                    x89+=5;
                    repaint();
                    
                }
                while(y89<170){
                    Thread.sleep(2);
                    y89+=10;
                    repaint();
                }
                while(x90<585){
                    Thread.sleep(2);
                    x90+=5;
                    repaint();
                    
                }
                while(y90<170){
                    Thread.sleep(2);
                    y90+=10;
                    repaint();
                }
                while(x91<585){
                    Thread.sleep(2);
                    x91+=5;
                    repaint();
                    
                }
                while(y91<200){
                    Thread.sleep(2);
                    y91+=10;
                    repaint();
                }
                while(x92<585){
                    Thread.sleep(2);
                    x92+=5;
                    repaint();
                    
                }
                while(y92<170){
                    Thread.sleep(2);
                    y92+=10;
                    repaint();
                }
                while(x93<585){
                    Thread.sleep(2);
                    x93+=5;
                    repaint();
                    
                }
                while(y93<200){
                    Thread.sleep(2);
                    y93+=10;
                    repaint();
                }
                while(x94<610){
                    Thread.sleep(2);
                    x94+=10;
                    repaint();
                    
                }
                while(y94<200){
                    Thread.sleep(2);
                    y94+=10;
                    repaint();
                }
                while(x95<610){
                    Thread.sleep(2);
                    x95+=10;
                    repaint();
                    
                }
                while(y95<170){
                    Thread.sleep(2);
                    y95+=10;
                    repaint();
                }
                while(x96<580){
                    Thread.sleep(2);
                    x96+=10;
                    repaint();
                    
                }
                while(y96<238){
                    Thread.sleep(2);
                    y96+=1;
                    repaint();
                }
                while(x97<660){
                    Thread.sleep(2);
                    x97+=1;
                    repaint();
                    
                }
                while(y97<238){
                    Thread.sleep(2);
                    y97+=1;
                    repaint();
                }
                if (objeto.animacion==true) {
                while(x75<240){
                    Thread.sleep(2);
                    x75=-100;
                    repaint();
                    
                }
                while(y75<200){
                    Thread.sleep(2);
                    y75+=10;
                    repaint();
                }
                while(x76<240){
                    Thread.sleep(2);
                    x76+=10;
                    repaint();
                    
                }
                while(y76<280){
                    Thread.sleep(2);
                    y76+=10;
                    repaint();
                }
                while(x77<300){
                    Thread.sleep(2);
                    x77+=10;
                    repaint();
                    
                }
                while(y77<280){
                    Thread.sleep(2);
                    y77+=10;
                    repaint();
                }
                while(x78<300){
                    Thread.sleep(2);
                    x78+=10;
                    repaint();
                    
                }
                while(y78<200){
                    Thread.sleep(2);
                    y78+=10;
                    repaint();
                }
                while(x79<350){
                    Thread.sleep(2);
                    x79+=10;
                    repaint();
                    
                }
                while(y79<200){
                    Thread.sleep(2);
                    y79+=10;
                    repaint();
                }
                while(x80<350){
                    Thread.sleep(2);
                    x80+=10;
                    repaint();
                    
                }
                while(y80<280){
                    Thread.sleep(2);
                    y80+=10;
                    repaint();
                }
                while(x81<520){
                    Thread.sleep(2);
                    x81+=10;
                    repaint();
                    
                }
                while(y81<280){
                    Thread.sleep(2);
                    y81+=10;
                    repaint();
                }
                while(x82<520){
                    Thread.sleep(2);
                    x82+=10;
                    repaint();
                    
                }
                while(y82<200){
                    Thread.sleep(2);
                    y82+=10;
                    repaint();
                }
                while(x83<435){
                    Thread.sleep(2);
                    x83+=5;
                    repaint();
                    
                }
                while(y83<150){
                    Thread.sleep(2);
                    y83+=10;
                    repaint();
                }
                while(x84<570){
                    Thread.sleep(2);
                    x84+=10;
                    repaint();
                    
                }
                while(y84<200){
                    Thread.sleep(2);
                    y84+=10;
                    repaint();
                }
                while(x85<570){
                    Thread.sleep(2);
                    x85+=10;
                    repaint();
                    
                }
                while(y85<240){
                    Thread.sleep(2);
                    y85+=10;
                    repaint();
                }
                while(x86<700){
                    Thread.sleep(2);
                    x86+=10;
                    repaint();
                    
                }
                while(y86<240){
                    Thread.sleep(2);
                    y86+=10;
                    repaint();
                }
                while(x87<700){
                    Thread.sleep(2);
                    x87+=10;
                    repaint();
                    
                }
                while(y87<200){
                    Thread.sleep(2);
                    y87+=10;
                    repaint();
                }
                while(x88<685){
                    Thread.sleep(2);
                    x88+=5;
                    repaint();
                    
                }
                while(y88<200){
                    Thread.sleep(2);
                    y88+=10;
                    repaint();
                }
                while(x89<685){
                    Thread.sleep(2);
                    x89+=5;
                    repaint();
                    
                }
                while(y89<170){
                    Thread.sleep(2);
                    y89+=10;
                    repaint();
                }
                while(x90<585){
                    Thread.sleep(2);
                    x90+=5;
                    repaint();
                    
                }
                while(y90<170){
                    Thread.sleep(2);
                    y90+=10;
                    repaint();
                }
                while(x91<585){
                    Thread.sleep(2);
                    x91+=5;
                    repaint();
                    
                }
                while(y91<200){
                    Thread.sleep(2);
                    y91+=10;
                    repaint();
                }
                while(x92<585){
                    Thread.sleep(2);
                    x92+=5;
                    repaint();
                    
                }
                while(y92<170){
                    Thread.sleep(2);
                    y92+=10;
                    repaint();
                }
                while(x93<585){
                    Thread.sleep(2);
                    x93+=5;
                    repaint();
                    
                }
                while(y93<200){
                    Thread.sleep(2);
                    y93+=10;
                    repaint();
                }
                while(x94<610){
                    Thread.sleep(2);
                    x94+=10;
                    repaint();
                    
                }
                while(y94<200){
                    Thread.sleep(2);
                    y94+=10;
                    repaint();
                }
                while(x95<610){
                    Thread.sleep(2);
                    x95+=10;
                    repaint();
                    
                }
                while(y95<170){
                    Thread.sleep(2);
                    y95+=10;
                    repaint();
                }
                while(x96<580){
                    Thread.sleep(2);
                    x96+=10;
                    repaint();
                    
                }
                while(y96<238){
                    Thread.sleep(2);
                    y96+=1;
                    repaint();
                }
                while(x97<660){
                    Thread.sleep(2);
                    x97+=1;
                    repaint();
                    
                }
                while(y97<238){
                    Thread.sleep(2);
                    y97+=1;
                    repaint();
                }
                
                }
*/
                //ANIMACION 3****************************************************************************************************
                
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
                while(x102<320){
                    Thread.sleep(2);
                    x102+=1;
                    repaint();
                    
                }
                while(y102<230){
                    Thread.sleep(2);
                    y102+=1;
                    repaint();
                }
                while(x103<640){
                    Thread.sleep(2);
                    x103+=1;
                    repaint();
                    
                }
                while(y103<170){
                    Thread.sleep(2);
                    y103+=1;
                    repaint();
                }
                while(x104<640){
                    Thread.sleep(2);
                    x104+=1;
                    repaint();
                    
                }
                while(y104<200){
                    Thread.sleep(2);
                    y104+=1;
                    repaint();
                }
                while(x105<720){
                    Thread.sleep(2);
                    x105+=1;
                    repaint();
                    
                }
                while(y105<200){
                    Thread.sleep(2);
                    y105+=1;
                    repaint();
                }
                while(x106<720){
                    Thread.sleep(2);
                    x106+=1;
                    repaint();
                    
                }
                while(y106<170){
                    Thread.sleep(2);
                    y106+=1;
                    repaint();
                
                }
                //otras cosas
                
               
            }
            
        }
        catch(Exception e){
            
        }
        
    }
    
}