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
	public void leer() {
		System.out.println("Nombre: ");
		setNombre(Leer.dato());
		System.out.println("Codigo Medico: ");
		setCodMedico(Leer.dato());
		System.out.println("N° de especialidad: ");
		setNroEspecialidad(Leer.datoInt());
		for (int i = 0; i < getNroEspecialidad(); i++) {
			especialidad[i] = Leer.dato();
		}
	}
	public void mostrar() {
		System.out.println();
		
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