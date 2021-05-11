/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evento;

/**
 *
 * @author Andrés Aquin
 */
public class EventoMusical {
    public String nombreevento;
    public int nrogruposmus;
    public GrupoMusical[] gm = new GrupoMusical[40];
    
    public EventoMusical(){
        this.nombreevento = "Lolapalooza";
        this.nrogruposmus = 3;
        for (int i = 0; i < nrogruposmus; i++) {
            gm[i] = new GrupoMusical();
        }
    }

    public EventoMusical(String nombreevento, int nrogruposmus) {
        this.nombreevento = nombreevento;
        this.nrogruposmus = nrogruposmus;
        for (int i = 0; i < nrogruposmus; i++) {
            gm[i] = new GrupoMusical();
        }
    }
    
    public void leer(){
        System.out.println("Nombre del evento: ");
        setNombreevento(Leer.dato());
        System.out.println("Numero de grupos: ");
        setNrogruposmus(Leer.datoInt());
        System.out.println("Grupos: ");
        for (int i = 0; i < getNrogruposmus(); i++) {
            gm[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Evento: "+getNombreevento());
        System.out.println("# de Grupos: "+getNrogruposmus());
        System.out.println("Grupos: ");
        for (int i = 0; i < getNrogruposmus(); i++) {
            gm[i].mostrar();
        }
    }

    public String getNombreevento() {
        return nombreevento;
    }

    public void setNombreevento(String nombreevento) {
        this.nombreevento = nombreevento;
    }

    public int getNrogruposmus() {
        return nrogruposmus;
    }

    public void setNrogruposmus(int nrogruposmus) {
        this.nrogruposmus = nrogruposmus;
    }

    public GrupoMusical[] getGm() {
        return gm;
    }

    public void setGm(GrupoMusical[] gm) {
        this.gm = gm;
    }
    
}
