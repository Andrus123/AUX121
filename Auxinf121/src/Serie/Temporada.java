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
public class Temporada {
    public int nroTemporada;
    public int nroEpisodios;
    Episodio[] ep;
    
    public Temporada(){
        this.nroTemporada = 5;
        this.nroEpisodios = 12;
        for (int i = 0; i < this.nroEpisodios; i++) {
            ep[i] = new Episodio();
        }
    }

    public Temporada(int nroTemporada, int nroEpisodios, Episodio[] ep) {
        this.nroTemporada = nroTemporada;
        this.nroEpisodios = nroEpisodios;
        this.ep = ep;
    }

    public int getNroTemporada() {
        return nroTemporada;
    }

    public void setNroTemporada(int nroTemporada) {
        this.nroTemporada = nroTemporada;
    }

    public int getNroEpisodios() {
        return nroEpisodios;
    }

    public void setNroEpisodios(int nroEpisodios) {
        this.nroEpisodios = nroEpisodios;
    }

    public Episodio[] getEp() {
        return ep;
    }

    public void setEp(Episodio[] ep) {
        this.ep = ep;
    }
    
    public void leer(){
        System.out.println("N° de temporada: ");
        setNroTemporada(Leer.datoInt());
        System.out.println("N° de episodios: ");
        setNroEpisodios(Leer.datoInt());
        for (int i = 0; i < getNroEpisodios(); i++) {
            this.ep[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("N° de temporada: "+getNroTemporada());
        System.out.println("Cantidad de episodios: "+getNroEpisodios());
        for (int i = 0; i < getNroEpisodios(); i++) {
            this.ep[i].mostrar();
        }
    }
}