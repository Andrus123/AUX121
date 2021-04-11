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
public class Mueble {
    protected String material, color;
    protected int peso;
    
    Mueble(){
        this.material = "";
        this.peso = 0;
        this.color = "";
    }
    Mueble(String m, int p, String c){
        this.material = m;
        this.peso = p;
        this.color = c;
    }
    public void leer(){
        System.out.println("Material: " );
        material = Leer.dato();
        System.out.println("Peso: " );
        peso = Leer.datoInt();
        System.out.println("Color: " );
        color = Leer.dato();
    }
    
}
