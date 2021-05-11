/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evento;

/**
 *
 * @author Andrés Aquin
 */
public class Instrumento {
    public String tipo;
    public String nombre;
    
    public Instrumento(){
        this.tipo = "Cuerdas";
        this.nombre = "Guitarra";
    }
    public void leer(){
        System.out.println("tipo de instrumento: ");
        setTipo(Leer.dato());
        System.out.println("nombre de instrumento:");
        setNombre(Leer.dato());
    }
    public void mostrar(){
        System.out.println("Tipo: "+getTipo());
        System.out.println("Nombre: "+getNombre());
    }

    public Instrumento(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
