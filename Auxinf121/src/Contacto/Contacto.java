/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

/**
 *
 * @author Andrés Aquin
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String etiqueta;

    public Contacto(String nombre, String apellido, String etiqueta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.etiqueta = etiqueta;
    }
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Apellido: ");
        setApellido(Leer.dato());
        System.out.println("Etiqueta: ");
        setEtiqueta(Leer.dato());
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Etiqueta: "+getEtiqueta());
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

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    
}
