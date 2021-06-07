package Avion;

import java.io.Serializable;

public class Piloto extends Persona implements Serializable{
	private int nrovuelosrealizados;
	
	public Piloto() {
		super();
		this.nrovuelosrealizados = 0;
	}
	
	public void leer() {
		super.leer();
		System.out.println("Nro de vuelos realizados: ");
		setNrovuelosrealizados(Leer.datoInt());
	}
	
	public void mostrar() {
		System.out.println("\nPiloto: ");
		super.mostrar();
		System.out.println("N° de vuelos realizados: "+getNrovuelosrealizados());
	}

	public int getNrovuelosrealizados() {
		return nrovuelosrealizados;
	}

	public void setNrovuelosrealizados(int nrovuelosrealizados) {
		this.nrovuelosrealizados = nrovuelosrealizados;
	}
	
	
}
