/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Andrés Aquin
 */
public class Inmueble {
    private Double costo;
    private Double tamaño;
    
    public Inmueble(){
        this.costo = 750000.5;
        this.tamaño = 500.8;
    }

    public Inmueble(Double costo, Double tamaño) {
        this.costo = costo;
        this.tamaño = tamaño;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }
    public void mostrar(){
        System.out.println("Costo: "+getCosto());
        System.out.println("Tamaño en m2: "+getTamaño());
    }
}
