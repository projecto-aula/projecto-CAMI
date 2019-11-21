/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Graficas;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author familia
 */
public class Migrantes extends Rectangle{
    private String mensaje;
    private float lenght, posx, alfinal;
    
    Migrantes(String mensaje, float lenght, float posx, float alfinal){
        this.mensaje = mensaje;
        this.lenght = lenght;
        this.posx = posx;
        this.alfinal = alfinal;
    }
    
    public void init(){
        this.setFill(Color.BLUE);
        this.setY(500 - (lenght * 3f));
        this.setX(this.posx);
        this.setWidth(20);
        this.setHeight(lenght * 3f);
        this.setArcWidth(20);
        this.setArcHeight(20);
        
        FadeTransition ft = new FadeTransition(Duration.millis(5000), this);
            ft.setFromValue(0.0f);
            ft.setToValue(0.7f);
            ft.setCycleCount(1);
            ft.setAutoReverse(false);

            TranslateTransition tt = new TranslateTransition(Duration.millis(4500), this);
            tt.setFromX(0.0f);
            tt.setFromY(0.0f);
            tt.setToX(100);
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

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getPosx() {
        return posx;
    }

    public void setPosx(float posx) {
        this.posx = posx;
    }
    
    
}
