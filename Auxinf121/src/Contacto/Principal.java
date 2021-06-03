/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

import java.io.IOException;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        try {
            ArchContacto ac1 = new ArchContacto();
            Contacto c1 = new Contacto("Andres", "Aquin", "AQ123");
            Contacto c2 = new Contacto("Kelly", "Valdivia", "KVAL23");
            Contacto c3 = new Contacto("Mauren", "Quiroga", "MQ24");
            ac1.addContacto(c1);
            ac1.addContacto(c2);
            ac1.addContacto(c3);
            ac1.guardar(ac1);
            System.out.println("Contactos guardados con exito");
            
            System.out.println("Recuperando contactos del archivo Contacto");
            ArchContacto ac2 = ac1.recuperar();
            ac2.listar();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
}
