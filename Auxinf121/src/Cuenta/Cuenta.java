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
        this.extensionCorreo = "@gmail.com";
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
        this.extensionCorreo = "@"+extensionCorreo;
    }

    public int getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(int fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }
    public void leer(){
        us.leer();
        System.out.println("Extension de correo: ");
        setExtensionCorreo(Leer.dato());
        System.out.println("Fecha de creación: ");
        setFechadecreacion(Leer.datoInt());
    }
    public void mostrar(){
        System.out.println("\nUsuario creado exitosamente: ");
        us.mostrar();
        System.out.println("Extension: "+getExtensionCorreo());
        System.out.println("Fecha de creación: "+getFechadecreacion());
    }
    public void correo(){
        System.out.println("\nCorreo: "+us.nombre.toLowerCase()
                +us.apellido.toLowerCase()+us.edad+getExtensionCorreo());
    }
    public void celular(Cuenta x, Cuenta y){
        System.out.println("\nIntercambio de numeros entre usuarios: ");
        int aux = x.us.getNrodecelular();
        x.us.setNrodecelular(y.us.getNrodecelular());
        y.us.setNrodecelular(aux);
    }
}
