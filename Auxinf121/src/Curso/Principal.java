package Curso;

import java.io.FileNotFoundException;
import java.io.IOException;

import Contacto.Leer;
import Vuelo.Pasajero;

public class Principal {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
			ArchCurso archcurso = new ArchCurso("cursos.dat");
			
			int op;
			do {
				System.out.println("\nMENU: "
						+"\n 1. CREAR archivo de Curso"
						+"\n 2. ADICIONAR curso"
						+"\n 3. ADICIONAR alumno"
						+"\n 4. LISTAR curso"
						+"\n 5. MOSTRAR materias por RDA (Registro docente administrativo)"
						+"\n 6. MOSTRAR ALUMNOS mayores a 15"
						+"\n 7. INTERCAMBIAR docentes de dos aulas"
						+"\n 8. Salir");
				op = Leer.datoInt();
				switch (op) {
				case 1:
					archcurso.Crear();
					break;
				case 2:
					archcurso.Adicionar();
					break;
				case 3:
					System.out.println("Ingrese el ID del curso donde se adicionará alumno: ");
					String id = Leer.dato();
					archcurso.Adicionaralumno(id);
					break;
				case 4:
					archcurso.listar();
					break;
				case 5:
					archcurso.mostrarmateriasporRDA();
					break;
				case 6:
					archcurso.mostraralumnosmayoresdequince();
				case 7:
					System.out.println("Ingrese los ID de Aulas a intercambiar docentes");
					String X = Leer.dato();
					String Y = Leer.dato();
					archcurso.IntercambiarProfes(X, Y);
				default:
					break;
				}
			} while (op!=8);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
