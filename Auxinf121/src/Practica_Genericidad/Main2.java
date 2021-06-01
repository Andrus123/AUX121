package Practica_Genericidad;

import java.util.Iterator;


public class Main2 {
	public static void main(String[] args) {
            //Creando objetos
            PersonalMedico pm1 = new PersonalMedico("Juan Perez", "12344");
            PersonalMedico pm2 = new PersonalMedico("Pepe Mujica", "33242");
            PersonalMedico pm3 = new PersonalMedico("Marc Antony", "32425");
            Enfermera e1 = new Enfermera("Maria Mendez", "24532LP");
            Enfermera e2 = new Enfermera("Kelly Valdivia", "234234CB");
            Enfermera e3 = new Enfermera("Lucero Aquin", "234432LP");
            Administrativo a1 = new Administrativo("Andres Aquin", "10014246");
            Administrativo a2 = new Administrativo("Nadia Castro", "4352234");
            Administrativo a3 = new Administrativo("Carlo Flores", "3352234");
            //Creando las listas
            //a) Crear el método adicionar para adicionar un objeto a la lista
            Lista<Enfermera> l1 = new Lista();
            l1.adicionar(e1);
            l1.adicionar(e2);
            l1.adicionar(e3);
            Lista<PersonalMedico> l2 = new Lista();
            l2.adicionar(pm1);
            l2.adicionar(pm2);
            l2.adicionar(pm3);
            Lista<Administrativo> l3 = new Lista();
            l3.adicionar(a1);
            l3.adicionar(a2);
            l3.adicionar(a3);
            
            System.out.println("\nLista de Enfermeras:");
            for (int i = 1; i <= l1.nroelementos(); i++) {
                l1.obtiene(i).mostrar();
            }
            System.out.println("\nLista de Personal Medico: ");
            for (int i = 1; i <= l2.nroelementos(); i++) {    
                l2.obtiene(i).mostrar();
            }
            System.out.println("\nLista de Administrativos: ");
            for (int i = 1; i <= l3.nroelementos(); i++) {
                l3.obtiene(i).mostrar();
            }
            //b) Crear el método eliminar para eliminar el objeto
            System.out.println("\nEliminando Personal...");
            l1.eliminar(2);
            l2.eliminar(1);
            l3.eliminar(3);
                        System.out.println("\nLista de Enfermeras:");
            for (int i = 1; i <= l1.nroelementos(); i++) {
                l1.obtiene(i).mostrar();
            }
            System.out.println("\nLista de Personal Medico: ");
            for (int i = 1; i <= l2.nroelementos(); i++) {    
                l2.obtiene(i).mostrar();
            }
            System.out.println("\nLista de Administrativos: ");
            for (int i = 1; i <= l3.nroelementos(); i++) {
                l3.obtiene(i).mostrar();
            }
            //c) Crear el metodo eliminar para eliminar el ultimo de la lista
            System.out.println("\nEliminando ultimo de la lista");
            l1.eliminarultimo();
            l2.eliminarultimo();
            l3.eliminarultimo();
            System.out.println("\nLista de Enfermeras:");
            for (int i = 1; i <= l1.nroelementos(); i++) {
                l1.obtiene(i).mostrar();
            }
            System.out.println("\nLista de Personal Medico: ");
            for (int i = 1; i <= l2.nroelementos(); i++) {    
                l2.obtiene(i).mostrar();
            }
            System.out.println("\nLista de Administrativos: ");
            for (int i = 1; i <= l3.nroelementos(); i++) {
                l3.obtiene(i).mostrar();
            }
	}
}
