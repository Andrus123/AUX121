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
    public String tipo;
    
    public Verdura(){
        super();
        this.nombre = "Lechuga";
        this.precio = 3;
        this.nrov = 2;
        v[0]="D";
        v[1]="F";
        this.nrom = 1;
        m[0]="Calcio";
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
    public void Verificarminerales(Verdura x){
        for(int i=0;i<x.nrov;i++){
            for(int j=0;j<this.nrov;j++){
                if(v[i]==v[j]){
                    System.out.println("Vitaminas similares: "+v[i]);
                }
            }
        }
    }
    public void CompararPrecios(Carne x){
        if(x.precio > this.precio){
            System.out.println("\nEl alimento más barato: ");
            this.mostrar();
        }else{
            System.out.println("\nEl alimento más barato: ");
            x.mostrar();
        }
    }
}
