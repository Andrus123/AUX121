/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class Libro {
    private String titulo;
    private int nropaginas;
    
    public Libro(){
        this.titulo = "Hackers and Painters";
        this.nropaginas = 245;
    }
    
    public void mostrar(){
        System.out.println("Libro: "+getTitulo());
        System.out.println("# de Paginas: "+getNropaginas());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNropaginas() {
        return nropaginas;
    }

    public void setNropaginas(int nropaginas) {
        this.nropaginas = nropaginas;
    }
    
    
}
