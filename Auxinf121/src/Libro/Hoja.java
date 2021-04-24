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
public class Hoja {
    private int nropagina;
    private String contenido;

    public Hoja(int nropagina, String contenido) {
        this.nropagina = nropagina;
        this.contenido = contenido;
    }
    public void mostrar(){
        System.out.println("Nro de Paginas: "+getNropagina());
        System.out.println("Contenido: "+getContenido());
        System.out.println();
    }

    public int getNropagina() {
        return nropagina;
    }

    public void setNropagina(int nropagina) {
        this.nropagina = nropagina;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}
