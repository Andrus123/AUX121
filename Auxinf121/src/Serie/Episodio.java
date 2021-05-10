/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie;

/**
 *
 * @author Andrés Aquin
 */
public class Episodio {
    public int nroEpisodio;
    public String titulo;
    public double duracion;
    
    public Episodio(){
        this.nroEpisodio = 3;
        this.titulo = "Ozymandias";
        this.duracion = 1.2;
    }
    
    public Episodio(int nroEpisodio, String titulo, double duracion) {
        this.nroEpisodio = nroEpisodio;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getNroEpisodio() {
        return nroEpisodio;
    }

    public void setNroEpisodio(int nroEpisodio) {
        this.nroEpisodio = nroEpisodio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void leer(){
        System.out.println("N° de episodio: ");
        setNroEpisodio(Leer.datoInt());
        System.out.println("Titulo: ");
        setTitulo(Leer.dato());
        System.out.println("Duracion: ");
        setDuracion(Leer.datoDouble());
    }
    public void mostrar(){
        System.out.println("N° de episodio: "+getNroEpisodio());
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Duracion: "+getDuracion());
    }
}
