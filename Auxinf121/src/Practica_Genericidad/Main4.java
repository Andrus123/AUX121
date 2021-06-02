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
public class Main4 {
    public static void main(String[] args) {
        Usuario<String> u1 = new Usuario("ADC123", "Andres Aquin", "10013sdf");
        Usuario<Integer> u2 = new Usuario("KLV123", "Kelly Valdivia", 342342);
        Usuario<String> u3 = new Usuario("MQT213", "Mauren Quiroga", "Mauren Quiroga");
        Usuario<String> u4 = new Usuario("CRF123", "Carlo Flores", "123135322flocho1");
        u1.mostrar();
        u2.mostrar();
        u3.mostrar();
        u4.mostrar();
        //b)Verificar cual usuario tiene la contraseña más larga
        Vector<Usuario> vu = new Vector<>();
        Iterator itusuarios = vu.iterator();
        while(itusuarios.hasNext()){
            Usuario usuarioslista = (Usuario)itusuarios.next();
            
        }
    }
}
