/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author Andrés Aquin
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public int edad;
    public int nrodecelular;
    
    public Usuario(){
        this.nombre = "Andrés";
        this.apellido = "Aquin";
        this.edad = 24;
        this.nrodecelular = 77442221;
    }

    public Usuario(String nombre, String apellido, int edad, int nrodecelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nrodecelular = nrodecelular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNrodecelular() {
        return nrodecelular;
    }

    public void setNrodecelular(int nrodecelular) {
        this.nrodecelular = nrodecelular;
    }
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Apellido: ");
        setApellido(Leer.dato());
        System.out.println("Edad: ");
        setEdad(Leer.datoInt());
        System.out.println("N° de celular: ");
        setNrodecelular(Leer.datoInt());
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Celular: "+getNrodecelular());
    }
}
