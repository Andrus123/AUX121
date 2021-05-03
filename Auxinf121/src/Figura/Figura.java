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
abstract class Figura {
    protected double area;
    
    public Figura(){
        this.area = 0.0;
    }

    public Figura(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    abstract public double CalcularArea();
    abstract public double CalcularPerimetro();
}
