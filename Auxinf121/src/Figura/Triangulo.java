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
public class Triangulo extends Figura{
    private Double b;
    private Double a;
    
    public Triangulo(){
        super();
        this.b = 50.0;
        this.a = 47.0;
    }

    public Triangulo(Double b, Double a) {
        this.b = b;
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }
    
    public void mostrar(){
        System.out.println("Triangulo: ");
        System.out.println("Base: "+b);
        System.out.println("Altura: "+a);
    }
    @Override
    public double CalcularArea(){
        area = (this.b*this.a)/2;
        System.out.println("Area del Triangulo: "+area);
        return area;
    }
    @Override
    public double CalcularPerimetro(){
        Double hp = Math.sqrt((a*a+b*b));
        System.out.println("Hipotenusa: "+hp);
        System.out.println("Perimetro: "+(a+b+hp));
        return hp;
    }
}
