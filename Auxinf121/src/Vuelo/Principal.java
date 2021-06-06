package Vuelo;

import java.io.FileNotFoundException;
import java.io.IOException;

import Contacto.Leer;

public class Principal {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
			ArchVuelo archvuelo = new ArchVuelo("vuelo.dat");
			ArchPasajero archpasajeros = new ArchPasajero("pasajeros.dat");
			
			int op;
			do {
				System.out.println("\nMENU: "
						+"\n 1. CREAR archivo de Vuelo"
						+"\n 2. CREAR archivo de Pasajeros"
						+"\n 3. ADICIONAR Vuelo"
						+"\n 4. ADICIONAR Pasajeros"
						+"\n 5. LISTAR Vuelo"
						+"\n 6. LISTAR Pasajeros"
						+"\n 7. MOSTRAR destino de pasajero"
						+"\n 8. CANTIDAD de vuelos por datos"
						+"\n 9. Salir");
				op = Leer.datoInt();
				switch (op) {
				case 1:
					archvuelo.Crear();
					break;
				case 2:
					archpasajeros.Crear();
					break;
				case 3:
					archvuelo.Adicionar();
					break;
				case 4:
					archpasajeros.Adicionar();
					break;
				case 5:
					archvuelo.listar();
					break;
				case 6:
					archpasajeros.listar();
					break;
				case 7:
					System.out.println("Ingrese nombre del pasajero: ");
					String x = Leer.dato();
					Pasajero p = archpasajeros.MostrarDestino(x);
					archvuelo.mostrarDestino(p);
					break;
				case 8:
					System.out.println("Ingrese origen: ");
					String X = Leer.dato();
					System.out.println("Ingrese destino: ");
					String Y = Leer.dato();
					System.out.println("Ingrese fecha: ");
					String Z = Leer.dato();
					archvuelo.Cantidadvuelos(X, Y, Z);
					break;
				default:
					break;
				}
			} while (op!=9);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
