/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class Lista <T>{
    private int nroElementos;
    private T[] lista;

    public Lista() {
        this.nroElementos = 0;
        lista = (T[])new Object[50];
    }
    
    public void adicionar(T a){
        nroElementos++;
        lista[nroElementos] = a;
    }
    public void eliminar(int i){
        for (int j = i; j <= this.nroElementos; j++) {
            lista[j] = lista[j+1];
        }
        this.nroElementos--;
    }
    public void eliminarultimo(){
        for (int j = this.nroElementos; j <= this.nroElementos; j++) {
            lista[j] = lista[j+1];
        }
        this.nroElementos--;
    }
    public T obtiene(int i){
        return(lista[i]);
    }
    
    public int nroelementos(){
        return this.nroElementos;
    }
}
