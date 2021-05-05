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
public class Lavadora extends Electrodomestico{
    private Double kg;
    
    public Lavadora(){
        super();
        this.kg = 500.5;
    }

    public Lavadora(Double kg, String marca, String modelo, Double precio) {
        super(marca, modelo, precio);
        this.kg = kg;
    }

    public Double getKg() {
        return kg;
    }

    public void setKg(Double kg) {
        this.kg = kg;
    }
    
}
