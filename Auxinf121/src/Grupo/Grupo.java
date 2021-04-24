/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo;

/**
 *
 * @author Andrés Aquin
 */
public class Grupo {
    private String nombreGrupo;
    private int np;
    private Persona []P = new Persona[50];
    
    Grupo(String nombreg, int nro){
        nombreGrupo = nombreg;
        np = nro;
        for(int i =0; i<np; i++){
                P[i] = new Persona("bbb", 10, 1.10);
        }
    }
    public void mostrar(){
        System.out.println("Nombre del Grupo: "+ getNombreGrupo());
        System.out.println("Numero de personas: "+ getNp());
        for(int i =0; i<np; i++){
                P[i].mostrar();
        }
    }
    
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public Persona[] getP() {
        return P;
    }
    public Persona getPi(int i) {
        return P[i];
    }

    public void setP(Persona[] P) {
        this.P = P;
    }
    
    
}
