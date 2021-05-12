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
    private int anio;
    
    public Pelicula(){
        this.titulo = "GoodFellas";
        this.director = "Martin Scorscese";
        this.anio = 1975;
    }

    public Pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void mostrar(){
        System.out.println("Pelicula:" + getTitulo()+" Dirigida por: "+getDirector()+"  Año: "+getAnio());
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
        if(this.anio==x.anio){
            System.out.println("Ambas peliculas fueron estrenadas en: "+getAnio());
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
