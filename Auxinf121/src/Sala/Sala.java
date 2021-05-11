/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

/**
 *
 * @author Andrés Aquin
 */
public class Sala {
    public int nrosala;
    public String pelicula;
    public int precio;
    public int nropersonas;
    public Persona[] per = new Persona[50];
    
    public Sala(){
        this.nrosala = 58;
        this.pelicula = "Tenet";
        this.precio = 35;
        this.nropersonas = 3;
        for (int i = 0; i < nropersonas; i++) {
            per[i] = new Persona();
        }
    }

    public Sala(int nrosala, String pelicula, int precio, int nropersonas) {
        this.nrosala = nrosala;
        this.pelicula = pelicula;
        this.precio = precio;
        this.nropersonas = nropersonas;
        for (int i = 0; i < nropersonas; i++) {
            per[i] = new Persona();
        }
    }
    public void leer(){
        System.out.println("N° de sala: ");
        setNrosala(Leer.datoInt());
        System.out.println("Pelicula: ");
        setPelicula(Leer.dato());
        System.out.println("Precio: ");
        setPrecio(Leer.datoInt());
        System.out.println("N° de personas: ");
        setNropersonas(Leer.datoInt());
        for (int i = 0; i < getNropersonas(); i++) {
            per[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("N° de sala: "+getNrosala());
        System.out.println("Pelicula: "+getPelicula());
        System.out.println("Precio: "+getPrecio());
        System.out.println("N° de personas: "+getNropersonas());
        for (int i = 0; i < getNropersonas(); i++) {
            per[i].mostrar();
        }
    }

    public int getNrosala() {
        return nrosala;
    }

    public void setNrosala(int nrosala) {
        this.nrosala = nrosala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNropersonas() {
        return nropersonas;
    }

    public void setNropersonas(int nropersonas) {
        this.nropersonas = nropersonas;
    }

    public Persona[] getPer() {
        return per;
    }

    public void setPer(Persona[] per) {
        this.per = per;
    }
    
    
}
