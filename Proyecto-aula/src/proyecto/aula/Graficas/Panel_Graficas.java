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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.animation.ScaleTransition;
import javafx.animation.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import proyecto.aula.*;//Importamos ha este paquete las clases que se habian hecho hasta el momento
//He decido manejar diferentes paquetes debido a que uno se puede perder con facilidad entre 
//Todas las clases que se van a tener.

/**
 *
 * @author Equipo-Luis Fernando Tenori Aspiros
 */
public class Panel_Graficas extends Panel_Base {

    public Font fuente1 = new Font("Comic Sans MS", Font.PLAIN, 13);//Para el titulo de bienvenida
    public Font fuente2 = new Font("Comic Sans MS", 0, 12);
    private final JButton titulo1 = new JButton("Albergues en la ciudad de México");//EL titulo de la grafica 1
    private final JButton titulo2 = new JButton("Nivel de volencia que sufren los migrantes");//EL titulo de la grafica 2
    private final JButton titulo3 = new JButton("Población de migrantes");//EL titulo de la grafica 3
    private ArrayList titulos = new ArrayList();
    private final JButton volver = new JButton("Volver");//EL boton de volver al menu
    private final JPanel panelPrincipal = new JPanel();
    private final JFXPanel fxP = new JFXPanel();
    //Thread h = new hilo(fxP);

    //Constructor de la clase graficas. Aqui es a donde se añade los elementos
    public Panel_Graficas() {
        this.setBackground(Color.white);//Establemos color de fondo
        this.setSize(800, 600);//establecemos tamaño del panel
        this.setLayout(new BorderLayout());//establecemos el tipo de layout que va a tener. Este es el verdadero layout principal
        volver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana vent = new Ventana("Panel Menu");
                vent.add(new Panel_Menu());
                vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vent.setVisible(true);
            }
        });
        titulos.add(volver);
        anadirTitulos();//Hacemos todas las funciones para agregar los titulos
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.white);//Añadimos color al panel como una guia
        try {
            panelPrincipal.add(fxP, BorderLayout.CENTER);
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    IniciarFX();
                }
            });
        } catch (Exception e) {
            System.out.println("Algo ha pasado " + e.getMessage());
        }

        this.add(panelPrincipal, BorderLayout.CENTER);//Añadimos el panel donde iran las diferentes panels de graficas
    }

    private void IniciarFX() {
        Scene scene = createScene();
        fxP.setScene(scene);
    }

    private Scene createScene() {
        Group root = new Group();
        Scene scene = new Scene(root, javafx.scene.paint.Color.WHITE);
        annadirPartePastel(root);

        return (scene);
    }

    private void annadirPartePastel(Group root) {
        //Este es el texto que se estara cambiando
        Text text = new Text();
        //Poscison del texto y otros atributos
        text.setX(200);
        text.setY(300);
        text.setFont(new javafx.scene.text.Font(15));
        text.setFill(javafx.scene.paint.Color.GRAY);
        text.setText("pasa el mouse por encima de las graficas");
        root.getChildren().add(text);
        //Clase pastel para hacer las graficas
        
        Pastel_Albergues alb1 = new Pastel_Albergues("En Alvaro Obregon hay el ", 0, 5, 5);
        Pastel_Albergues alb2 = new Pastel_Albergues("En Azcapotzalco hay el ", 5 , 2, 7);
        Pastel_Albergues alb3 = new Pastel_Albergues("En Benito Juárez hay el ", 7, 5, 6);
        Pastel_Albergues alb4 = new Pastel_Albergues("En Coyoacán hay el ", 12, 16, 1);
        Pastel_Albergues alb5 = new Pastel_Albergues("En Cuauhtémoc hay el ", 28, 11, 3);
        Pastel_Albergues alb6 = new Pastel_Albergues("En Cuaujimalpa hay el ", 39, 2, 5);
        Pastel_Albergues alb7 = new Pastel_Albergues("En Tlalpan hay el ", 41 , 5, 7);
        Pastel_Albergues alb8 = new Pastel_Albergues("En Miguel Hidalgo hay el ", 46, 11, 6);
        Pastel_Albergues alb9 = new Pastel_Albergues("En Milpa Alta hay el ", 57, 2, 1);
        Pastel_Albergues alb10 = new Pastel_Albergues("En Gustavo A. Madero hay el ", 59, 5, 3);
        Pastel_Albergues alb11 = new Pastel_Albergues("En Iztacalco hay el ", 64, 12, 5);
        Pastel_Albergues alb12 = new Pastel_Albergues("En Iztapalapa hay el ", 76 , 12, 7);
        Pastel_Albergues alb13 = new Pastel_Albergues("En Magdalena Contreras hay el ", 88, 5, 6);
        Pastel_Albergues alb14 = new Pastel_Albergues("En Tláhuac hay el ", 93, 5, 1);
        Pastel_Albergues alb15 = new Pastel_Albergues("En Xochimilco hay el ", 98, 2, 3);
        ArrayList<Pastel_Albergues> alblist = new ArrayList();
        alblist.add(alb1);
        alblist.add(alb2);
        alblist.add(alb3);
        alblist.add(alb4);
        alblist.add(alb5);
        alblist.add(alb6);
        alblist.add(alb7);
        alblist.add(alb8);
        alblist.add(alb9);
        alblist.add(alb10);
        alblist.add(alb11);
        alblist.add(alb12);
        alblist.add(alb13);
        alblist.add(alb14);
        alblist.add(alb15);
        
        for (int i = 0; i < alblist.size(); i++) {
            Pastel_Albergues alb = alblist.get(i);
            //Establecemos que colores vamos a querer para las graficas
            if((i + 1) % 2 == 0){
                alb.setFill(javafx.scene.paint.Color.TOMATO);
            }else if((i + 1) % 3 == 0){
                alb.setFill(javafx.scene.paint.Color.AQUA);
            }else if((i + 1) % 5 == 0){
                alb.setFill(javafx.scene.paint.Color.DEEPSKYBLUE);    
            }else{
                alb.setFill(javafx.scene.paint.Color.ORANGE);
            }
            //Lo añadimos como tal al fxP
            root.getChildren().add(alb);
            //añadimos unos eventos para el mouse de la grafica
            EventHandler entered = new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    text.setText(alb.getMensaje() + alb.getPorcentaje() + "% de los albergues en la ciudad de México");
                    FadeTransition ft = new FadeTransition(Duration.millis(50000), text);
                    ft.setFromValue(0.0f);
                    ft.setToValue(1.0f);
                    ft.setCycleCount(1);
                    ft.setAutoReverse(false);
                    ScaleTransition scl = new ScaleTransition(Duration.millis(500), alb);
                    scl.setToX(1.2f);
                    scl.setToY(1.2f);
                    scl.play();
                    event.consume();
                }

            };
            EventHandler exited = new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    text.setText("Pasa el mouse por encima de las graficas");
                    ScaleTransition scl = new ScaleTransition(Duration.millis(500), alb);
                    scl.setToX(1f);
                    scl.setToY(1f);
                    scl.play();
                    event.consume();
                }

            };
            alb.addEventHandler(MouseEvent.MOUSE_ENTERED, entered);
            alb.addEventHandler(MouseEvent.MOUSE_EXITED, exited);
            alb.init();
        }
        
    }

    /*Basicamente este metodo creara un un panel que contendra un layaout. El panel que se a creado
     se agregara al panel principal en donde va su respectivo lugar*/
    private void anadirTitulos() {
        JPanel panel = new JPanel();//Establecemos un Jpanel donde posteriormente lo agregaremos a una respectiva layout
        panel.setLayout(new GridLayout(1, 1));//Establecemos el layout del panel
        for (Object e : titulos) {
            JButton title = (JButton) e;
            //title.addMouseListener(EscuchadorRaton);
            title.setHorizontalAlignment(JLabel.CENTER);
            title.setFont(fuente1);
            title.setBackground(Color.white);
            title.setBorderPainted(false);
            panel.add(title);
        }
        this.add(panel, BorderLayout.NORTH);//Añadimos el panel de este metodo en la parte deseada del panel
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
