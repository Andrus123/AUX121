/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minibus;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        Sindicato s1 = new Sindicato("10 DE AGOSTO", 4);
        s1.mostrar();
        //Contar cuantos minibuses restringidos por 1 y 2 como ultimo digito de placa
        s1.Restriccion();
        s1.Verificar("Juan Perez");
    }
}
