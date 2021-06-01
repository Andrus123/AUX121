package Practica_Genericidad;

public class Enfermera {
	private String nombre;
	private String credencial;

        public Enfermera(String nombre, String credencial) {
            this.nombre = nombre;
            this.credencial = credencial;
        }	
	public Enfermera() {
		this.nombre = "";
		this.credencial = "Enfermera";
	}
	public void leer() {
		System.out.println("Nombre Enfermera: ");
		setNombre(Leer.dato());
		System.out.println("Credencial: ");
		setCredencial(Leer.dato());
	}
	public void mostrar() {
		System.out.println("Enfermera: "+getNombre());
		System.out.println("Credencial: "+getCredencial());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
	
}
