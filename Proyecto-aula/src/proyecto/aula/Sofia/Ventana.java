package proyecto.aula.sofia;;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Toni
 */
public class Ventana extends JFrame {
    
    public Ventana(){
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
        this.getContentPane().setBackground(Color.BLACK);
        
        Panel1 obj = new Panel1();
        add(obj);
        Panel2 obj2 = new Panel2();
        add(obj2);
        this.setLayout(null);
    }
    
    
    
    
}