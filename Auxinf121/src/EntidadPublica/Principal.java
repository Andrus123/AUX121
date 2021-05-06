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
public class Principal {
    public static void main(String[] args){
        EntidadPublica e1 = new EntidadPublica();
        Contraloria c1 = new Contraloria();
        Defensoria d1 = new Defensoria();
        Ministerio m1 = new Ministerio();
        //a) Completar los respectivos atributos y métodos
        c1.mostrar();
        d1.mostrar();
        m1.mostrar();
        //b) Mostrar los nombres de funcionarios que trabajan tanto en el Ministerio
        // y Contraloria
        e1.MismoPersonal(m1, c1);
        //c) Cambiar de direccion de la defensoría del pueblo
        d1.CambiarDireccion();
        //d) Comparar presupuestos de las entidades publicas
        EntidadPublica[] ent = new EntidadPublica[3];
        e1.CompararPresupuestos(ent, c1, d1, m1);
    }
}

