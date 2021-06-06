package Vuelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Contacto.AddObjectOutputStream;

public class ArchPasajero implements Serializable{
	protected String nomPas;
	private Pasajero pasajero;
	private Pasajero pasajeroencontrado;
	
	public ArchPasajero(String nom) {
		this.nomPas = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aPasajero = new ObjectOutputStream(new FileOutputStream(nomPas));
		aPasajero.close();
	}
	public void Adicionar()throws ClassNotFoundException, IOException{
		String op;
		ObjectOutputStream aPasajero = null;
		try {
			if(new File(nomPas).exists()) {
				aPasajero = new AddObjectOutputStream(new FileOutputStream(nomPas,true));
			}else {
				aPasajero = new ObjectOutputStream(new FileOutputStream(nomPas,true));
			}
			do {
				pasajero = new Pasajero();
				pasajero.leer();
				aPasajero.writeObject(pasajero);
				System.out.println("Desea Continuar? s/n");
				op = Leer.dato();
			} while (op.equals("s"));
		} catch (Exception e) {
			System.out.println("Contactos añadidos exitosamente");
			// TODO: handle exception
		}finally {
			aPasajero.close();
		}
	}
	public void listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aPasajero = null;
		System.out.println("\nPasajero encontrado.....");
		try {
			aPasajero = new ObjectInputStream(new FileInputStream(nomPas));
			while (true) {
				pasajero = new Pasajero();
				pasajero = (Pasajero)aPasajero.readObject();
				pasajero.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Listado");
		}finally {
			aPasajero.close();
		}
	}
	public Pasajero MostrarDestino(String x) throws ClassNotFoundException, IOException{
		ObjectInputStream aPasajero = null;
		System.out.println("\nPasajeros: ");
		try {
			aPasajero = new ObjectInputStream(new FileInputStream(nomPas));
			while (true) {
				pasajero = new Pasajero();
				pasajero = (Pasajero)aPasajero.readObject();
				if(pasajero.getNombrePasajero().equals(x)) {
					pasajeroencontrado = pasajero;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			return pasajeroencontrado;
		}finally {
			aPasajero.close();
		}
	}
}
