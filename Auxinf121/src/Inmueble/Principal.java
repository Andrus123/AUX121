/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a) Instanciar los Objetos: 2 Casas, 3 Edificios y un Condominio
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();
        Edificio edf1 = new Edificio();
        Edificio edf2 = new Edificio();
        Edificio edf3 = new Edificio();
        Condominio condo1 = new Condominio();
        
        casa1.mostrar();
        casa2.mostrar();
        edf1.mostrar();
        edf2.mostrar();
        edf3.mostrar();
        condo1.mostrar();
        //b) Mostrar todos los Edificios del condominio que al menos tenga 5 dep
        condo1.cuentadep();
    }
}
