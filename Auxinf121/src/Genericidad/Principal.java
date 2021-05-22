/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        Persona <String, String> a = new Persona<String, String>("Jose","Perez", "20");
        Persona <String, Integer> b = new Persona <String, Integer>("Juan","Mendoza",31);
        a.mostrar();
        b.mostrar();
        
        System.out.println("----------");
        
        Vector <Persona> v = new Vector<Persona>();
        v.add(new Persona("Mauren","Quiroga",23));
        v.add(a);
        v.add(b);
        for (int i = 0; i < v.size(); i++) {
            v.get(i).mostrar();
        }
       
        ArrayList <String> l = new ArrayList<String>();
    }
}
