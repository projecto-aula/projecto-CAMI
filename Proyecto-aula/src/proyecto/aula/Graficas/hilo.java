/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Graficas;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.*;
import javafx.util.Duration;


/**
 *
 * @author familia
 */
public class hilo extends Thread {

    JFXPanel panel;

    public hilo(JFXPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        Scene scene = createScene();
        panel.setScene(scene);
    }
    
    public void initComp(){
        Scene scene = createScene();
        panel.setScene(scene);
    }

    private Scene createScene() {
        Group root = new Group();
        Scene s = new Scene(root);
        //s.setFill(Color.RED);
        
        Arc al = new Arc();
        al.setFill(Color.BLUE);
        al.setCenterX(0);
        al.setCenterY(0);
        al.setRadiusX(50.0f);
        al.setRadiusY(50.f);
        al.setStartAngle(0.0f);
        al.setLength(90.0f);
        al.setType(ArcType.ROUND);
        
        root.getChildren().add(al);
        
        /*
        FadeTransition ft = new FadeTransition(Duration.millis(4000), al);
        ft.setFromValue(0.0f);
        ft.setToValue(1.0f);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        
        TranslateTransition tt = new TranslateTransition(Duration.millis(4500), al);
        tt.setFromX(0.0f);
        tt.setFromY(panel.getHeight()/4);
        tt.setToX(panel.getWidth()/4);
        tt.setCycleCount(1);
        tt.setAutoReverse(false);
        
        ParallelTransition pt;
        pt = new ParallelTransition(al, tt, ft);
        pt.play();
        */
        return s;
    }
}
