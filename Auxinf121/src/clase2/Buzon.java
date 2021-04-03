
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author andru
 */
public class Buzon {

    private int nro, nroC;
    private String[][] c = new String[50][3];

        Buzon() {
        this.nro = 0;
        this.nroC = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = "";
            }
        }
    }

    Buzon(int n, int nc) {
        this.nro = n;
        this.nroC = nc;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = "";
            }
        }
    }

    public void leer() {
        System.out.println("Numero: ");
        this.nro = Leer.datoInt();
        System.out.println("Numero Cartas: ");
        this.nroC = Leer.datoInt();
        for (int i = 0; i < getNroC(); i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println("Codigo: ");
                }
                if (j == 1) {
                    System.out.println("Remitente: ");
                }
                if (j == 2) {
                    System.out.println("Receptor: ");
                }
                c[i][j] = Leer.dato();
            }
        }
    }

    public void leer1() {
        for (int i = 0; i < getNroC(); i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println("Codigo: ");
                }
                if (j == 1) {
                    System.out.println("Remitente: ");
                }
                if (j == 2) {
                    System.out.println("Receptor: ");
                }
                c[i][j] = Leer.dato();
            }
        }
    }

    public void mostrar() {
        System.out.println("Numero: " + getNro());
        System.out.println("Numero de cartas: " + getNroC());
        System.out.println("Codigo     Remitente     Receptor");
        for (int i = 0; i < getNroC(); i++) {
            System.out.println(getC(i,0) + " " + getC(i,1) + " " + getC(i,2));
        }
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getNroC() {
        return nroC;
    }

    public void setNroC(int nroC) {
        this.nroC = nroC;
    }

    public String[][] getC() {
        return c;
    }

    public String getC(int i, int j) {
        return c[i][j];
    }

    public void setC(String[][] c) {
        this.c = c;
    }

    public void setC(String v, int i, int j) {
        this.c[i][j] = v;
    }
}
