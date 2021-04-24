/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author Andrés Aquin
 */
public class Libro {
    private String nombre;
    private int nh;
    private Hoja[]h = new Hoja[50];
    
    

    Libro(String n, int nro){
        nombre= n;
        nh = nro;
        for(int i=0;i<nh;i++){
            h[i] = new Hoja(i+1,"aaaaaaaaa");
        }
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Nro hojas: "+getNh());
        for(int i=0;i<nh;i++){
            h[i] = new Hoja(i+1,"aaaaaaaaa");
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNh() {
        return nh;
    }

    public void setNh(int nh) {
        this.nh = nh;
    }

    public Hoja[] getH() {
        return h;
    }

    public void setH(Hoja[] h) {
        this.h = h;
    }
    public Hoja getHi(int i){
        return h[i];
    }
    
}
