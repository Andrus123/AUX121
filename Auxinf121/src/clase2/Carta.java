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
public class Carta {
    private String codigo, descripcion;
    
    Carta(String c, String d){
        this.codigo = c;
        this.descripcion = d;
    }
    public void leer(){
        System.out.println("Codigo: ");
        this.codigo = Leer.dato();
        System.out.println("Descripción");
        this.descripcion = Leer.dato();
    }
    public void mostrar(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Descripción: "+ getDescripcion());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
