/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_POO;

import clase2.Leer;

/**
 *
 * @author andru
 */
public class Vector {

    private int n;
    private int[] v = new int[30];

    public Vector() {
        this.n = 5;
        this.v[0] = 16;
        this.v[1] = 24;
        this.v[2] = 45;
        this.v[3] = 69;
        this.v[4] = 53;
    }

    public Vector(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public void llenar() {
        System.out.println("Cantidad de numeros: ");
        this.n = Leer.datoInt();
        for (int i = 0; i < n; i++) {
            v[i] = Leer.datoInt();
        }
    }

    public void mostrar() {
        System.out.println("Vector: ");
        for (int i = 0; i < getN(); i++) {
            System.out.println(v[i]);
        }
    }

    public void sumarElementos() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + v[i];
        }
        System.out.println("TOTAL: " + suma);
    }

    public void ordenarVector() {
        int aux = 0;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (v[j]>v[j+1] ) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
    }
    public void sumaVectores(Vector x){
        int total = 0;
        for(int i = 0; i<n;i++){
            total = total + this.v[i] + x.v[i]; 
        }
        System.out.println("TOTAL DE VECTORES: "+total);
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.mostrar();
        v2.llenar();
        v1.sumarElementos();
        v2.mostrar();
        v2.sumarElementos();
        v1.ordenarVector();
        v1.mostrar();
        v2.ordenarVector();
        v2.mostrar();
        v1.sumaVectores(v2);
    }
}
