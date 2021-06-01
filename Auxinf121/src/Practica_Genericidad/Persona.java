/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class Persona <T>{
    private String nombre;
    private int edad;
    private T ci;

    public Persona(String nombre, int edad, T ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }

    public Persona(){
        this.nombre = "Juan Perez";
        this.edad = 32;
        this.ci = (T)ci;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("CI: "+getCi());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public T getCi() {
        return ci;
    }

    public void setCi(T ci) {
        this.ci = ci;
    }
    
    
}
