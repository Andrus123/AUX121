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
public class Musico {
    public String nombre;
    public int edad;
    Instrumento inst;
    
    public Musico(){
        this.nombre = "Leon Lauregui";
        this.edad = 34;
        inst = new Instrumento();
    }

    public Musico(String nombre, int edad, Instrumento in) {
        this.nombre = nombre;
        this.edad = edad;
        inst = in;
    }
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Edad: ");
        setEdad(Leer.datoInt());
        inst.leer();
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        inst.mostrar();
    }
    public void tipoInstrumento(String x){
        if(x.equals(inst.nombre)){
            System.out.println("Musico de "+x+" "+getNombre());
        }
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
}
