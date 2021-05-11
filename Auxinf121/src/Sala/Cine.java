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
public class Cine {
    public String nombre;
    public String direccion;
    public int nrosalas;
    public Sala[] sa = new Sala[50];
    
    public Cine(){
        this.nombre = "Cine Center";
        this.direccion = "Zona Sur";
        this.nrosalas = 3;
        for (int i = 0; i < nrosalas; i++) {
            sa[i] = new Sala();
        }
    }

    public Cine(String nombre, String direccion, int nrosalas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nrosalas = nrosalas;
        for (int i = 0; i < nrosalas; i++) {
            sa[i] = new Sala();
        }
    }
    public void adiSala(Sala x){
        sa[nrosalas] = x;
        nrosalas++;
    }
    public void salaPelicula(Pelicula x){
        System.out.println("\nPelicula: "+x.nombre);
        for (int i = 0; i < nrosalas; i++) {
            if(x.nombre.equals(sa[i].pelicula)){
                System.out.println("Sala: "+sa[i].nrosala);
            }
        }
    }
    public void leer(){
        System.out.println("Nombre del Cine: ");
        setNombre(Leer.dato());
        System.out.println("Direccion: ");
        setDireccion(Leer.dato());
        System.out.println("N° de salas: ");
        setNrosalas(Leer.datoInt());
        for (int i = 0; i < getNrosalas(); i++) {
            sa[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Cine: "+getNombre());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("N° de salas: "+getNrosalas());
        for (int i = 0; i < getNrosalas(); i++) {
            sa[i].mostrar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNrosalas() {
        return nrosalas;
    }

    public void setNrosalas(int nrosalas) {
        this.nrosalas = nrosalas;
    }

    public Sala[] getSa() {
        return sa;
    }

    public void setSa(Sala[] sa) {
        this.sa = sa;
    }
    
    
}
