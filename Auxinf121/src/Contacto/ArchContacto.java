/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Andr√©s Aquin
 */
public class ArchContacto implements Serializable{
    protected String nomArch;
    private Contacto contacto;
    private Contacto contactoelimin;
    
    public ArchContacto(String nom) {
    	this.nomArch = nom;
    }
    public void Crear() throws ClassNotFoundException, IOException{
    	ObjectOutputStream aContacto = new ObjectOutputStream(new FileOutputStream(nomArch));
    	aContacto.close();
    }
    public void Adicionar() throws ClassNotFoundException, IOException{
    	String op;
    	ObjectOutputStream aContacto = null;
    	try {
			if(new File(nomArch).exists()) {
				aContacto = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else {
				aContacto = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			do {
				contacto = new Contacto();
				contacto.leer();
				aContacto.writeObject(contacto);
				System.out.println("Desea continuar? s/n");
				op = Leer.dato();
			}while(op.equals("s"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Contacto AÒadidos Exitosamente");
		}finally {
			aContacto.close();
		}
    }
    public void listar() throws ClassNotFoundException, IOException{
    	ObjectInputStream aContacto = null;
    	System.out.println("CONTACTOS: ");
    	try {
			aContacto = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				contacto = new Contacto();
				contacto = (Contacto)aContacto.readObject();
				contacto.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin de Listado");
		}finally {
			aContacto.close();
		}
    }
    public void Verificar(String x, String y) throws ClassNotFoundException, IOException{
    	ObjectInputStream aContacto = null;
    	try {
			aContacto = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				contacto = new Contacto();
				contacto = (Contacto)aContacto.readObject();
				if(contacto.getNombre().equals(x) && contacto.getEtiqueta().equals(y)) {
					System.out.println("\nContacto Encontrado: ");
					contacto.mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin de Listado");
		}finally {
			aContacto.close();
		}
    }
    public void Mostrar(String x) throws ClassNotFoundException, IOException{
    	ObjectInputStream aContacto = null;
    	try {
			aContacto = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				contacto = new Contacto();
				contacto = (Contacto)aContacto.readObject();
				if(contacto.getEtiqueta().equals(x)) {
					System.out.println("\nContacto Encontrado: ");
					contacto.mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin del Mostrado");
		}finally {
			aContacto.close();
		}
    }
    public boolean Eliminar(int x) throws ClassNotFoundException, IOException{
    	boolean sw = false;
    	ObjectInputStream aContacto = null;
    	ObjectOutputStream archAux = null;
    	
    	try {
			aContacto = new ObjectInputStream(new FileInputStream(nomArch));
			archAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true) {
				contacto = new Contacto();
				contacto = (Contacto)aContacto.readObject();
				if(contacto.getTelefono()==x)
					sw = true;
				else
					archAux.writeObject(contacto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n Fin eliminar");
		}finally {
			aContacto.close();
			archAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
    }
}
