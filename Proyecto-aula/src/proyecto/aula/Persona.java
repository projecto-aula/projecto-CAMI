package proyecto.aula;

import java.io.*;
import java.util.*;

public abstract class Persona implements Serializable{
    private String nombre, contraseña;
    private int edad, id;
    
    public Persona(){
        
    }
    public Persona(String nombre, String contraseña, int edad, int id){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
