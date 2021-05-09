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
public class Serie {
    private String nombre;
    private String genero;
    private String creador;
    private int nrotemporadas;
    Temporada[] temporada = new Temporada[50];
    
    public Serie(){
        this.nombre = "Breaking Bad";
        this.genero = "Drama";
        this.creador = "Vince Gilligan";
        this.nrotemporadas = 1;
        for(int i=0; i<this.nrotemporadas;i++){
            temporada[i] = new Temporada();
        }
    }

    public Serie(String nombre, String genero, String creador, int nrotemporadas) {
        this.nombre = nombre;
        this.genero = genero;
        this.creador = creador;
        this.nrotemporadas = nrotemporadas;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNrotemporadas() {
        return nrotemporadas;
    }

    public void setNrotemporadas(int nrotemporadas) {
        this.nrotemporadas = nrotemporadas;
    }

    public Temporada[] getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada[] temporada) {
        this.temporada = temporada;
    }
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Genero: ");
        setGenero(Leer.dato());
        System.out.println("Creador: ");
        setCreador(Leer.dato());
        System.out.println("N° de temporadas: ");
        setNrotemporadas(Leer.datoInt());
        for(int i=0; i<getNrotemporadas();i++){
            temporada[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("Creador: "+getCreador());
        for(int i=0; i<getNrotemporadas();i++){
            temporada[i].mostrar();
        }
    }
    public void contarEpisodios(){
        int contador =0;
        for (int i = 0; i < this.getNrotemporadas(); i++) {
            contador = contador + temporada[i].getNroepisodios();
        }
        System.out.println("Total de episodios: "+ contador);
    }
}
