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
        p1.mostrar();
        Persona<String> p2 = new Persona("Andres Aquin", 24, "4534224");
        p2.mostrar();
        Persona<String> p3 = new Persona("Mauren Quiroga",24,"4534224");
        p3.mostrar();
        //b) Verificar que las personas no tengan el ci repetido, de ser asi
        // asignarles la terminación "CI-A" y "CI-B"
        if(p1.getCi().equals(p2.getCi())){
            p1.setCi(p1.getCi()+"CI-A");
            p2.setCi(p2.getCi()+"CI-B");
        }
        if(p2.getCi().equals(p3.getCi())){
            p2.setCi(p2.getCi()+"CI-A");
            p3.setCi(p3.getCi()+"CI-B");
        }
        if(p1.getCi().equals(p3.getCi())){
            p1.setCi(p1.getCi()+"CI-A");
            p3.setCi(p3.getCi()+"CI-B");
        }
        p2.mostrar();
        p3.mostrar();
        //mostrar a todas las personas
    }
}
