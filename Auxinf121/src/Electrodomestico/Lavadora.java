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
        this.marca = "LG";
        this.modelo = "Washtower";
        this.precio = 5800.50;
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
    public void mostrar(){
        System.out.println("\nLavadora: ");
        super.mostrar();
        System.out.println("Kilogramos: "+getKg());
    }
    public void Verificarmodelo(Lavadora x, Lavadora y){
        System.out.println("Verificando el modelo de Lavadoras:");
        super.Verificarmodelo(x, y);
    }
}
