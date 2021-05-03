/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        Cuadrado cd1 = new Cuadrado();
        cd1.mostrar();
        cd1.CalcularArea();
        cd1.CalcularPerimetro();
        
        Circulo c1 = new Circulo();
        c1.mostrar();
        c1.CalcularArea();
        c1.CalcularPerimetro();
        
        Triangulo t1 = new Triangulo();
        t1.mostrar();
        t1.CalcularArea();
        t1.CalcularPerimetro();
    }
}
