/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a) Instanciar dos cuentas
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c2.leer();
        c1.mostrar();
        c2.mostrar();
        //b) Crear una funcion para obtener el correo de la cuenta
    }
}
