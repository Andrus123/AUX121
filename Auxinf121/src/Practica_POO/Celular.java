/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_POO;

/**
 *
 * @author andru
 */
public class Celular {
    private String marca;
    private String modelo;
    private String gama;
    private int precio;
    
    public Celular(){
        this.marca = "Apple";
        this.modelo = "X";
        this.gama = "Alta";
        this.precio = 1000;
    }

    public Celular(String marca, String modelo, String gama, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.gama = gama;
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

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println(getMarca()+" "+getModelo()+" "+getGama()+" "+getPrecio());
    }
    public void mostrar(String x){
        if(x == this.gama){
          System.out.println(getMarca()+" "+getModelo()+" "+getGama()+" "+getPrecio()); 
        }
    }
    public static void cambio(Celular c1, Celular c3){
        c1.setPrecio(c3.precio);
        c1.mostrar();
    }
    
    public static void main(String[] args){
        Celular c1 = new Celular();
        Celular c2 = new Celular("Samsung","Galaxy","Alta",3800);
        Celular c3 = new Celular("Huawei","P10","Media",2400);
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
        System.out.println("Celulares de gama alta");
        c1.mostrar("Alta");
        c2.mostrar("Alta");
        c3.mostrar("Alta");
        System.out.println("Cambio de precios: ");
        cambio(c1,c3);
    }
}
