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
public class Contraloria extends EntidadPublica {
    
    public Contraloria(){
        super();
        this.nombre = "Contraloria General del Estado";
        this.direccion = "Calle Colon esquina Indaburo";
        this.presupuesto = 2500000;
        this.nrofuncionarios = 3;
        this.funcionarios[0] = "Maria Mendez";
        this.funcionarios[1] = "Laura Lloza";
        this.funcionarios[2] = "Ninoska Jimenez";
    }

    public Contraloria(String nombre, String direccion, int presupuesto, int nrofuncionarios) {
        super(nombre, direccion, presupuesto, nrofuncionarios);
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
    }
}
