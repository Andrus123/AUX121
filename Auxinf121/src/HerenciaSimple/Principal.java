/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaSimple;

import clase2.Leer;

/**
 *
 * @author andru
 */
public class Principal{
    
    public static void verificar(Sillon a, Ropero b){
        if(a.getMaterial().equals(b.getMaterial())){
            System.out.println("Si tienen el mismo material");
        }else{
            System.out.println("No tienen el mismo material");
        }
    }
    
    public static void main(String[] args){
        System.out.println("Sillon:");
        Sillon s = new Sillon("cuero",15,"cafe",3);
        s.mostrar();
        System.out.println("Ropero:");
        Ropero r = new Ropero("pino",20,"blanco",5,12,15);
        r.mostrar();
        verificar(s,r);
        Sillon [] arr = new Sillon [100];
        int cant = Leer.datoInt();
        for(int i=0; i<cant; i++){
            String m = Leer.dato();
            int p = Leer.datoInt();
            String c = Leer.dato();
            int cap = Leer.datoInt();
            arr[i] = new Sillon(m,p,c,cap);
        }
        for(int i=0; i<cant;i++){
            arr[i].mostrar();
        }
        int max = 0;
        int min = 10000;
        for(int i=0;i<cant;i++){
            if(arr[i].getCapacidad() > max){
                max = arr[i].getCapacidad();
            }
            if(arr[i].getCapacidad()< min){
                min = arr[i].getCapacidad();
            }
        }
        System.out.println("Sillones con maxima capacidad:");
        for(int i=0;i<cant;i++){
            if(arr[i].getCapacidad()==max){
                arr[i].mostrar();
            }
        }
        System.out.println("Sillones con mínima capacidad:");
        for(int i=0;i<cant;i++){
            if(arr[i].getCapacidad()==min){
                arr[i].mostrar();
            }
        }
    }
}
