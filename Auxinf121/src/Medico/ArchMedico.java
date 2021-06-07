package Medico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ArchMedico implements Serializable{
	protected String na;
	private Medico medico;
	
	public ArchMedico(String nom) {
		this.na = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aMedico = new ObjectOutputStream(new FileOutputStream(na));
		aMedico.close();
	}
	public void Adicionar()throws ClassNotFoundException, IOException{
		String op;
		ObjectOutputStream aMedico = null;
		try {
			if(new File(na).exists()) {
				aMedico = new AddObjectOutputStream(new FileOutputStream(na,true));
			}else {
				aMedico = new ObjectOutputStream(new FileOutputStream(na,true));
			}
			do {
				medico = new Medico();
				medico.leer();
				aMedico.writeObject(medico);
				System.out.println("Desea Continuar? s/n");
				op = Leer.dato();
			} while (op.equals("s"));
		} catch (Exception e) {
			System.out.println("Medicos añadidos exitosamente");
			// TODO: handle exception
		}finally {
			aMedico.close();
		}
	}
	public void listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aMedico = null;
		try {
			aMedico = new ObjectInputStream(new FileInputStream(na));
			while (true) {
				medico = new Medico();
				medico = (Medico)aMedico.readObject();
				medico.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Listado");
		}finally {
			aMedico.close();
		}
	}
	public void mostrarxEspecialidad() throws ClassNotFoundException, IOException{
		System.out.println("Ingrese especialidad: ");
		String x = Leer.dato();
		int c = 0;
		ObjectInputStream aMedico = null;
		try {
			aMedico = new ObjectInputStream(new FileInputStream(na));
			while (true) {
				medico = new Medico();
				medico = (Medico)aMedico.readObject();
				if(medico.mostrarxespec(x)) {
					c++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cantidad de médicos de especialidad: "+x+" = "+c);
		}finally {
			aMedico.close();
		}
	}
	public void mostrarMedicosdosespecs() throws ClassNotFoundException, IOException{
		System.out.println("\nMedicos con más de 2 especialidades: ");
		ObjectInputStream aMedico = null;
		try {
			aMedico = new ObjectInputStream(new FileInputStream(na));
			while (true) {
				medico = new Medico();
				medico = (Medico)aMedico.readObject();
				if(medico.getNroEspecialidad()>2) {
					medico.mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			aMedico.close();
		}
	}
	public boolean eliminar(String cod) throws ClassNotFoundException, IOException{
		boolean sw = false;
		ObjectInputStream aMedico = null;
		ObjectOutputStream archAux = null;
		
		try {
			aMedico = new ObjectInputStream(new FileInputStream(na));
			archAux = new ObjectOutputStream(new FileOutputStream("copia.dat",true));
			while (true) {
				medico = new Medico();
				medico = (Medico)aMedico.readObject();
				if(medico.getCodMedico().equals(cod)) 
					sw = true;
				else
					archAux.writeObject(medico);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Fin eliminar");
		}finally {
			aMedico.close();
			archAux.close();
			File f1 = new File(na);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
}

