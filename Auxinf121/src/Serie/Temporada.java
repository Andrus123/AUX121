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
    private int nrotemporada;
    private int nroepisodios;
    private Episodio[] episodio;
    
    public Temporada(){
        this.nrotemporada = 5;
        this.nroepisodios = 12;
        episodio= new Episodio[nroepisodios + 1]; //Creando el array
        for(int i=0; i<this.nroepisodios;i++){
            episodio[i] = new Episodio();
        }
    }

    public Temporada(int nrotemporada, int nroepisodios) {
        this.nrotemporada = nrotemporada;
        this.nroepisodios = nroepisodios;
    }

    public int getNrotemporada() {
        return nrotemporada;
    }

    public void setNrotemporada(int nrotemporada) {
        this.nrotemporada = nrotemporada;
    }

    public int getNroepisodios() {
        return nroepisodios;
    }

    public void setNroepisodios(int nroepisodios) {
        this.nroepisodios = nroepisodios;
    }

    public Episodio[] getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Episodio[] episodio) {
        this.episodio = episodio;
    }
    
    public void leer(){
        System.out.println("N° de temporada; ");
        setNrotemporada(Leer.datoInt());
        System.out.println("N° de episodios; ");
        setNroepisodios(Leer.datoInt());
        for(int i=0; i<getNroepisodios();i++){
            episodio[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("N° de temporada: "+getNrotemporada());
        System.out.println("N° de episodios: "+getNroepisodios());
        for(int i=0; i<getNroepisodios();i++){
            episodio[i].mostrar();
        }
    }
}
