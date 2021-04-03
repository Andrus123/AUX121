/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajador;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {
        //a)Instanciar a dos trabajadores
        Trabajador t1 = new Trabajador();
        Trabajador t2 = new Trabajador("Juan", "Fernández", "Castro", 3000.00, "Sistemas");
        //b)Mostrar a los dos trabajadores
        t1.mostrar();
        t2.mostrar();
        //c)Mostrar el nombre y apellidos del trabajador que gana más
        t1.sueldoMayor(t1, t2);
        //d)
        t1.cambioArea(t1, t2);
        t1.mostrar();
    }
}
