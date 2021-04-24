/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo;

/**
 *
 * @author Andrés Aquin
 */
public class Persona {
    private String nombre;
    private int edad;
    private double estatura;

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public void mostrar(){
     System.out.println("Nombre: "+ getNombre());
     System.out.println("Edad: "+ getEdad());
     System.out.println("Estatura: "+ getEstatura());
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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
}
