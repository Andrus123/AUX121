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
public class Principal {

    public static void verepisodio(String nom, Serie x, Serie y) {
        for (int i = 0; i < x.getNrotemporadas(); i++) {
            if (x.equals(x.temporada[i].episodio[i].getTitulo())) {
                System.out.println("Episodio: "+
                        x.temporada[i].episodio[i].getTitulo()
                        + " temp: "+x.temporada[i].getNrotemporada());
            }else{
                System.out.println("Episodio no encontrado en serie: "+x.getNombre());
            }
        }
        for (int i = 0; i < y.getNrotemporadas(); i++) {
            if (x.equals(y.temporada[i].episodio[i].getTitulo())) {
                System.out.println("Episodio: "+
                        y.temporada[i].episodio[i].getTitulo()
                        + " temp: "+y.temporada[i].getNrotemporada());
            }else{
                System.out.println("Episodio no encontrado en serie: "+y.getNombre());
            }
        }
    }

    public static void main(String[] args) {
        //a) Instanciar dos Series
        Serie s1 = new Serie();
        Serie s2 = new Serie();
        s2.leer();
        s1.mostrar();
        s2.mostrar();
        //b) Contar cuantos episodios tiene una serie
        s1.contarEpisodios();
        s2.contarEpisodios();
        //c) Mostrar el titulo del episodio X de la serie Y
        s1.mostrarepisodio();
        s2.mostrarepisodio();
        //d) Mostrar la serie con más temporadas
        if (s1.getNrotemporadas() > s2.getNrotemporadas()) {
            System.out.println("Serie con más temporadas: " + s1.getNombre()
                    + " con " + s1.getNrotemporadas() + " temporadas");
        } else {
            System.out.println("Serie con más temporadas: " + s2.getNombre()
                    + " con " + s2.getNrotemporadas() + " temporadas");
        }
        //e) Verificar si existe el episodio X
        verepisodio("Ozymandias", s1, s2);
    }
}
