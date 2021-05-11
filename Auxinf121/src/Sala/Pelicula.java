/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

/**
 *
 * @author Andrés Aquin
 */
public class Pelicula {
    public String nombre;
    public String genero;
    
    public Pelicula(){
        this.nombre = "Matrix 4";
        this.genero = "Cyberpunk";
    }

    public Pelicula(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    public void leer(){
        System.out.println("Pelicula: ");
        setNombre(Leer.dato());
        System.out.println("Genero: ");
        setGenero(Leer.dato());
    }
    public void mostrar(){
        System.out.println("Pelicula: "+getNombre());
        System.out.println("Genero: "+getGenero());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
