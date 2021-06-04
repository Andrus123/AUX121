package Contactos;

import java.io.Serializable;
import java.util.Iterator;

public class archContactos implements Serializable{
	protected String nomContacto;
	protected int cont;
	protected Contacto[] contactos;
	protected Contacto encontrado;
	
	public archContactos() {
		this.nomContacto = "";
		this.cont = 0;
		this.contactos = new Contacto[12];
	}
	
	public void addContacto() {
		try {
			String op;
			do {
				cont++;
				contactos[cont] = new Contacto();
				contactos[cont].leer();
				System.out.println("Desea continuar? s/n");
				op = Leer.dato();
			}while(op.equals("s"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Contactos adicionados con éxito");
		}
	}
	
	public void listar() {
		try {
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
			}
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
				contactos[i].mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void Verificar() {
		System.out.println("Ingrese Nombre a buscar: ");
		String x = Leer.dato();
		System.out.println("Ingrese la Etiqueta a buscar: ");
		String y = Leer.dato();
		try {
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
			}
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
				if(contactos[i].getNombre().equals(x) && contactos[i].getEtiqueta().equals(y)) {
					System.out.println("Contacto Encontrado");
					contactos[i].mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void MostrarporX() {
		System.out.println("\nIngrese etiqueta a mostrar: ");
		String z = Leer.dato();
		System.out.println("\nContactos de etiqueta: "+z);
		try {
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
				
			}
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
				if(contactos[i].getEtiqueta().equals(z)) {
					contactos[i].mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void Eliminar() {
		System.out.println("\nIngrese el telefono X para eliminar");
		int t = Leer.datoInt();
		try {
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
			}
			for (int i = 1; i < contactos.length; i++) {
				Contacto contacto = contactos[i];
				if(contactos[i].getTelefono()==t) {
					contactos[i] = null;
					System.gc();
					System.out.println("Contacto eliminado");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public String getNomContacto() {
		return nomContacto;
	}

	public void setNomContacto(String nomContacto) {
		this.nomContacto = nomContacto;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}
	
}
