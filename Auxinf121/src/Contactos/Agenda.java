package Contactos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Agenda extends archContactos{
	
	public Agenda() {
		super();
	}
	
	public void guardar(archContactos a1) {
		try {
			ObjectOutputStream w1 = new ObjectOutputStream(new FileOutputStream("Agenda.dat"));
			w1.writeObject(a1);
			w1.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+ e);
		}
	}
	
	public archContactos recuperar() throws IOException, ClassNotFoundException{
		ObjectInputStream r1 = new ObjectInputStream(new FileInputStream("Agenda.dat"));
		archContactos a1 = (archContactos) r1.readObject();
		r1.close();
		return (a1);
	}
}
