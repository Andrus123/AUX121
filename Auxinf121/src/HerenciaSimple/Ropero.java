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
public class Ropero extends Mueble{
    private int nroCajas;
    private int ancho;
    private int alto;
    
    Ropero(String m, int p, String c,int nroCajas, int ancho, int alto){
        super(m,p,c);
        this.nroCajas = nroCajas;
        this.ancho = ancho;
        this.alto = alto;
    }
    public void leer(){
        super.leer();
        System.out.println("Número de Cajas: ");
        nroCajas = Leer.datoInt();
        System.out.println("Ancho: ");
        ancho = Leer.datoInt();
        System.out.println("Alto: ");
        alto = Leer.datoInt();
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Nro de Cajas: "+ getNroCajas());
        System.out.println("Ancho: "+ getAncho());
        System.out.println("Alto: "+ getAlto());
    }
   
    public int getNroCajas() {
        return nroCajas;
    }

    public void setNroCajas(int nroCajas) {
        this.nroCajas = nroCajas;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
