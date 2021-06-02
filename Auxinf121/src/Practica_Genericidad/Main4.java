/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Genericidad;

import java.util.Collections;
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
        Vector<Usuario> usuarios = new Vector<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        for (Usuario usuario : usuarios) {
            usuario.mostrar();
        }
        //b)Verificar cual usuario tiene la contraseña más larga
        int maxancho = 0;
        String maxcontraseña = "";
        String maxuser = "";
        for (Iterator<Usuario> iterator = usuarios.iterator(); iterator.hasNext();) {
            Usuario next = iterator.next();
            if(next.getContrasena().toString().length()>maxancho){
                maxancho = next.getContrasena().toString().length();
                maxcontraseña = next.getContrasena().toString();
                maxuser = next.getNom();
            }
        }
        System.out.println("\nContraseña más ancha: "+maxcontraseña+" de usuario: "+maxuser);
    }
}
