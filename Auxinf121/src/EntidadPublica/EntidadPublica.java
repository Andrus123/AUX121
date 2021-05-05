/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadPublica;

/**
 *
 * @author Andrés Aquin
 */
public class EntidadPublica {
    public String nombre;
    public String direccion;
    public int presupuesto;
    public int nrofuncionarios;
    public String[] funcionarios = new String[50];
    
    public EntidadPublica(){
        this.nombre = "";
        this.direccion = "";
        this.presupuesto = 100000;
        this.nrofuncionarios = 2;
        this.funcionarios[0] = "Juan";
        this.funcionarios[0] = "Pedro";
    }

    public EntidadPublica(String nombre, String direccion, int presupuesto, int nrofuncionarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.presupuesto = presupuesto;
        this.nrofuncionarios = nrofuncionarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getNrofuncionarios() {
        return nrofuncionarios;
    }

    public void setNrofuncionarios(int nrofuncionarios) {
        this.nrofuncionarios = nrofuncionarios;
    }

    public String[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Presupuesto: "+getPresupuesto());
        System.out.println("N° de funcionarios: "+getNrofuncionarios());
        for(int i=0; i<this.nrofuncionarios;i++){
            System.out.println(funcionarios[i]);
        }
    }
}
