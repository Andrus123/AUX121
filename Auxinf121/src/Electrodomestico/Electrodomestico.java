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
public class Electrodomestico {
    protected String marca;
    protected String modelo;
    protected Double precio;
    
    public Electrodomestico(){
        this.marca = "Samsung";
        this.modelo = "XTR123";
        this.precio = 1800.6;
    }

    public Electrodomestico(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Precio: "+getPrecio());
    }
    public void Verificarmodelo(Electrodomestico x, Electrodomestico y){
        System.out.println("\nVerificando similitud de modelos...");
        if(x.modelo==y.modelo){
            System.out.println("modelo igual: "+x.modelo);
        }else{
            System.out.println("Modelos distintos: "+x.modelo+" - "+y.modelo);
        }
    }
}
