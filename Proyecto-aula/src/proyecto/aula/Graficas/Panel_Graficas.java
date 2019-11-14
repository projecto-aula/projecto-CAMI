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
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.animation.ScaleTransition;
import javafx.animation.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import javax.swing.event.HyperlinkEvent;
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
        titulos.add(volver);
        anadirTitulos();//Hacemos todas las funciones para agregar los titulos
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.white);//Añadimos color al panel como una guia
        panelPrincipal.add(fxP, BorderLayout.CENTER);
        try {
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
        Text text = new Text();
        text.setX(400);
        text.setY(300);
        text.setFont(new javafx.scene.text.Font(15));
        text.setFill(javafx.scene.paint.Color.GRAY);
        text.setText("pasa el mouse por encima de las graficas");
        root.getChildren().add(text);
        Grafica_Albergues alb1 = new Grafica_Albergues("Albergues en alvaro obregon", 0, 40);
        Grafica_Albergues alb2 = new Grafica_Albergues("Albergues en tangamandapio", 40 * (360/100) , 40);
        Grafica_Albergues alb3 = new Grafica_Albergues("Albergues en aca", 80 * (360/100), 40);
        ArrayList<Grafica_Albergues> alblist = new ArrayList();
        alblist.add(alb1);
        alblist.add(alb2);
        alblist.add(alb3);
        
        for (int i = 0; i < alblist.size(); i++) {
            Grafica_Albergues alb = alblist.get(i);
            if((i + 1) % 2 == 0){
                alb.setFill(javafx.scene.paint.Color.TOMATO);
            }else if((i + 1) % 3 == 0){
                alb.setFill(javafx.scene.paint.Color.AQUA);
            }else{
                alb.setFill(javafx.scene.paint.Color.ORANGE);
            }
            root.getChildren().add(alb);
            
            EventHandler entered = new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    text.setText(alb.getMensaje());
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
