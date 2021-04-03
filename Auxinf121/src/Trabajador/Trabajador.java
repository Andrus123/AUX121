/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajador;

/**
 *
 * @author andru
 */
public class Trabajador {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Double sueldo;
    private String area;
    
    public Trabajador(){
        this.nombre= "Pedro";
        this.apellidoPaterno = "Perez";
        this.apellidoMaterno = "Jimenez";
        this.sueldo = 2150.50;
        this.area = "Márketing";
    }

    public Trabajador(String nombre, String apellidoPaterno, 
            String apellidoMaterno, 
            Double sueldo, String area) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sueldo = sueldo;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public void mostrar(){
        System.out.println("TRABAJADOR 1: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido Paterno: " + this.apellidoPaterno);
        System.out.println("Apellido Materno: " + this.apellidoMaterno);
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("Area: " + this.area);
    }
    
    public void sueldoMayor(Trabajador t1, Trabajador t2){
        Double s1 = t1.sueldo;
        Double s2 = t2.sueldo;
        if(s1>s2){
            System.out.println("El trabajador con el mayor sueldo es:");
            System.out.println(t1.nombre + " "+ t1.apellidoPaterno+" "+t1.apellidoMaterno);
        }
        else{
            System.out.println("El trabajador con el mayor sueldo es:");
            System.out.println(t2.nombre + " "+ t2.apellidoPaterno+" "+t2.apellidoMaterno);
        }
    }
    
    public void cambioArea(Trabajador t1, Trabajador t2){
        t1.area = t2.area;
    }
}
