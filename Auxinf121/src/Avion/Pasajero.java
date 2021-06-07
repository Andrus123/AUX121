package Avion;

import java.io.Serializable;

public class Pasajero extends Persona implements Serializable{
	private String asiento;
	private int nroBoleto;
	
	public Pasajero() {
		super();
		this.asiento = "";
		this.nroBoleto = 0;
	}
	
	public void leer() {
		super.leer();
		System.out.println("Asiento: ");
		setAsiento(Leer.dato());
		System.out.println("Nro de Boleto: ");
		setNroBoleto(Leer.datoInt());
	}
	
	public void mostrar() {
		System.out.println("Pasajero: ");
		super.mostrar();
		System.out.println("Asiento: "+getAsiento());
		System.out.println("N° de Boleto: "+getNroBoleto());
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public int getNroBoleto() {
		return nroBoleto;
	}

	public void setNroBoleto(int nroBoleto) {
		this.nroBoleto = nroBoleto;
	}
	
	
}
