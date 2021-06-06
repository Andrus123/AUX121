package Curso;

import java.io.Serializable;

public class Curso implements Serializable{
	public String idcurso;
	public String materia;
	public int nroal;
	public Alumno [] A = new Alumno[100];
	public Profesor P;
	
	public Curso() {
		this.idcurso = "LAB123";
		this.materia = "INF121";
		this.nroal = 2;
		for (int i = 0; i < nroal; i++) {
			A[i] = new Alumno();
		}
		this.P = new Profesor();
	}
	
	public void leer() {
		System.out.println("ID del Curso: ");
		setIdcurso(Leer.dato());
		System.out.println("Materia: ");
		setMateria(Leer.dato());
		System.out.println("N° de alumnos: ");
		setNroal(Leer.datoInt());
		for (int i = 0; i < getNroal(); i++) {
			A[i].leer();
		}
		System.out.println("Profesor/a: ");
		this.P.leer();
	}
	
	public void mostrar() {
		System.out.println("ID del Curso: "+getIdcurso());
		System.out.println("Materia: "+getMateria());
		System.out.println("N° de alumnos: "+getNroal());
		System.out.println("\nAlumnos: ");
		for (int i = 0; i < getNroal(); i++) {
			A[i].mostrar();;
		}
		System.out.println("\nProfesor/a: ");
		this.P.mostrar();
	}
	
	public void mostrarxedad(int edad) {
		for (int i = 0; i < getNroal(); i++) {
			if(A[i].getEdad()>edad) {
				A[i].mostrar();
			}
		}
	}
	
	public void adicionaralumno() {
		setNroal(nroal++);
		A[getNroal()] = new Alumno();
		A[getNroal()].leer();
	}

	public String getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(String idcurso) {
		this.idcurso = idcurso;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getNroal() {
		return nroal;
	}

	public void setNroal(int nroal) {
		this.nroal = nroal;
	}

	public Alumno[] getA() {
		return A;
	}

	public void setA(Alumno[] a) {
		A = a;
	}

	public Profesor getP() {
		return P;
	}

	public void setP(Profesor p) {
		P = p;
	}
	
	
}
