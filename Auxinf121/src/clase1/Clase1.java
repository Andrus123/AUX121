/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author andru
 */
public class Clase1 {

    public static void mismoAtributo(Juego j1, Juego j2) {
        int c = 0;
        if (j1.getNombre().equals(j2.getNombre())) {
            System.out.println("tienen el mismo nombre");
            c++;
        }
         if (j1.getCategoria().equals(j2.getCategoria())) {
            System.out.println("tienen la misma categoria");
            c++;
        } 
          if (j1.getVersion().equals(j2.getVersion())) {
            System.out.println("Son de la misma version");
            c++;
        }
          if (j1.getAñoCreacion() == j2.getAñoCreacion()) {
            System.out.println("Se crearon el mismo año");
            c++;
        }
        if(c == 0){
            System.out.println("No comparten Atributos iguales");
        }
    }

    public static void main(String[] args) {
        Juego j1 = new Juego();
        j1.leer();
        j1.mostrar();
        Juego j2 = new Juego();
        j2.leer();
        j2.mostrar();
        mismoAtributo(j1,j2);
    }
}
