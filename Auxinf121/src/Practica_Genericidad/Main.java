/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Genericidad;
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
        Strings.add("Juan Perez - 14 años");
        Strings.add("Peter Parker - 23 años");
        Strings.add("Mauren Quiroga - 24 años");
        Strings.add("Andres Aquin - 24 años");
        System.err.println(Strings);
    }
}
