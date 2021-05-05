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
public class Defensoria extends EntidadPublica {
    
    public Defensoria(){
        super();
        this.nombre = "Defensoría del Pueblo";
        this.direccion = "Calle Colombia N°440";
        this.presupuesto = 150000;
        this.nrofuncionarios = 2;
        this.funcionarios[0] = "Juan Marquez";
        this.funcionarios[1] = "Pedro Torrez";
    }

    public Defensoria(String nombre, String direccion, int presupuesto, int nrofuncionarios) {
        super(nombre, direccion, presupuesto, nrofuncionarios);
    }
    @Override
    public void mostrar(){
        super.mostrar();
    }
}
