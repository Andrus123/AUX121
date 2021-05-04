/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimento;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a) Instanciar 2 objetos verdura, 1 objeto fruta y 2 objetos carne
        Verdura v1 = new Verdura();
        Verdura v2 = new Verdura("Raices","Nabo",4,1,1);
        Fruta f1 = new Fruta();
        Carne c1 = new Carne();
        Carne c2 = new Carne("Aviar","700 gramos","Pechuga","Pollo",25,2,1);
        //b) Mostrar todos los objetos anteriores
        v1.mostrar();
        v2.mostrar();
        f1.mostrar();
        c1.mostrar();
        c2.mostrar();
        //c) Insertar otro nombre y precio a la fruta.
        f1.insertarPrecioyNombre();
        //d) Verificar si la verdura 1 tiene los mismos minerales a la 2
        v1.Verificarminerales(v2);
        //e) Comparar el precio de la verdura 1 y la carne 2 y mostrar la barata
        v1.CompararPrecios(c2);
    }
}
