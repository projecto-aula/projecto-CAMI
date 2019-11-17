/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Graficas;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

/**
 *
 * @author Equipo 4
 */
public class Pastel_Albergues extends Arc{
    private String mensaje;
    private double strangle;
    private double porcentaje;
    private final int cant;
    
    
    Pastel_Albergues(String mensaje, double strangle, double porcentaje, int cant) {
        this.mensaje = mensaje;
        this.strangle = strangle;
        this.porcentaje = porcentaje;
        this.cant = cant;
    }
    
    public void init(){
        
            this.setCenterX(0);
            this.setCenterY(140);
            this.setRadiusX(100);
            this.setRadiusY(100);
            this.setStartAngle(strangle * 3.6f);
            this.setLength((porcentaje * 360)/100);
            this.setType(ArcType.ROUND);
            
            FadeTransition ft = new FadeTransition(Duration.millis(5000), this);
            ft.setFromValue(0.0f);
            ft.setToValue(0.7f);
            ft.setCycleCount(1);
            ft.setAutoReverse(false);

            TranslateTransition tt = new TranslateTransition(Duration.millis(4500), this);
            tt.setFromX(0.0f);
            tt.setFromY(0.0f);
            tt.setToX(400);
            tt.setCycleCount(1);
            tt.setAutoReverse(false);

            ParallelTransition pt;
            pt = new ParallelTransition(this, tt, ft);
            pt.play();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getAngle() {
        return strangle;
    }

    public void setAngle(double angle) {
        this.strangle = angle;
    } 

    public int getCant() {
        return cant;
    }

    public double getStrangle() {
        return strangle;
    }

    public void setStrangle(double strangle) {
        this.strangle = strangle;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
