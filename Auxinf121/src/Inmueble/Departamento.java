/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Andrés Aquin
 */
public class Departamento extends Inmueble{
    private String codDep;
    private int nrodepartamentos;
    private String nomencargado;
    
    public Departamento(){
        super();
        this.codDep = "Apartment#1235FGIGI";
        this.nrodepartamentos = 2;
        this.nomencargado = "Juan Marquez";
    }

    public Departamento(String codDep, int nrodepartamentos, String nomencargado, Double costo, Double tamaño) {
        super(costo, tamaño);
        this.codDep = codDep;
        this.nrodepartamentos = nrodepartamentos;
        this.nomencargado = nomencargado;
    }

    public String getCodDep() {
        return codDep;
    }

    public void setCodDep(String codDep) {
        this.codDep = codDep;
    }

    public int getNrodepartamentos() {
        return nrodepartamentos;
    }

    public void setNrodepartamentos(int nrodepartamentos) {
        this.nrodepartamentos = nrodepartamentos;
    }

    public String getNomencargado() {
        return nomencargado;
    }

    public void setNomencargado(String nomencargado) {
        this.nomencargado = nomencargado;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Codigo del Departamento: "+getCodDep());
        System.out.println("N° de departamentos: "+getNrodepartamentos());
        System.out.println("Encargado: "+getNomencargado());
    }
}
