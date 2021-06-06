package Curso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Contacto.AddObjectOutputStream;

public class ArchCurso implements Serializable{
	protected String nomCurso;
	private Curso curso;
	
	public ArchCurso(String nom) {
		this.nomCurso = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aCurso = new ObjectOutputStream(new FileOutputStream(nomCurso));
		aCurso.close();
	}
	public void Adicionar()throws ClassNotFoundException, IOException{
		String op;
		ObjectOutputStream aCurso = null;
		try {
			if(new File(nomCurso).exists()) {
				aCurso = new AddObjectOutputStream(new FileOutputStream(nomCurso,true));
			}else {
				aCurso = new ObjectOutputStream(new FileOutputStream(nomCurso,true));
			}
			do {
				curso = new Curso();
				curso.leer();
				aCurso.writeObject(curso);
				System.out.println("Desea Continuar? s/n");
				op = Leer.dato();
			} while (op.equals("s"));
		} catch (Exception e) {
			System.out.println("Curso añadido exitosamente");
			// TODO: handle exception
		}finally {
			aCurso.close();
		}
	}
	public void Adicionaralumno()throws ClassNotFoundException, IOException{
		String op;
		ObjectOutputStream aCursos = null;
		ObjectOutputStream aCurso = null;
		try {
			if(new File(nomCurso).exists()) {
				aCurso = new AddObjectOutputStream(new FileOutputStream(nomCurso,true));
			}else {
				aCurso = new ObjectOutputStream(new FileOutputStream(nomCurso,true));
			}
			do {
				curso = new Curso();			
				 
				aCurso.writeObject(curso);
				System.out.println("Desea Continuar? s/n");
				op = Leer.dato();
			} while (op.equals("s"));
		} catch (Exception e) {
			System.out.println("Alumnos añadidos exitosamente");
			// TODO: handle exception
		}finally {
			aCurso.close();
		}
	}
	public void listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aCurso = null;
		System.out.println("\nCurso: ");
		try {
			aCurso = new ObjectInputStream(new FileInputStream(nomCurso));
			while (true) {
				curso = new Curso();
				curso = (Curso)aCurso.readObject();
				curso.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Listado");
		}finally {
			aCurso.close();
		}
	}
	public void mostrarmateriasporRDA() throws ClassNotFoundException, IOException{
		System.out.println("Ingrese RDA:");
		String x = Leer.dato();
		ObjectInputStream aCurso = null;
		try {
			aCurso = new ObjectInputStream(new FileInputStream(nomCurso));
			while (true) {
				curso = new Curso();
				curso = (Curso)aCurso.readObject();
				if(curso.getP().getRda().equals(x)) {
					System.out.println("\nMateria encontrada: "+curso.getMateria());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------------");
		}finally {
			aCurso.close();
		}
	}
	public void mostraralumnosmayoresdequince() throws ClassNotFoundException, IOException{
		System.out.println("\nAlumnos mayores a 15: ");
		ObjectInputStream aCurso = null;
		try {
			aCurso = new ObjectInputStream(new FileInputStream(nomCurso));
			while (true) {
				curso = new Curso();
				curso = (Curso)aCurso.readObject();
				curso.mostrarxedad(15);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("alumnos mayores a 15");
		}finally {
			aCurso.close();
		}
	}
}
