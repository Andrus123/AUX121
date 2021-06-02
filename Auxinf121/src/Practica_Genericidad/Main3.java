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
public class Main3 {
    public static void main(String[] args) {
        //a) Instanciar 3 personas
        Persona<String> p1 = new Persona("Juan Perez", 45, "5724123");
        Persona<String> p2 = new Persona("Andres Aquin", 24, "4534224");
        Persona<String> p3 = new Persona("Mauren Quiroga",24,"4534224");
        //b) Verificar que las personas no tengan el ci repetido, de ser asi
        // asignarles la terminación "CI-A" y "CI-B"
        Vector<Persona> personas = new Vector<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        for (int i = 0; i < personas.size()-1; i++) {
            if(personas.get(i).getCi().equals(personas.get(i+1).getCi())){
                personas.get(i).setCi(personas.get(i).getCi()+"CI-A");
                personas.get(i+1).setCi(personas.get(i+1).getCi()+"CI-B");
            }
        }
        //c)mostrar a todas las personas
        System.out.println("Verificando CI Similares...");
        for (Persona persona : personas) {
            persona.mostrar();
        }
        
    }
}
