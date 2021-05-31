/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Genericidad;
import java.util.Iterator;
import java.util.Vector;
/**
 *
 * @author Andrés Aquin
 */
public class Main {
    public static void main(String[] args) {
        //a) Implementar un Vector de Enteros
        Vector<Integer> Enteros = new Vector<>();
        Enteros.add(13);
        Enteros.add(24);
        Enteros.add(1657);
        Enteros.add(575);
        Enteros.add(785);
        System.out.println(Enteros);
        //b) Implemenetar un Vector de String
        Vector<String> Strings = new Vector<>();
        Strings.add("\nJuan Perez - 14 anios");
        Strings.add("Peter Parker - 23 anios");
        Strings.add("Mauren Quiroga - 24 anios");
        Strings.add("Andres Aquin - 24 anios");
        for (Iterator<String> iterator = Strings.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
        //c) Implementar un Vector de Libro
        Libro l1 = new Libro("Zero to One",250);
        Libro l2 = new Libro("Principles",250);
        Libro l3 = new Libro();
        Vector<Libro> Libros = new Vector<>();
        Libros.add(l1);
        Libros.add(l2);
        Libros.add(l3);
        for (Iterator<Libro> iterator = Libros.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            next.mostrar();
        }
    }
}
