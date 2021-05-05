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
public class Ministerio extends EntidadPublica{
    
    public Ministerio(){
        super();
        this.nombre = "Ministerio de Educación";
        this.direccion = "Avenida Arce N° 2147";
        this.presupuesto = 3500000;
        this.nrofuncionarios = 4;
        this.funcionarios[0] = "Roberto Martinez";
        this.funcionarios[1] = "Jimena Juarez";
        this.funcionarios[2] = "Lorena Lara";
        this.funcionarios[3] = "Ninoska Jimenez";
    }

    public Ministerio(String nombre, String direccion, int presupuesto, int nrofuncionarios) {
        super(nombre, direccion, presupuesto, nrofuncionarios);
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
    }
}
