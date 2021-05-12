/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
/**
 *
 * @author Andr�s Aquin
 */
public class Juego {
    private String nombre;
    private String categoria;
    private String version;
    private int añoCreacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    public int getAñoCreacion() {
		return añoCreacion;
	}

	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}

	public Juego(){
        nombre = "fortnite";
        categoria = "consola";
        version = "";
        añoCreacion = 0;
    }
    
    public void leer(){
        System.out.println("Nombre: ");
        this.nombre = Leer.dato();
        System.out.println("categoria: ");
        this.categoria = Leer.dato();
        System.out.println("version: ");
        this.version = Leer.dato();
        System.out.println("año de creación: ");
        this.añoCreacion = Leer.datoInt();
    }
    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("categoria: " + getCategoria());
        System.out.println("version: " + getVersion());
        System.out.println("año de creacion: " +getAñoCreacion());
    }
}
