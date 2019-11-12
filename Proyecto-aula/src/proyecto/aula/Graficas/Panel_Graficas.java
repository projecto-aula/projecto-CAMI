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
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.animation.*;
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
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
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
        Scene scene = new Scene(root, javafx.scene.paint.Color.ALICEBLUE);
        Text text = new Text();

        for (int i = 0; i < 10; i++) {
            Arc arc = new Arc();
            arc.setFill(javafx.scene.paint.Color.AQUA);
            arc.setCenterX(100);
            arc.setCenterY(100);
            arc.setRadiusX(100);
            arc.setRadiusY(100);
            arc.setStartAngle(i * 10);
            arc.setLength(i * 10);
            arc.setType(ArcType.ROUND);
            root.getChildren().add(arc);

            FadeTransition ft = new FadeTransition(Duration.millis(4000), arc);
            ft.setFromValue(0.0f);
            ft.setToValue(1.0f);
            ft.setCycleCount(1);
            ft.setAutoReverse(false);

            TranslateTransition tt = new TranslateTransition(Duration.millis(4500), arc);
            tt.setFromX(0.0f);
            tt.setFromY(150.0f);
            tt.setToX(300);
            tt.setCycleCount(1);
            tt.setAutoReverse(false);

            ParallelTransition pt;
            pt = new ParallelTransition(arc, tt, ft);
            pt.play();
        }


        /*
         text.setX(40);
         text.setY(100);
         text.setFont(new javafx.scene.text.Font(25));
         text.setText("Welcome JavaFX!");
         */
        root.getChildren().add(text);

        return (scene);
    }

    /*Basicamente este metodo creara un un panel que contendra un layaout. El panel que se a creado
     se agregara al panel principal en donde va su respectivo lugar*/
    private void anadirTitulos() {
        JPanel panel = new JPanel();//Establecemos un Jpanel donde posteriormente lo agregaremos a una respectiva layout
        panel.setLayout(new GridLayout(2, 2));//Establecemos el layout del panel
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
