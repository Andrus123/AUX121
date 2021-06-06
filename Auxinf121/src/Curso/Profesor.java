package Curso;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable{
	public String rda;
	public String genero;
	
	public Profesor() {
		super();
		this.rda = "";
		this.genero = "";
	}
	
	public void leer() {
		super.leer();
		System.out.println("RDA: ");
		setRda(Leer.dato());
		System.out.println("Genero: ");
		setGenero(Leer.dato());
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("RDA: "+getRda());
		System.out.println("Genero: "+getGenero());
	}

	public String getRda() {
		return rda;
	}

	public void setRda(String rda) {
		this.rda = rda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
