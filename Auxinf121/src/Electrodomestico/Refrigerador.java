/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico;

/**
 *
 * @author Andrés Aquin
 */
public class Refrigerador extends Electrodomestico {
    private int nroCuerpos;
    
    public Refrigerador(){
        super();
        this.marca = "Samsung";
        this.modelo = "French Door";
        this.precio = 7800.60;
        this.nroCuerpos = 4;
    }

    public Refrigerador(int nroCuerpos, String marca, String modelo, Double precio) {
        super(marca, modelo, precio);
        this.nroCuerpos = nroCuerpos;
    }

    public int getNroCuerpos() {
        return nroCuerpos;
    }

    public void setNroCuerpos(int nroCuerpos) {
        this.nroCuerpos = nroCuerpos;
    }
    public void mostrar(){
        System.out.println("\nRefrigerador: ");
        super.mostrar();
        System.out.println("N° de cuerpos: "+getNroCuerpos());
    }
}
