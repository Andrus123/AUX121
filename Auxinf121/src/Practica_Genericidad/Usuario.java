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
public class Usuario <T>{
    private String cod;
    private String nom;
    private T contraseña;
    
    public Usuario(){
        this.cod = "dsff123";
        this.nom = "Peter Parker";
        this.contraseña = (T)contraseña;
    }

    public Usuario(String cod, String nom, T contraseña) {
        this.cod = cod;
        this.nom = nom;
        this.contraseña = contraseña;
    }
    
    public void mostrar(){
        System.out.println("Codigo: "+getCod());
        System.out.println("Nombre: "+getNom());
        System.out.println("Contraseña"+getContraseña());
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public T getContraseña() {
        return contraseña;
    }

    public void setContraseña(T contraseña) {
        this.contraseña = contraseña;
    }
    
}
