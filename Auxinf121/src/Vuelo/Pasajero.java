package Vuelo;

import java.io.Serializable;

public class Pasajero implements Serializable{
	private String codigo;
	private String nombrePasajero;
	
	public Pasajero() {
		this.codigo = "";
		this.nombrePasajero = "";
	}

	public Pasajero(String codigo, String nombrePasajero) {
		super();
		this.codigo = codigo;
		this.nombrePasajero = nombrePasajero;
	}
	public void leer() {
		System.out.println("Codigo: ");
		setCodigo(Leer.dato());
		System.out.println("Nombre del Pasajero: ");
		setNombrePasajero(Leer.dato());
	}
	public void mostrar() {
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Nombre del Pasajero: "+getNombrePasajero());
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombrePasajero() {
		return nombrePasajero;
	}

	public void setNombrePasajero(String nombrePasajero) {
		this.nombrePasajero = nombrePasajero;
	}
	
	
}
