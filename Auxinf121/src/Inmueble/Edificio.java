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
public class Edificio extends Inmueble{
    private String codEd;
    private int nrodepartamentos;
    private String Nombreencargado;
    
    public Edificio(){
        super();
        this.costo = 580000.50;
        this.tamanio = 1500.80;
        this.codEd = "TF1234";
        this.nrodepartamentos = 9;
        this.Nombreencargado = "Juan Perez";
    }

    public Edificio(String codEd, int nrodepartamentos, String Nombreencargado, double costo, double tamanio) {
        super(costo, tamanio);
        this.codEd = codEd;
        this.nrodepartamentos = nrodepartamentos;
        this.Nombreencargado = Nombreencargado;
    }

    public String getCodEd() {
        return codEd;
    }

    public void setCodEd(String codEd) {
        this.codEd = codEd;
    }

    public int getNrodepartamentos() {
        return nrodepartamentos;
    }

    public void setNrodepartamentos(int nrodepartamentos) {
        this.nrodepartamentos = nrodepartamentos;
    }

    public String getNombreencargado() {
        return Nombreencargado;
    }

    public void setNombreencargado(String Nombreencargado) {
        this.Nombreencargado = Nombreencargado;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Codigo Edificio: ");
        setCodEd(Leer.dato());
        System.out.println("N° de departamentos: ");
        setNrodepartamentos(Leer.datoInt());
        System.out.println("Nombre del Encargado: ");
        setNombreencargado(Leer.dato());
    }
    
    @Override
    public void mostrar(){
        System.out.println("Codigo Edificio: "+getCodEd());
        System.out.println("N° de departamentos: "+getNrodepartamentos());
        System.out.println("Encargado: "+getNombreencargado());
         super.mostrar();
    }
}
