/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Andres Aquin
 */
public class Inmueble {
    protected double costo;
    protected double tamaño; // en m2
    
    public Inmueble(){
        this.costo = 0;
        this.tamaño = 0;
    }

    public Inmueble(double costo, double tamaño) {
        this.costo = costo;
        this.tamaño = tamaño;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    public void leer(){
        System.out.println("Costo del inmueble: ");
        setCosto(Leer.datoDouble());
        System.out.println("Tamaño del inmueble: ");
        setTamaño(Leer.datoDouble());
    }
    public void mostrar(){
        System.out.println("Costo: "+getCosto()+" $us");
        System.out.println("Tama�o: "+getTamaño());
    }
}
