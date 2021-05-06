/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a) Instanciar dos lavadoras y dos refrigeradoras
        Electrodomestico e = new Electrodomestico();
        Lavadora l1 = new Lavadora();
        Lavadora l2 = new Lavadora(700.50,"Electroluz","EFLS527UIW",6800.6);
        Refrigerador r1 = new Refrigerador();
        Refrigerador r2 = new Refrigerador(4,"LG","#LFXS26973S",7000.5);
        l1.mostrar();
        l2.mostrar();
        r1.mostrar();
        r2.mostrar();
        //b) verificar si los refrigeradors son del mismo modelo
        e.Verificarmodelo(l1, l2);
        //c) verificar lavadora y refrigerador si tienen la misma marca
        e.Verificandomarca(l1, r1);
        //d) mostrar la lavadora con mayor capacidad
        l1.maxcapacidad(l1, l2);
    }
}
