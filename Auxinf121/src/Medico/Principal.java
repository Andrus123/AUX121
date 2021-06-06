package Medico;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Principal {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
			ArchMedico archmedico = new ArchMedico("medicos.dat");
			
			int op;
			do {
				System.out.println("\nMENU: "
						+"\n 1. CREAR archivo de medicos"
						+"\n 2. ADICIONAR medico"
						+"\n 3. LISTAR medicos"
						+"\n 4. MOSTRAR medicos x especialidad"
						+"\n 5. MOSTRAR medicos con más de 2 especialidades: "
						+"\n 6. ELIMINAR medico x codigo medico"
						+"\n 7. Salir");
				op = Leer.datoInt();
				switch (op) {
				case 1:
					archmedico.Crear();
					break;
				case 2:
					archmedico.Adicionar();
					break;
				case 3:
					archmedico.listar();
					break;
				case 4:
					archmedico.mostrarxEspecialidad();
					break;
				case 5:
					archmedico.mostrarMedicosdosespecs();
					break;
				case 6:
					archmedico.eliminar();
					break;
				default:
					break;
				}
			} while (op!=7);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
