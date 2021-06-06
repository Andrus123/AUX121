package Curso;

import java.io.Serializable;

public class Persona implements Serializable{
	public String nombre;
	public String Ci;
	public int edad;
	
	public Persona() {
		this.nombre = "";
		this.Ci = "";
		this.edad = 0;
	}
	
	public void leer() {
		System.out.println("Nombre: ");
		setNombre(Leer.dato());
		System.out.println("CI: ");
		setCi(Leer.dato());
		System.out.println("Edad: ");
		setEdad(Leer.datoInt());
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("CI: "+getCi());
		System.out.println("Edad: "+getEdad());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return Ci;
	}

	public void setCi(String ci) {
		Ci = ci;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
