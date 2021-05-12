/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Andrés Aquin
 */
public class Casa extends Inmueble{
    private String codCas;
    private int nrohabitaciones;
    private int nropuerta;
    
    public Casa(){
        super();
        this.costo = 10700.50;
        this.tamanio = 850.50;
        this.codCas = "HOME123";
        this.nrohabitaciones = 7;
        this.nropuerta = 40;
    }

    public Casa(String codCas, int nrohabitaciones, int nropuerta, double costo, double tamanio) {
        super(costo, tamanio);
        this.codCas = codCas;
        this.nrohabitaciones = nrohabitaciones;
        this.nropuerta = nropuerta;
    }

    public String getCodCas() {
        return codCas;
    }

    public void setCodCas(String codCas) {
        this.codCas = codCas;
    }

    public int getNrohabitaciones() {
        return nrohabitaciones;
    }

    public void setNrohabitaciones(int nrohabitaciones) {
        this.nrohabitaciones = nrohabitaciones;
    }

    public int getNropuerta() {
        return nropuerta;
    }

    public void setNropuerta(int nropuerta) {
        this.nropuerta = nropuerta;
    }
    public void leer(){
        super.leer();
        System.out.println("Codigo Casa: ");
        setCodCas(Leer.dato());
        System.out.println("N° de habitaciones: ");
        setNrohabitaciones(Leer.datoInt());
        System.out.println("N° de puerta: ");
        setNropuerta(Leer.datoInt());
    }
    
    @Override
    public void mostrar(){
        System.out.println("Codigo Casa: "+getCodCas());
        System.out.println("N° de habitaciones: "+getNrohabitaciones());
        System.out.println("N° de puerta: "+getNropuerta());
         super.mostrar();
    }
}
