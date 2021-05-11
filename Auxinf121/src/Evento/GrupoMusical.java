/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evento;

/**
 *
 * @author Andrés Aquin
 */
public class GrupoMusical {
    public String nombre;
    public String genero;
    public int nroMusicos;
    public Musico[] m = new Musico[50];
    
    public GrupoMusical(){
        this.nombre = "ZOE";
        this.genero = "Indie Rock";
        this.nroMusicos = 5;
        for(int i=0; i<nroMusicos;i++){
            m[i] = new Musico();
        }
    }

    public GrupoMusical(String nombre, String genero, int nroMusicos) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroMusicos = nroMusicos;
        for(int i=0; i<nroMusicos;i++){
            m[i] = new Musico();
        }
    }
    public void leer(){
        System.out.println("Nombre del grupo: ");
        setNombre(Leer.dato());
        System.out.println("Genero: ");
        setGenero(Leer.dato());
        System.out.println("Numero de musicos: ");
        setNroMusicos(Leer.datoInt());
        for (int i = 0; i < getNroMusicos(); i++) {
            m[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Grupo: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("N° de musicos: "+getNroMusicos());
        for (int i = 0; i < getNroMusicos(); i++) {
            m[i].mostrar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNroMusicos() {
        return nroMusicos;
    }

    public void setNroMusicos(int nroMusicos) {
        this.nroMusicos = nroMusicos;
    }

    public Musico[] getM() {
        return m;
    }

    public void setM(Musico[] m) {
        this.m = m;
    }
    
}
