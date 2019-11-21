package modulosofia;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Toni
 */
public class Ventana1 extends JFrame {
    
    public Ventana1(){
        //establecemos su tamaño
        setSize(800,600);
        //establecemos su titulo
        setTitle("Sofia");
        //establecemos la ventana en el centro
        setLocationRelativeTo(null);
        //establecemos que no se puede cambiar su tamaño
        setResizable(false);
        //al cerrar la ventana se termina el proggrama
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //cambiamos el color de fondo del frame
        this.getContentPane().setBackground(Color.white);
        
        //Panel1 obj = new Panel1();
        //add(obj);
        Panel2 pa = new Panel2();
        this.add(pa);
        /*
        PanelA2 obj2 = new PanelA2();
        this.add(obj2);
        */
        //PanelA3 obj3 = new PanelA3();
        //add(obj3);
        //PanelA4 obj4 = new PanelA4();
        //add(obj4);
        this.setLayout(null);
    }
    /**
     * Bien esto es lo que hace el metodo.
     * panelr es el antiguo panel que quieres remover
     * paneln es el uevo panel que quieres poner
     * 
     * remueve panelr y pondra el panel nuevo
     * @param panelr es el antiguo panel que quieres remover
     * @param paneln es el uevo panel que quieres poner
     */
    public void cambiarPanel(JPanel panelr, JPanel paneln){
        this.remove(panelr);
        this.add(paneln);
        this.repaint();
        this.revalidate();
    }
    
    
    
    
}