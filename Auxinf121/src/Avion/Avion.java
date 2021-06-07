package Avion;

import java.io.Serializable;

public class Avion implements Serializable{
	private String matricula;
	private String origen;
	private String destino;
	private Piloto pil;
	private String horaSalida;
	private int nroPasajeros;
	private Pasajero[] P = new Pasajero[50];
	
	public Avion() {
		this.matricula = "REX123";
		this.origen = "Bolivia";
		this.destino = "Nueva Zelanda";
		this.pil = new Piloto();
		this.horaSalida =  "12:00PM";
		this.nroPasajeros = 2;
		for (int i = 0; i < nroPasajeros; i++) {
			P[i] = new Pasajero();
		}
	}
	
	public void adiPasajero() {
		P[getNroPasajeros()] = new Pasajero();
		P[getNroPasajeros()].leer();
		this.nroPasajeros++;
	}
	
	public void leer() {
		System.out.println("Matricula: ");
		setMatricula(Leer.dato());
		System.out.println("Origen: ");
		setOrigen(Leer.dato());
		System.out.println("Destino: ");
		setDestino(Leer.dato());
		System.out.println("Piloto: ");
		pil.leer();
		System.out.println("N° de pasajeros: ");
		setNroPasajeros(Leer.datoInt());
		for (int i = 0; i < getNroPasajeros(); i++) {
			P[i].leer();
		}
	}
	
	public void mostrar() {
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Origen: "+getOrigen());
		System.out.println("Destino: "+getDestino());
		pil.mostrar();
		System.out.println("N° de pasajeros: "+getNroPasajeros());
		for (int i = 0; i < getNroPasajeros(); i++) {
			P[i].mostrar();
		}
	}
	
	public void buscar(int X) {
		for (int i = 0; i < getNroPasajeros(); i++) {
			if(P[i].getCi()==X) {
				System.out.println("Pasajero encontrado: ");
				System.out.println("Matricula: "+getMatricula());
				System.out.println("Destino: "+getDestino());
				System.out.println("Hora Salida: "+getHoraSalida());
			}
		}
	}
	
	public void mostrarpasajeros() {
		System.out.println("Pasajeros: ");
		for (int i = 0; i < getNroPasajeros(); i++) {
			P[i].mostrar();
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Piloto getPil() {
		return pil;
	}

	public void setPil(Piloto pil) {
		this.pil = pil;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getNroPasajeros() {
		return nroPasajeros;
	}

	public void setNroPasajeros(int nroPasajeros) {
		this.nroPasajeros = nroPasajeros;
	}

	public Pasajero[] getP() {
		return P;
	}

	public void setP(Pasajero[] p) {
		P = p;
	}
	
	
}
