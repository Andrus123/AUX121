/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaSimple;

import clase1.Leer;

/**
 *
 * @author andru
 */
public class Sillon {
    private int capacidad;
    Sillon(){
        this.capacidad = 0;
    }
    
    Sillon(int capacidad){
        this.capacidad = capacidad;
    }
    
    public void leer(){
        System.out.print("Capacidad: ");
        capacidad = Leer.datoInt();
    }
    public void mostrar(){
        System.out.print("Capacidad: ");
        System.out.println(getCapacidad());
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
