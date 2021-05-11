/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evento;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        //a) determinar el nombre de los musicos que tocan los instrumentos de tipo viento
        GrupoMusical g1 = new GrupoMusical();
        //g1.leer();
        g1.mostrar();
        EventoMusical e1 = new EventoMusical();
        e1.mostrar();
        g1.tipoInstrumento("Cuerdas");
        //b) determinar si en el evento existe un grupo de genero cumbia
        
    }
}
