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
public class Pelicula {
    private String titulo;
    private String director;
    private int año;
    
    public Pelicula(){
        this.titulo = "GoodFellas";
        this.director = "Martin Scorscese";
        this.año = 1975;
    }

    public Pelicula(String titulo, String director, int año) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void mostrar(){
        System.out.println("Pelicula:" + getTitulo()+" Dirigida por: "+getDirector()+"  Año: "+getAño());
    }
    public void verificar(Pelicula x){
        if(this.director.equals(x.getDirector())){
            System.out.println("Ambas peliculas dirigidas por: "+getDirector());
        }
        else{
            System.out.println("Son de directores diferentes");
        }
    }
    public void comparar(Pelicula x){
        if(this.año==x.año){
            System.out.println("Ambas peliculas fueron estrenadas en: "+getAño());
        }
        else{
            System.out.println("Fueron estrenadas en diferentes años");
        }
    }
    
    
    public static void main(String[] args){
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula("Fight Club","Martin Scorscese",1975);
        
        p1.mostrar();
        p2.mostrar();
        p1.verificar(p2);
        p1.comparar(p2);
    }
    
}
