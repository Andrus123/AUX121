package Medico;

public class Medico {
	private String nombre;
	private String codMedico;
	private int nroEspecialidad;
	private String especialidad[];
	public Medico(String nombre, String codMedico, int nroEspecialidad, String[] especialidad) {
		super();
		this.nombre = nombre;
		this.codMedico = codMedico;
		this.nroEspecialidad = nroEspecialidad;
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodMedico() {
		return codMedico;
	}
	public void setCodMedico(String codMedico) {
		this.codMedico = codMedico;
	}
	public int getNroEspecialidad() {
		return nroEspecialidad;
	}
	public void setNroEspecialidad(int nroEspecialidad) {
		this.nroEspecialidad = nroEspecialidad;
	}
	public String[] getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String[] especialidad) {
		this.especialidad = especialidad;
	}
	
	
}