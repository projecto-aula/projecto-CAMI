package proyecto.aula;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Funciones extends Registrar_Usuario{
ArrayList<Persona> arreglo = new ArrayList();
    String rep = "si";
    String nombre, contraseña;
    int edad,id;
    //polimorfismo
    Persona usuario = new Usuario();
    
    void menu(){
        
                try{
                    
                    
                    
                        
                            
                            usuario = new Usuario(nombre, contraseña, edad, id);
                            guardarUsuario();
                            
                        
                        
                            leerUsuario();
                            
                        
                            
                            
                    
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error");
                    
                }
            }
        
    

    

    void guardarUsuario() throws FileNotFoundException, IOException {
        arreglo.add(usuario);
        guardar();
    }

    

    void leerUsuario() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archi = new FileInputStream("archivo.txt");
        ObjectInputStream entrada = new ObjectInputStream(archi);
        //nombre, contraseña, edad, id
        arreglo = (ArrayList)entrada.readObject();
        for (int i = 0; i < arreglo.size(); i++) {
            Usuario objusuario = (Usuario)arreglo.get(i);
            JOptionPane.showMessageDialog(null, "lo que puso Jimy de nuevo♣☻♥○\n"
                    + "Usuario: "+ (i+1)+ "\n"
                    + "Nombre: "+ objusuario.getNombre()+"\n"
                    + "Contraseña: "+ objusuario.getContraseña()+"\n"
                    + "Edad: "+objusuario.getEdad()+"\n"
                    + "Id: " + (i+1)+"\n");
        }
    }

    //es nuesto archivo de salida
    void guardar() throws FileNotFoundException, IOException {
        FileOutputStream archivo = new FileOutputStream("archivo.txt");
        //generare un flujo de objetos para poder guardar en el archivo
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        //escribir el archivo
        salida.writeObject(arreglo);
        salida.close();
    }    
}
