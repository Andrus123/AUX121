/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class ArrayObjecto {
    private int n;
    private Object[] v;
    
    public ArrayObjecto(){
        this.n = 2;
        v = new Object[10];
    }
    
    public void adicionar(Object a){
        n++;
        v[n] = a;
    }
    
    public Object obtiene(int i){
        return v[i];
    } 
}
