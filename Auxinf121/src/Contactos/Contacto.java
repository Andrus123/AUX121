package Contactos;

import java.io.Serializable;

public class Contacto implements Serializable{
	private String nombre;
	private String apellido;
	private String etiqueta;
	private int telefono;
	
	public Contacto() {
		this.nombre = "";
		this.apellido = "";
		this.etiqueta = "";
		this.telefono =0;
	}

	public Contacto(String nombre, String apellido, String etiqueta, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.etiqueta = etiqueta;
		this.telefono = telefono;
	}
	
	public void leer() {
		System.out.println("Nombre: ");
		setNombre(Leer.dato());
		System.out.println("Apellido: ");
		setApellido(Leer.dato());
		System.out.println("Etiqueta: ");
		setEtiqueta(Leer.dato());
		System.out.println("Telefono: ");
		setTelefono(Leer.datoInt());
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Etiqueta: "+getEtiqueta());
		System.out.println("Telefono: "+getTelefono());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
