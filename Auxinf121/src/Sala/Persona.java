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
public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    
    public Persona(){
        this.nombre = "Peter Parker";
        this.edad = 25;
        this.sexo = "Masculino";
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Edad: ");
        setEdad(Leer.datoInt());
        System.out.println("Sexo: ");
        setSexo(Leer.dato());
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sexo: "+getSexo());
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
