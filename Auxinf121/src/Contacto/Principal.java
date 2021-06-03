/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

import java.io.FileNotFoundException;
import java.io.IOException;



/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
    	try {
			ArchContacto archcontacts = new ArchContacto("Contactos.dat");
			
			int op;
			
			do {
				System.out.println("\nMENU: "
						+"\n 1. CREAR archivo de contactos"
						+"\n 2. ADICIONAR Contacto"
						+"\n 3. LISTAR Contactos"
						+"\n 4. VERIFICAR Contactos"
						+"\n 5. MOSTRAR Contactos con Etiqueta X"
						+"\n 6. ELIMINAR Contacto con Telefono x"
						+"\n 7. Salir");
				op = Leer.datoInt();
				switch (op) {
				case 1:
					archcontacts.Crear();
					break;
				case 2:
					archcontacts.Adicionar();
					break;
				case 3:
					archcontacts.listar();
					break;
				case 4:
					System.out.println("Ingrese nombre a verificar: ");
					String x = Leer.dato();
					System.out.println("Ingrese la etiqueta a verificar: ");
					String y = Leer.dato();
					archcontacts.Verificar(x, y);
					break;
				case 5:
					System.out.println("Ingrese la etiqueta: ");
					String z = Leer.dato();
					archcontacts.Mostrar(z);
					break;
				case 6:
					System.out.println("Ingrese el telefono: ");
					int t = Leer.datoInt();
					archcontacts.Eliminar(t);
				default:
					break;
				}
			}while(op!=7);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
