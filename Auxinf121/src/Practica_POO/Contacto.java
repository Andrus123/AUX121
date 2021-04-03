/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_POO;

import clase2.Leer;

/**
 *
 * @author andru
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private int telefono;
    private String etiqueta;
    private String correoElectronico;
    
    public Contacto(){
        this.nombre = "Mauren";
        this.apellidos = "Quiroga Guitiere";
        this.telefono = 7759601;
        this.etiqueta = "Disponible";
        this.correoElectronico = "Maurensiña@gmail.com";
    }

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void leer(){
        System.out.println("Nombre:" );
        this.nombre = Leer.dato();
        System.out.println("Apellidos:");
        this.apellidos = Leer.dato();
        System.out.println("Telefono:");
        this.telefono = Leer.datoInt();
        System.out.println("Etiqueta:");
        this.etiqueta = Leer.dato();
        System.out.println("Correo Electronico:");
        this.correoElectronico = Leer.dato();
    }
    
    public void mostrar(){
        System.out.println(getNombre());
        System.out.println(getApellidos());
        System.out.println(getTelefono());
        System.out.println(getEtiqueta());
        System.out.println(getCorreoElectronico());
    }
    
    public void verificar(Contacto x){
        if(this.getEtiqueta().equals(x.getEtiqueta())){
            System.out.println("Si tienen la misma etiqueta");
        }
        else{
            System.out.println("No tienen la misma etiqueta");
        }
    }
    public void cambiar(){
        System.out.println("Ingrese el nuevo numero");
        this.setTelefono(Leer.datoInt());
        this.mostrar();
    }
    
    public static void main(String[] args){
        Contacto c1 = new Contacto();
        Contacto c2 = new Contacto();
        c1.mostrar();
        c2.leer();
        c2.mostrar();
        c1.verificar(c2);
        c1.cambiar();
        c2.cambiar();
    }
}
