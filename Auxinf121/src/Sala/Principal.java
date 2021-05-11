/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Justice League", "Accion");
        Pelicula p2 = new Pelicula();
        Sala s2 = new Sala(12, "", 35, 3);
        Sala s3 = new Sala(14, "", 25, 2);
        s2.adiPelicula(p1);
        s3.adiPelicula(p2);
        Cine c1 = new Cine();
        c1.adiSala(s2);
        c1.adiSala(s3);
        c1.mostrar();
        //a) mostrar en qué número de la sala se exhibe la pelicula X
        c1.salaPelicula(p1);
        //b) Cual fue el ingreso total del cine
        
    }
}
