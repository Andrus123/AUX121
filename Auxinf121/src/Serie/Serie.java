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
    private int nroTemporadas;
    private Temporada[] temp;
    
    public Serie(){
        this.nombre = "Breaking Bad";
        this.genero = "Drama";
        this.creador = "Vince Gilligan";
        this.nroTemporadas = 2;
        temp = new Temporada[nroTemporadas + 1];
        for (int i = 1; i <= nroTemporadas; i++) {
            temp[i] = new Temporada();
        }
    }
    
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Género: ");
        setGenero(Leer.dato());
        System.out.println("Creador: ");
        setCreador(Leer.dato());
        System.out.println("N° de temporadas");
        setNroTemporadas(Leer.datoInt());
        for (int i = 1; i <= getNroTemporadas(); i++) {
            temp[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Género: "+getGenero());
        System.out.println("Creador: "+getCreador());
        System.out.println("N° de temporadas: "+getNroTemporadas());
        for (int i = 1; i <= getNroTemporadas(); i++) {
            temp[i].mostrar();
        }
    }
    public void cantidadEpSerie(){
        System.out.println("Serie: "+getNombre()+" - "+getNroTemporadas()+" Temporadas");
        System.out.println("Total de episodios: ");
        int total = 0;
        for (int i = 1; i <= getNroTemporadas(); i++) {
            total = total+temp[i].getNroEpisodios();
        }
        System.out.println(total+" episodios");
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

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }
}
