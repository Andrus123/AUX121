/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class Persona <A, B>{
    private A nombre, apellido;
    private B edad;
    
    public Persona(A nombre,A apellido, B edad){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrar(){
        System.out.println(getNombre()+" "+getApellido());
        System.out.println(getEdad()+"");
    }

    public A getNombre() {
        return nombre;
    }

    public void setNombre(A nombre) {
        this.nombre = nombre;
    }

    public A getApellido() {
        return apellido;
    }

    public void setApellido(A apellido) {
        this.apellido = apellido;
    }
    

    public B getEdad() {
        return edad;
    }

    public void setEdad(B edad) {
        this.edad = edad;
    }
    
}
