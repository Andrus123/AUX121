package Vuelo;

import java.io.Serializable;

public class Vuelo implements Serializable{
	private String codigo;
	private String fecha;
	private String hora;
	private String origen;
	private String destino;
	
	public Vuelo() {
		this.codigo = "";
		this.fecha = "";
		this.hora = "";
		this.origen = "";
		this.destino = "";
	}

	public Vuelo(String codigo, String fecha, String hora, String origen, String destino) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.hora = hora;
		this.origen = origen;
		this.destino = destino;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
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
	
	
	
	
}
