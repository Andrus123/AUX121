/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void MaxHojas(Libro x, Libro y) {
        boolean a = false;
        if (x.getNh() > y.getNh()) {
            a = true;
            System.out.println("El libro " + x.getNombre() + " tiene " + x.getNh() + " hojas");
        } else {
            a = true;
            System.out.println("El libro " + y.getNombre() + " tiene " + y.getNh() + " hojas");
        }
        if(!a){
            System.out.println("Tienen la misma cantidad de hojas");
        }
    }

    public static void mostrarHojaX(Libro a, int x) {
        for (int i = 0; i < a.getNh(); i++) {
            if(i+1 == x){
                a.getHi(i).mostrar();
            }
        }
    }

    public static void main(String[] args) {
        Libro a = new Libro("la A", 3);
        Libro b = new Libro("La B", 5);
        a.mostrar();
        b.mostrar();
        MaxHojas(a,b);
        mostrarHojaX(b,3);
    }

}
