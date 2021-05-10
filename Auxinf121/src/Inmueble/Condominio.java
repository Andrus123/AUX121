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
public class Condominio extends Inmueble{
    private String nombre;
    private int ncasas;
    private Casa[] codCasas = new Casa[7];
    private int nedif;
    private Edificio[] codEdificios = new Edificio[20];
    
    public Condominio(){
        super();
        this.nombre = "Casablanca";
        this.ncasas = 3;
        for (int i = 0; i < this.ncasas; i++) {
            codCasas[i] = new Casa();
        }
        this.nedif = 2;
        for(int i = 0; i < this.nedif; i++){
            codEdificios[i] = new Edificio();
        }
    }

    public Condominio(String nombre, Casa[] codCasas, Edificio[] codEdificios, double costo, double tamaño) {
        super(costo, tamaño);
        this.nombre = nombre;
        this.codCasas = codCasas;
        this.codEdificios = codEdificios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNcasas() {
        return ncasas;
    }

    public void setNcasas(int ncasas) {
        this.ncasas = ncasas;
    }
   
    public Casa[] getCodCasas() {
        return codCasas;
    }

    public void setCodCasas(Casa[] codCasas) {
        this.codCasas = codCasas;
    }

    public int getNedif() {
        return nedif;
    }

    public void setNedif(int nedif) {
        this.nedif = nedif;
    }
    
    public Edificio[] getCodEdificios() {
        return codEdificios;
    }

    public void setCodEdificios(Edificio[] codEdificios) {
        this.codEdificios = codEdificios;
    }
    @Override
    public void leer(){
        System.out.println("Condominio: ");
        setNombre(Leer.dato());
        System.out.println("Cantidad de casas: ");
        setNcasas(Leer.datoInt());
        System.out.println("Casas: ");
        for (int i = 0; i < ncasas; i++) {
            codCasas[i].leer();
        }
        System.out.println("Cantidad de Edificios: ");
        setNedif(Leer.datoInt());
        for (int i = 0; i < getNedif(); i++) {
            codEdificios[i].leer();
        }
        super.leer();
    }

    @Override
    public void mostrar(){
        System.out.println("\nCondominio: "+getNombre());
        System.out.println("\nN° de casas: "+getNcasas());
        for (int i = 0; i < this.ncasas; i++) {
            codCasas[i].mostrar();
        }
        System.out.println("\nN° de edificios: "+getNedif());
        for (int i = 0; i < this.nedif; i++) {
            codEdificios[i].mostrar();
        }
        super.mostrar();
    }
    public void cuentadep(){
        System.out.println("Edificios con al menos 5 departamentos: ");
        for (int i = 0; i < getNedif(); i++) {
            if(codEdificios[i].getNrodepartamentos()>=5){
                System.out.println("Edificio: "+codEdificios[i].getCodEd()+
                    " con "+codEdificios[i].getNrodepartamentos()+" depts");
            }
        }
    }
}
