/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minibus;

/**
 *
 * @author Andrés Aquin
 */
public class Minibus {
    public String chofer;
    public int nruta;
    public String placa;
    
    public Minibus(){
        this.chofer = "Juan Perez";
        this.nruta = 894;
        this.placa = "XTR121";
    }

    public Minibus(String chofer, int nruta, String placa) {
        this.chofer = chofer;
        this.nruta = nruta;
        this.placa = placa;
    }
    
    public void leer(){
        System.out.println("Chofer: ");
        setChofer(Leer.dato());
        System.out.println("Ruta: ");
        setNruta(Leer.datoInt());
        System.out.println("Placa: ");
        setPlaca(Leer.dato());
    }
    public void mostrar(){
        System.out.println("Chofer: "+getChofer());
        System.out.println("Ruta: "+getNruta());
        System.out.println("Placa: "+getPlaca());
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public int getNruta() {
        return nruta;
    }

    public void setNruta(int nruta) {
        this.nruta = nruta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
