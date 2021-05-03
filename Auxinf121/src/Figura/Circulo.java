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
public class Circulo extends Figura {
    private final Double pi = 3.1416;
    private double diametro;
    
    public Circulo(){
        super();
        this.diametro = 7.5;
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public Circulo(double diametro, double area) {
        super(area);
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    public void mostrar(){
        System.out.println("\nCirculo: ");
        System.out.println("Diametro: "+getDiametro());
        System.out.println("Circunferencia: "+(this.diametro*pi));
    }
    @Override
    public double CalcularArea(){
        System.out.println("Area de un Circulo: ");
        double radio = this.diametro/2;
        System.out.println(area = pi*(radio*radio));
        return area;
    }
    @Override
    public double CalcularPerimetro(){
        System.out.println("Perimetro del Circulo: ");
        double pr = this.diametro*pi;
        System.out.println(pr);
        return pr;
    }
}
