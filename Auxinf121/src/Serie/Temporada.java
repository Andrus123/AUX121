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
    private int nroTemporada;
    private int nroEpisodios;
    private Episodio[] eps;
    
    public Temporada(){
        this.nroTemporada = 1;
        this.nroEpisodios = 5;
        eps = new Episodio[nroEpisodios+1];
        for (int i = 1; i <= nroEpisodios; i++) {
            eps[i] = new Episodio();
        }
    }
    
    public void leer(){
        System.out.println("N° de temporada: ");
        setNroTemporada(Leer.datoInt());
        System.out.println("N° de episodios: ");
        setNroEpisodios(Leer.datoInt());
        for (int i = 1; i <= getNroEpisodios(); i++) {
            eps[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("N° de temporada: "+getNroTemporada());
        System.out.println("Cantidad de episodios: "+getNroEpisodios());
        for (int i = 1; i <= getNroEpisodios(); i++) {
            eps[i].mostrar();
        }
    }
    public void buscarEp(int x){
        for (int i = 1; i <= getNroEpisodios(); i++) {
            if(x==eps[i].getNroEpisodio()){
                System.out.println("\nEpisodio #"+
                        eps[i].getNroEpisodio()+" - '"+eps[i].getTitulo()+"'");
                break;
            }
        }
    }
    public void Verificar(String x){
        for (int i = 1; i <= getNroEpisodios(); i++) {
            if(x==(eps[i].getTitulo())){
                System.out.println("\nEpisodio encontrado: "+eps[i].getTitulo()
                        +" duración: "+eps[i].getDuracion());
                break;
            }
        }
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
    public int getNroep(int a){
        return eps[a].getNroEpisodio();
    }
    public String getTituloep(int a){
        return eps[a].getTitulo();
    }
    public double getDurep(int a){
        return eps[a].getDuracion();
    }
}