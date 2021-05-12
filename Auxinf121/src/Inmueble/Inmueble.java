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
    protected double tamanio; // en m2
    
    public Inmueble(){
        this.costo = 0;
        this.tamanio = 0;
    }

    public Inmueble(double costo, double tamanio) {
        this.costo = costo;
        this.tamanio = tamanio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public void leer(){
        System.out.println("Costo del inmueble: ");
        setCosto(Leer.datoDouble());
        System.out.println("Tamaño del inmueble: ");
        setTamanio(Leer.datoDouble());
    }
    public void mostrar(){
        System.out.println("Costo: "+getCosto()+" $us");
        System.out.println("Tama�o: "+getTamanio());
    }
}
