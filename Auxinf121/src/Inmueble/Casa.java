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
    private String codCasa;
    private int nrohabitaciones;
    private int nropuerta;
    
    public Casa(){
        super();
        this.codCasa = "House#2123df";
        this.nrohabitaciones = 7;
        this.nropuerta = 473;
    }

    public Casa(String codCasa, int nrohabitaciones, int nropuerta, Double costo, Double tamaño) {
        super(costo, tamaño);
        this.codCasa = codCasa;
        this.nrohabitaciones = nrohabitaciones;
        this.nropuerta = nropuerta;
    }

    public String getCodCasa() {
        return codCasa;
    }

    public void setCodCasa(String codCasa) {
        this.codCasa = codCasa;
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
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Codigo de Casa: "+getCodCasa());
        System.out.println("N° de habitaciones: "+getNrohabitaciones());
        System.out.println("N° de puerta: "+getNropuerta());
    }
}
