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

    public EntidadPublica() {
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

    public void mostrar() {
        System.out.println("\nNombre: " + getNombre());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Presupuesto: " + getPresupuesto());
        System.out.println("N° de funcionarios: " + getNrofuncionarios());
        for (int i = 0; i < this.nrofuncionarios; i++) {
            System.out.println(funcionarios[i]);
        }
    }

    public void MismoPersonal(EntidadPublica x, EntidadPublica y) {
        for (int i = 0; i < x.nrofuncionarios; i++) {
            for (int j = 0; j < y.nrofuncionarios; j++) {
                if (x.funcionarios[i] == y.funcionarios[j]) {
                    System.out.println("\nPersonal en dos Entidades Publicas: "
                            + x.funcionarios[i]);
                }
            }
        }
    }

    public void CambiarDireccion() {
        System.out.println("\nIngrese nueva dirección");
        setDireccion(Leer.dato());
        this.mostrar();
    }

    public void CompararPresupuestos(EntidadPublica[] ent, EntidadPublica x, EntidadPublica y, EntidadPublica z) {
        ent[0] = x;
        ent[1] = y;
        ent[2] = z;
        EntidadPublica aux = new EntidadPublica();
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j <3;j++) {
                if (ent[i].presupuesto < ent[j].presupuesto) {
                    aux = ent[i];
                    ent[i] = ent[j];
                    ent[j] = aux;
                }
            }
        }
        System.out.println("\nPresupuestos de Entidades Publicas: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(ent[i].nombre + " Presupuesto: " + ent[i].presupuesto);
        }
    }
    public void CambioPersonal(EntidadPublica x, EntidadPublica y){
        System.out.println("Ingrese el empleado: ");
        String per = Leer.dato();
        for(int i=0; i<x.nrofuncionarios; i++){
            if(x.funcionarios[i].equals(per)){
                String aux = x.funcionarios[i];
                x.funcionarios[i] = x.funcionarios[i+1];
                x.funcionarios[i+1] = aux;
            }
        }
        x.nrofuncionarios--;
        y.nrofuncionarios++;
        y.funcionarios[y.nrofuncionarios-1] = per;
        x.mostrar();
        y.mostrar();
    }
}
