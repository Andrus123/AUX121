/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Andrés Aquin
 */
public class Excepciones {
    public static void main(String[] args) {
        Fecha f[] = new Fecha[10];
        f[0] = new Fecha(3,4,2021);
        f[1] = new Fecha(12,8,2021);
        f[2] = new Fecha(4,2,2021);
        
        for(int i=0; i<15; i++){
            
            
            try {
                f[i].mostrar();
            } catch (Exception e) {
                System.out.println("No existe la posicion "+i);
            }finally{
                System.out.println();
            }
        }
    }
}
