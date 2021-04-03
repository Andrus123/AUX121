/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_POO;

import clase1.Leer;

/**
 *
 * @author andru
 */
public class Serie {
    private String titulo;
    private String genero;
    private String creador;
    private int nroTemporadas;
    private String[][] Temporada = new String[3][10];
    
    public Serie(){
        this.titulo = "Dark";
        this.genero = "Suspenso";
        this.creador = "Baran bo Odar";
        this.nroTemporadas = 3;
        this.Temporada[0][0] = "1";        this.Temporada[0][1] = "2";       this.Temporada[0][2] = "3";
        this.Temporada[1][0] = "Secretos"; this.Temporada[1][1] = "Mentiras";this.Temporada[1][2] = "Pasado y Presente";
        this.Temporada[2][0] = "10";       this.Temporada[2][1] = "8";       this.Temporada[2][2] = "8";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }

    public String[][] getTemporada() {
        return Temporada;
    }

    public void setTemporada(String[][] Temporada) {
        this.Temporada = Temporada;
    }
    public void leer(){
        System.out.println("Titulo de la serie:");
        this.titulo = Leer.dato();
        System.out.println("Género de la serie:");
        this.genero = Leer.dato();
        System.out.println("Creador de la serie:");
        this.creador = Leer.dato();
        System.out.println("Numero de temporadas:");
        this.nroTemporadas = Leer.datoInt();
    }
}
