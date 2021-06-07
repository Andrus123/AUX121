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
	public boolean Adicionaralumno(String idaula)throws ClassNotFoundException, IOException{
		String resp;
		boolean sw = false;
		ObjectInputStream aCurso = null;
		ObjectOutputStream archAux = null;
		try {
			aCurso = new ObjectInputStream(new FileInputStream(nomCurso));
			archAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true) {
				curso = new Curso();
				curso = (Curso)aCurso.readObject();
				if(curso.getIdcurso().equals(idaula)) {
					curso.adicionaralumno();
					curso.mostrar();
					archAux.writeObject(curso);
					sw = true;
				}
			}
		} catch (Exception e) {
			System.out.println("Fin adicion alumno");
			// TODO: handle exception
		}finally {
			aCurso.close();
			archAux.close();
			File f1 = new File(nomCurso);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
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
	public boolean IntercambiarProfes(String idaulaX, String idaulaY)throws ClassNotFoundException, IOException{
		Profesor aux1 = null;
		Profesor aux2 = null;
		boolean sw = false;
		ObjectInputStream aCurso = null;
		ObjectOutputStream archAux = null;
		try {
			aCurso = new ObjectInputStream(new FileInputStream(nomCurso));
			archAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true) {
				curso = new Curso();
				curso = (Curso)aCurso.readObject();
				if(curso.getIdcurso().equals(idaulaX))
					aux1 = curso.P;
				if(curso.getIdcurso().equals(idaulaY))
					aux2 = curso.P;
				if(curso.getIdcurso().equals(idaulaX)) {
					curso.setP(aux2);
				}
				if(curso.getIdcurso().equals(idaulaY)) {
					curso.setP(aux1);
				}
				archAux.writeObject(curso);
				 sw = true;
			}
		} catch (Exception e) {
			System.out.println("Fin Intercambio");
			// TODO: handle exception
		}finally {
			aCurso.close();
			archAux.close();
			File f1 = new File(nomCurso);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
}
