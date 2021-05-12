/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minibus;

/**
 *
 * @author Andrés Aquin
 */
public class Sindicato {
    public String nombre;
    public int nminis;
    public Minibus[] mb = new Minibus[50];
    
    public Sindicato(){
        this.nombre = "20 de Julio";
        this.nminis = 15;
        for (int i = 0; i < this.nminis; i++) {
            mb[i] = new Minibus();
        }
    }

    public Sindicato(String nombre, int nminis) {
        this.nombre = nombre;
        this.nminis = nminis;
        for (int i = 0; i < this.nminis; i++) {
            mb[i] = new Minibus();
        }
    }
    public void leer(){
        System.out.println("Nombre del sindicato: ");
        setNombre(Leer.dato());
        System.out.println("Cantidad de minibuses: ");
        setNminis(Leer.datoInt());
        System.out.println("Minibuses: ");
        for (int i = 0; i < getNminis(); i++) {
            mb[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Sindicato: "+getNombre());
        System.out.println("N° de minibuses: "+getNminis());
        System.out.println("Minibuses");
        for (int i = 0; i < getNminis(); i++) {
            mb[i].mostrar();
        }
    }
    public void Restriccion(){
        int contador = 0;
        for (int i = 0; i < getNminis(); i++) {
            char ult = mb[i].placa.charAt(mb[i].placa.length()-1);
                if(ult == '1' || ult == '2'){
                    contador++;
                }
        }
        System.out.println("Minibuses Restringidos: "+contador);
    }
    @SuppressWarnings("unused")
	public void Verificar(String x){
        for (int i = 0; i < getNminis(); i++) {
            if(x==mb[i].chofer){
                System.out.println("Si existe el minibus con el chofer: "+x);
                break;
            }else{
                System.out.println(x+" no se encuentra registrado");
                break;
            }
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNminis() {
        return nminis;
    }

    public void setNminis(int nminis) {
        this.nminis = nminis;
    }

    public Minibus[] getMb() {
        return mb;
    }

    public void setMb(Minibus[] mb) {
        this.mb = mb;
    }
    
}
