package Avion;

import java.io.Serializable;

public class Persona implements Serializable{
	protected int ci;
	protected String nombre;
	protected int edad;
	
	public Persona() {
		this.ci = 0;
		this.nombre = "";
		this.edad = 0;
	}
	
	public void leer() {
		System.out.println("CI: ");
		setCi(Leer.datoInt());
		System.out.println("Nombre: ");
		setNombre(Leer.dato());
		System.out.println("Edad: ");
		setEdad(Leer.datoInt());
	}
	
	public void mostrar() {
		System.out.println("CI: "+getCi());
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
