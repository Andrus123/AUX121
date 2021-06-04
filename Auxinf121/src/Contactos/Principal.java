package Contactos;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		try {
			Agenda ag1 = new Agenda();
			archContactos a1 = new archContactos();
			int sw = 0;
			do {
			System.out.println
			("MENU: "
					+"\n AGENDA CREADA Y ARCHIVO CREADO..."
					+"\n1. ADICIONAR"
					+"\n2. GUARDAR"
					+"\n3. RECUPERAR"
					+"\n4. VERIFICAR"
					+"\n5. MOSTRAR contactos por Etiquetas"
					+"\n6. ELIMINAR"
					+"\n7. Salir");
			sw = Leer.datoInt();
			switch (sw) {
			case 1:
				a1 = ag1.recuperar();
				a1.addContacto();
				ag1.guardar(a1);
				break;
			case 2:
				ag1.guardar(a1);
				System.out.println("Contactos guardados");
				break;
			case 3:
				archContactos a2 = ag1.recuperar();
				System.out.println("Agenda Recuperada");
				a2.listar();
				break;
			case 4:
				a1.Verificar();
				break;
			case 5:
				a1 = ag1.recuperar();
				a1.MostrarporX();
				break;
			case 6:
				a1 = ag1.recuperar();
				a1.Eliminar();
				ag1.guardar(a1);
				a1.listar();
				break;
			default:
				break;
				}
			}while(sw!=7);
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error: "+e);
			// TODO: handle exception
		}
	}
}
