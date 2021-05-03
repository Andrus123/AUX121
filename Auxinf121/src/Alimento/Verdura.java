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
public class Verdura extends Alimento {
    private String tipo;
    
    public Verdura(){
        super();
        this.tipo = "Hojas";
    }

    public Verdura(String tipo) {
        this.tipo = tipo;
    }

    public Verdura(String tipo, String nombre, int precio, int nrov, int nrom) {
        super(nombre, precio, nrov, nrom);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void leer(){
        super.leer();
        System.out.println("Tipo de verdura: ");
        setTipo(Leer.dato());
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Tipo: "+getTipo());
    }
}
