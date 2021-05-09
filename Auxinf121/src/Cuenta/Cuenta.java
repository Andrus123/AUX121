/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author Andrés Aquin
 */
public class Cuenta {
    Usuario us;
    private String extensionCorreo;
    private int fechadecreacion;
    
    public Cuenta(){
        us = new Usuario();
        this.extensionCorreo = "gmail.com";
        this.fechadecreacion = 8052021;
    }

    public Cuenta(Usuario us, String extensionCorreo, int fechadecreacion) {
        this.us = us;
        this.extensionCorreo = extensionCorreo;
        this.fechadecreacion = fechadecreacion;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public String getExtensionCorreo() {
        return extensionCorreo;
    }

    public void setExtensionCorreo(String extensionCorreo) {
        this.extensionCorreo = extensionCorreo;
    }

    public int getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(int fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }
    public void leer(){
        us.leer();
        System.out.println("extension de correo: ");
        setExtensionCorreo(Leer.dato());
        System.out.println("Fecha de creación: ");
        setFechadecreacion(Leer.datoInt());
    }
    public void mostrar(){
        System.out.println("Usuario creado exitosamente: ");
        us.mostrar();
        System.out.println("@: "+getExtensionCorreo());
        System.out.println("Fecha de creación: "+getFechadecreacion());
    }
}
