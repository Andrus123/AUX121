/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimento;

/**
 *
 * @author Andrés Aquin
 */
public class Alimento {
    public String nombre;
    public int precio;
    public int nrov;
    public String[] v = new String[5];
    public int nrom;
    public String[] m = new String[5];
    
    public Alimento(){
        this.nombre = "Manzana";
        this.precio = 5;
        this.nrov = 2;
        this.v[0] = "A";
        this.v[1] = "B";
        this.nrom = 2;
        this.m[0] = "Hierro";
        this.m[1] = "Calcio";
    }

    public Alimento(String nombre, int precio, int nrov, int nrom) {
        this.nombre = nombre;
        this.precio = precio;
        this.nrov = nrov;
        this.nrom = nrom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNrov() {
        return nrov;
    }

    public void setNrov(int nrov) {
        this.nrov = nrov;
    }

    public String[] getV() {
        return v;
    }

    public void setV(String[] v) {
        this.v = v;
    }

    public int getNrom() {
        return nrom;
    }

    public void setNrom(int nrom) {
        this.nrom = nrom;
    }

    public String[] getM() {
        return m;
    }

    public void setM(String[] m) {
        this.m = m;
    }
    public void leer(){
        System.out.println("Ingrese el alimento:");
        setNombre(Leer.dato());
        System.out.println("Ingrese el precio:");
        setPrecio(Leer.datoInt());
        System.out.println("N° de vitaminas:");
        setNrov(Leer.datoInt());
        System.out.println("Vitaminas:");
        for(int i=0; i<getNrov();i++){
            v[i] = Leer.dato();
        }
        System.out.println("N° de minerales:");
        setNrom(Leer.datoInt());
        for(int i=0; i<getNrom();i++){
            m[i] = Leer.dato();
        }
    }
    public void mostrar(){
        System.out.println("\nNombre: "+getNombre());
        System.out.println("Precio: "+getPrecio());
        System.out.println("N° de vitaminas: "+getNrov());
        System.out.println("Vitaminas: ");
        for(int i=0;i<getNrov();i++){
            System.out.println("Vitamina: "+v[i]);
        }
        System.out.println("N° de minerales: "+getNrom());
        for(int i=0;i<getNrom();i++){
            System.out.println("Mineral: "+m[i]);
        }
    }
}
