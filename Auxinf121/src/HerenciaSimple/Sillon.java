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
public class Sillon extends Mueble{
    private int capacidad;
    Sillon(){
        super();
        this.capacidad = 0;
    }
    
    Sillon(String m, int p, String c,int capacidad){
        super(m,p,c);
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
