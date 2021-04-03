/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author andru
 */
public class PrincipalBuzon {
    //4.Eliminar la carta de la matriz con el codigo x
    public static void EliminarX(Buzon b, String cod){
        System.out.println("Ingrese el codigo de la carta a eliminar");
        for (int i=0; i < b.getNroC() ; i++){
            if(b.getC(i,0).equals(cod)){
                b.setC("eliminado", i , 0);
                b.setC("eliminado", i , 1);
                b.setC("eliminado", i , 2);
            }
        }
    }
    public static void main(String[] args){
        //Ejercicio 2: 
        //            1. Instanciar 2 buzones de manera diferente con al
        //               menos 3 cartas cada uno a su vez instanciar 3
        Buzon b1 = new Buzon();
        b1.leer();
        
        Buzon b2 = new Buzon(2, 2);
        b2.leer();
        
        Carta c1 = new Carta("a1","Holo como estas? ");
        Carta c2 = new Carta("a2","Hola como estas? ");
        Carta c3 = new Carta("c1","Holi como estas? ");
        
        b1.mostrar();
        b2.mostrar();
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    //4. Eliminar una carta de la matriz usando codigo x
        EliminarX(b1,Leer.dato());
        b1.mostrar();
    }
    
}
