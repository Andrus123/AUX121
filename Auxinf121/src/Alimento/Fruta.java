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
public class Fruta extends Alimento{
    public String carbon;
    public String tipo;
    public String azucares;
    
    public Fruta(){
        super();
        this.nombre = "Naranja";
        this.precio = 4;
        this.carbon = "347";
        this.tipo = "Citrico";
        this.azucares = "Sacarosa, Fructosa, Glucosa";
        this.nrov = 1;
        v[0] = "C";
        this.nrom = 1;
        m[0]= "Calcio";
    }

    public Fruta(String carbon, String tipo, String azucares, String nombre, int precio, int nrov, int nrom) {
        super(nombre, precio, nrov, nrom);
        this.carbon = carbon;
        this.tipo = tipo;
        this.azucares = azucares;
    }

    public String getCarbon() {
        return carbon;
    }

    public void setCarbon(String carbon) {
        this.carbon = carbon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAzucares() {
        return azucares;
    }

    public void setAzucares(String azucares) {
        this.azucares = azucares;
    }
    public void leer(){
        super.leer();
        System.out.println("Carbon: ");
        setCarbon(Leer.dato());
        System.out.println("Tipo de fruta: ");
        setTipo(Leer.dato());
        System.out.println("Azucares: ");
        setAzucares(Leer.dato());
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Carbon: "+getCarbon());
        System.out.println("Tipo de fruta: "+getTipo());
        System.out.println("Azucares: "+getAzucares());
    }
    public void insertarPrecioyNombre(){
        System.out.println("Inserte nuevo nombre de fruta: ");
        setNombre(Leer.dato());
        System.out.println("Inserte nuevo precio: ");
        setPrecio(Leer.datoInt());
        this.mostrar();
    }
}

