/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimento;

/**
 *
 * @author Andrés Aquin
 */
public class Carne extends Alimento{
    public String clase;
    public String proteinas;
    public String corte;
    
    public Carne(){
        super();
        this.nombre = "de Vaca";
        this.precio = 30;
        this.nrov = 1;
        this.v[0] = "B";
        this.nrom = 2;
        this.m[0]="Zinc";
        this.m[1]="Potasio";
        this.clase = "Vacuno";
        this.proteinas = "24 gramos";
        this.corte = "Filete Cadera";
    }

    public Carne(String clase, String proteinas, String corte, String nombre, int precio, int nrov, int nrom) {
        super(nombre, precio, nrov, nrom);
        this.clase = clase;
        this.proteinas = proteinas;
        this.corte = corte;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Clase de carne: ");
        setClase(Leer.dato());
        System.out.println("Proteinas: ");
        setProteinas(Leer.dato());
        System.out.println("Corte: ");
        setCorte(Leer.dato());
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Clase de carne: "+getClase());
        System.out.println("Proteinas: "+getProteinas());
        System.out.println("Corte: "+getCorte());
    }
}
