package Vuelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Contacto.AddObjectOutputStream;

public class ArchVuelo implements Serializable{
	protected String nomVuelo;
	private Vuelo vuelo;
	
	public ArchVuelo(String nom) {
		this.nomVuelo = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aVuelo = new ObjectOutputStream(new FileOutputStream(nomVuelo));
		aVuelo.close();
	}
	public void Adicionar()throws ClassNotFoundException, IOException{
		String op;
		ObjectOutputStream aVuelo = null;
		try {
			if(new File(nomVuelo).exists()) {
				aVuelo = new AddObjectOutputStream(new FileOutputStream(nomVuelo,true));
			}else {
				aVuelo = new ObjectOutputStream(new FileOutputStream(nomVuelo,true));
			}
			do {
				vuelo = new Vuelo();
				vuelo.leer();
				aVuelo.writeObject(vuelo);
				System.out.println("Desea Continuar? s/n");
				op = Leer.dato();
			} while (op.equals("s"));
		} catch (Exception e) {
			System.out.println("Contactos añadidos exitosamente");
			// TODO: handle exception
		}finally {
			aVuelo.close();
		}
	}
	public void listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aVuelo = null;
		System.out.println("\nVuelo: ");
		try {
			aVuelo = new ObjectInputStream(new FileInputStream(nomVuelo));
			while (true) {
				vuelo = new Vuelo();
				vuelo = (Vuelo)aVuelo.readObject();
				vuelo.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Listado");
		}finally {
			aVuelo.close();
		}
	}
	public void mostrarDestino(Pasajero x) throws ClassNotFoundException, IOException{
		ObjectInputStream aVuelo = null;	
		try {
			aVuelo = new ObjectInputStream(new FileInputStream(nomVuelo));
			while (true) {
				vuelo = new Vuelo();
				vuelo = (Vuelo)aVuelo.readObject();
				if(vuelo.getCodigo().equals(x.getCodigo())) {
					System.out.println("Destino de pasajero: "+x.getNombrePasajero());
					System.out.println("----"+vuelo.getDestino()+"----");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("|||||||||||||");
		}finally {
			aVuelo.close();
		}
	}
	public void Cantidadvuelos(String x, String y, String z) throws ClassNotFoundException, IOException{
		ObjectInputStream aVuelo = null;
		int c = 0;
		try {
			aVuelo = new ObjectInputStream(new FileInputStream(nomVuelo));
			while (true) {
				vuelo = new Vuelo();
				vuelo = (Vuelo)aVuelo.readObject();
				if(vuelo.getOrigen().equals(x) && vuelo.getDestino().equals(y) && vuelo.getFecha().equals(z)) {
					c++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cantidad de vuelos: "+c);
		}finally {
			aVuelo.close();
		}
	}
}
