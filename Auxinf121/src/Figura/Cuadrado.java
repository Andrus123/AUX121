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
public class Cuadrado extends Figura {
    private Double lado;
    
    public Cuadrado(){
        super();
        this.lado = 4.5;
    }

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    public void mostrar(){
        System.out.println("\nCuadrado: ");
        System.out.println("cada lado de: "+getLado());
    }
    
    @Override
    public double CalcularArea(){
        System.out.println("Area de Cuadrado: ");
        System.out.println(area = this.lado*this.lado);
        return area;
    }
    @Override
    public double CalcularPerimetro(){
        System.out.println("Perimetro del Cuadrado: ");
        Double pr = this.lado*4;
        System.out.println(pr);
        return pr;
    }
}
