/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void promedios(Grupo a) {
        int ed = 0;
        double es = 0;
        for (int i = 0; i < a.getNp(); i++) {
            ed += a.getPi(i).getEdad();
            es += a.getPi(i).getEstatura();
        }
        ed = ed / a.getNp();
        es = es / a.getNp();
        System.out.println("Promedio de edades: " + ed);
        System.out.println("Promedio de estatura: " + es);
    }

    public static void sobrePromedio(Grupo x) {
        System.out.println("Personas sobre el promedio de estatura: ");
        double es = 0;
        for (int i = 0; i < x.getNp(); i++) {
            es += x.getPi(i).getEstatura();
        }
        es = es / x.getNp();
        for (int i = 0; i < x.getNp(); i++) {
            if(x.getPi(i).getEstatura()>= es){
                x.getPi(i).mostrar();
            }
        }
    }

    public static void main(String[] args) {
        Grupo a = new Grupo("GRUPO 1", 4);
        a.mostrar();
        promedios(a);
        sobrePromedio(a);
    }
}
