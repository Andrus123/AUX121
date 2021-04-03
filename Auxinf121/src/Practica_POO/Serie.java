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
    public String getTemporada(int i, int j){
        return Temporada[i][j];
    }
    public void SetTemporada(String[][] Temporada){
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
        for (int j = 0; j<getNroTemporadas(); j++){
            for(int i = 0; i<3;i++){
                if(i == 0){
                    System.out.println("Número de temporada: ");
                }
                if(i == 1){
                    System.out.println("Titulo de la temporada: ");
                }
                if(i == 2){
                    System.out.println("Cantidad de episodios: ");
                }
                Temporada[i][j] = Leer.dato();
            }
        }
    }
    public void mostrar(){
        System.out.println("Serie : " + getTitulo());
        System.out.println("Genero : " + getGenero());
        System.out.println("Creador : " + getCreador());
        System.out.println("Temporadas : " + getNroTemporadas());
        System.out.println("Temp:Título:Nro de eps:");
        for (int j = 0; j < getNroTemporadas(); j++) {
            System.out.println(getTemporada(0,j) + " " + getTemporada(1,j) + " " + getTemporada(2,j));
        }
    }
    public void verificar(Serie x){
        if(getCreador().equals(x.getCreador())){
            System.out.println("Si son del mismo creador: "+getCreador());
        }
        else{
            System.out.println("No son del mismo creador");
        }
    }
    public void contar(){
        int x = 0;
        for(int j=0; j<getNroTemporadas(); j++){
            x = x + Integer.parseInt(Temporada[2][j]);
        }
        System.out.println("Total de episodios de la serie "+getTitulo()+" : "+x);
    }
    
    public static void main(String[] args){
        Serie s1 = new Serie();
        Serie s2 = new Serie();
        
//        s2.leer();
//        s1.mostrar();
//        s2.mostrar();
//        s1.verificar(s2);
        s1.contar();
//        s2.contar();
    }
}
