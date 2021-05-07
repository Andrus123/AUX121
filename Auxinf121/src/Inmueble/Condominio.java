/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Andrés Aquin
 */
public class Condominio {
    private String nombre;
    private Casa [] codCasas = new Casa[4];
    private Departamento [] codEdificios = new Departamento[5];

    public Condominio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa[] getCodCasas() {
        return codCasas;
    }

    public void setCodCasas(Casa[] codCasas) {
        this.codCasas = codCasas;
    }

    public Departamento[] getCodEdificios() {
        return codEdificios;
    }

    public void setCodEdificios(Departamento[] codEdificios) {
        this.codEdificios = codEdificios;
    }
    
    public void mostrar(){
        
    }
}
