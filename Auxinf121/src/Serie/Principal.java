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
    public static void main(String[] args){
        //a) Instanciar dos Series
        Serie s1 = new Serie();
        Serie s2 = new Serie("Mr Robot", "Hacking", "Sam Elis", 7);
        //2.leer();
        s1.mostrar();
        s2.mostrar();
        //b) Contar cuantos episodios tiene en total una serie
        s1.cantidadEpSerie();
        //c) Mostrar el titulo del episodio X de la serie Y
        s2.buscarEp(3);
        //d) Mostrar la serie con más temporadas
        s1.Mastemporadas(s2);
        //e) Verificar si existe el episodio X
        s1.Verificar("Ozymandias");
    }
}
