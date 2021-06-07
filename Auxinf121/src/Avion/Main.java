package Avion;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
		try {
			ArchAvion archavion = new ArchAvion("aviones.dat");
			
			int op;
			do {
				System.out.println("\nMENU: "
						+"\n 1. CREAR archivo de Avion"
						+"\n 2. ADICIONAR Avion"
						+"\n 3. ADICIONAR pasajero"
						+"\n 4. LISTAR Avion"
						+"\n 5. BUSCAR pasajero"
						+"\n 6. MOSTRAR pasajeros de piloto "
						+"\n 7. ELIMINAR avion"
						+"\n 8. Salir");
				op = Leer.datoInt();
				switch (op) {
				case 1:
					archavion.Crear();
					break;
				case 2:
					archavion.Adicionar();
					break;
				case 3:
					System.out.println("Ingrese la matricula del avion a adicionar Pasajero: ");
					String matri = Leer.dato();
					archavion.Adicionarpasajero(matri);
					break;
				case 4:
					archavion.listar();
					break;
				case 5:
					System.out.println("Ingrese CI a buscar: ");
					int X = Leer.datoInt();
					archavion.buscar(X);
					break;
				case 6:
					System.out.println("Ingrese piloto a buscar: ");
					String Y = Leer.dato();
					archavion.mostrarPasajero(Y);
					break;
				case 7:
					System.out.println("Ingrese Matricula de avion a eliminar: ");
					String M = Leer.dato();
					if (archavion.eliminar(M)) {
						System.out.println("\n Avion Eliminado");
					} else {
						System.out.println("\n Avion no Encontrado");
					}
					break;
				default:
					break;
				}
			} while (op!=8);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
