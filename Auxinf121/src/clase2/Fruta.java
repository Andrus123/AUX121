/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import clase1.Leer;

/**
 *
 * @author andru
 */
public class Fruta {

    private String nombre, tipo;
    private int nroVit;
    private String[] v = new String[30];

    //1)Instanciar de 3 formas diferentes 3 FRUTAS con al menos dos vitaminas
    //cada una
    Fruta() {
        this.nombre = "";
        this.tipo = "";
        this.nroVit = 0;
        for (int i = 0; i < 30; i++) {
            v[i] = "";
        }
    }

    Fruta(String n, String t) {
        this.nombre = n;
        this.tipo = t;
        this.nroVit = 0;
        for (int i = 0; i < 30; i++) {
            v[i] = "";
        }
    }

    Fruta(String n, String t, int nv) {
        this.nombre = n;
        this.tipo = t;
        this.nroVit = nv;
        for (int i = 0; i < 30; i++) {
            v[i] = "";
        }
    }

    //Este leer solo lee las vitaminas
    public void leer2() {
        for (int i = 0; i < getNroVit(); i++) {
            System.out.println("Vitamina " + (i + 1) + " : ");
            v[i] = Leer.dato();
        }
    }

    //Este metodo lee el numero de vitaminas y las vitaminas
    public void leer1() {
        System.out.println("Nro de vitaminas para la siguiente fruta");
        this.nroVit = Leer.datoInt();
        for (int i = 0; i < getNroVit(); i++) {
            System.out.println("Vitamina " + (i + 1) + " : ");
            v[i] = Leer.dato();
        }
    }

    //Este leer lee todo, numero de vitaminas, el nombre, tipo, y las vitaminas
    public void leer() {
        System.out.println("Ingrese la última fruta: ");
        System.out.println("Nombre: ");
        this.nombre = Leer.dato();
        System.out.println("Tipo: ");
        this.tipo = Leer.dato();
        System.out.println("Nro de Vitaminas: ");
        this.nroVit = Leer.datoInt();
        for (int i = 0; i < getNroVit(); i++) {
            System.out.println("Vitamina " + (i + 1) + " : ");
            v[i] = Leer.dato();
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nro de Vitaminas: " + getNroVit());
        for (int i = 0; i < getNroVit(); i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    //3) Mostrar las vitaminas de la fruta x
    public void mostrarVitX(String x) {
        if (getNombre().equals(x)) {
            for (int i = 0; i < getNroVit(); i++) {
                System.out.print(v[i] + " ");
            }
            System.out.println();
        }
    }
    public void ContarCitricos(Fruta f2, Fruta f1) {
        int c = 0;
        if (getTipo().equals("citrico")) {
            c = c + 1;
        }
        if (f2.getTipo().equals("citrico")) {
            c = c + 1;
        }
        if (f1.getTipo().equals("citrico")) {
            c = c + 1;
        }
        System.out.println("Número de Cítricos:  " + c );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroVit() {
        return nroVit;
    }

    public void setNroVit(int nroVit) {
        this.nroVit = nroVit;
    }

    public String[] getV() {
        return v;
    }

    public void setV(String[] v) {
        this.v = v;
    }

    public void Verificar(String x) {
        int sw = 0;
        for (int i = 0; i < getNroVit(); i++) {
            if (Fruta.this.getV().equals(x)) {
                sw = 1;
            }
        }
    }

}
