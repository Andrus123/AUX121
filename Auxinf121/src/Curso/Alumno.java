package Curso;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable{
	public String rude;
	public String domicilio;
	
	public Alumno() {
		super();
		this.rude = "";
		this.domicilio = "";
	}
	
	public void leer() {
		super.leer();
		System.out.println("RUDE:");
		setRude(Leer.dato());
		System.out.println("Domicilio: ");
		setDomicilio(Leer.dato());
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("RUDE: "+getRude());
		System.out.println("Domicilio: "+getDomicilio());
	}

	public String getRude() {
		return rude;
	}

	public void setRude(String rude) {
		this.rude = rude;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
