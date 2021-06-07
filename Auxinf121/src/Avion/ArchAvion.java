package Avion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Medico.AddObjectOutputStream;

public class ArchAvion implements Serializable{
	private String nomArch;
	private Avion regAvion;
	
	public ArchAvion(String nom) {
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aAvion = new ObjectOutputStream(new FileOutputStream(nomArch));
		aAvion.close();
	}
	public void Adicionar()throws ClassNotFoundException, IOException{
		String op;
		ObjectOutputStream aAvion = null;
		try {
			if (new File(nomArch).exists()) {
				aAvion = new AddObjectOutputStream(new FileOutputStream(nomArch, true));
			} else {
				aAvion = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			do {
				regAvion = new Avion();
				regAvion.leer();
				aAvion.writeObject(regAvion);
				System.out.println("Desea continuar? s/n");
				op = Leer.dato();
			} while (op.equals("s"));
		} catch (Exception e) {
			System.out.println("Avion añadido exitosamente");
			// TODO: handle exception
		}finally {
			aAvion.close();
		}
	}
	public void listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aAvion = null;
		try {
			aAvion = new ObjectInputStream(new FileInputStream(nomArch));
			while (true) {
				regAvion = new Avion();
				regAvion = (Avion)aAvion.readObject();
				System.out.println("\n Avion: ");
				regAvion.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aAvion.close();
		}
	}
	public boolean Adicionarpasajero(String matricula)throws ClassNotFoundException, IOException{
		boolean sw = false;
		ObjectInputStream aAvion = null;
		ObjectOutputStream archAux = null;
		try {
			aAvion = new ObjectInputStream(new FileInputStream(nomArch));
			archAux = new ObjectOutputStream(new FileOutputStream("copia.dat",true));
			while (true) {
				regAvion = new Avion();
				regAvion = (Avion)aAvion.readObject();
				if(regAvion.getMatricula().equals(matricula)) {
					regAvion.adiPasajero();
					regAvion.mostrar();
					archAux.writeObject(regAvion);
					sw = true;
				}
			}
		} catch (Exception e) {
			System.out.println("Fin adicion pasajero");
			// TODO: handle exception
		}finally {
			aAvion.close();
			archAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
		
	}
	public void buscar(int X)throws ClassNotFoundException, IOException {
		ObjectInputStream aAvion = null;
		try {
			aAvion = new ObjectInputStream(new FileInputStream(nomArch));
			while (true) {
				regAvion = new Avion();
				regAvion = (Avion)aAvion.readObject();
				regAvion.buscar(X);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void mostrarPasajero(String Y)throws ClassNotFoundException, IOException{
		ObjectInputStream aAvion = null;
		try {
			aAvion = new ObjectInputStream(new FileInputStream(nomArch));
			while (true) {
				regAvion = new Avion();
				regAvion = (Avion)aAvion.readObject();
				if(regAvion.getPil().getNombre().equals(Y)) {
					System.out.println("Piloto : "+Y);
					regAvion.mostrarpasajeros();
				}else {
					System.out.println("Piloto no encontrado");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public boolean eliminar(String M) throws ClassNotFoundException, IOException{
		boolean sw = false;
		ObjectInputStream aAvion = null;
		ObjectOutputStream archAux = null;
		
		try {
			aAvion = new ObjectInputStream(new FileInputStream(nomArch));
			archAux = new ObjectOutputStream(new FileOutputStream("copia.dat",true));
			while (true) {
				regAvion = new Avion();
				regAvion = (Avion)aAvion.readObject();
				if(regAvion.getMatricula().equals(M))
					sw = true;
				else
					archAux.writeObject(regAvion);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Fin eliminar");
		}finally {
			aAvion.close();
			archAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
}
