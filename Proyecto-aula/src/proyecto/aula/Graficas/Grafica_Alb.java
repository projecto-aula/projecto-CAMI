/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula.Graficas;

import java.util.*;

/**
 *
 * @author Equipo
 */
public class Grafica_Alb {
    private int cantTotal;
    private final double degress = 3.6;
    private ArrayList<Pastel_Albergues> alblist = new ArrayList();
    
    public Grafica_Alb(Pastel_Albergues alb[]){
        for (int i = 0; i < alb.length; i++) {
            alblist.add(alb[i]);
        }
    }
    
    private void recorredor(){
        for (int i = 0; i < alblist.size(); i++) {
            cantTotal += alblist.get(i).getCant();
        }
    }
    
    private void poscionPastel(){
        recorredor();
        
    }
    
    public void DibujarGrafica(){
        
    }

    public int getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(int cantTotal) {
        this.cantTotal = cantTotal;
    }
}
