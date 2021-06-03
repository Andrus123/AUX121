/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Andrés Aquin
 */
public class ArchContacto {
    protected String nomContacto;
    protected int n;
    protected Contacto[] contactos;
    
    public ArchContacto(){
        this.nomContacto = "";
        this.contactos = new Contacto[4];
    }
    
    public void addContacto(Contacto c1){
        try {
            n++;
            contactos[n] = c1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void listar(){
        for (int i = 1; i < contactos.length; i++) {
            contactos[i].mostrar();
        }
    }
    
    public void guardar(ArchContacto ac1){
        try {
            ObjectOutputStream w1 = new ObjectOutputStream(new FileOutputStream("Contactos.dat"));
            w1.writeObject(ac1);
            w1.close();
        } catch (IOException e) {
            System.out.println("Error: "+e);
        }
    }
    
    public ArchContacto recuperar() throws IOException, ClassNotFoundException{
        ObjectInputStream r1 = new ObjectInputStream(new FileInputStream("Contactos.dat"));
        ArchContacto ac1 = (ArchContacto) r1.readObject();
        r1.close();
        return(ac1);
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
}
