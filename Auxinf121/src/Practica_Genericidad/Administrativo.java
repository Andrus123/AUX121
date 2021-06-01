package Practica_Genericidad;

public class Administrativo {
	private String nombre;
	private String credencial;
        
        public Administrativo(String nombre, String credencial) {
            this.nombre = nombre;
            this.credencial = credencial;
        }
	
	public Administrativo() {
		this.nombre = "";
		this.credencial = "Administrativo";
	}
	public void leer() {
		System.out.println("Nombre Administrativo: ");
		setNombre(Leer.dato());
		System.out.println("Credencial: ");
		setCredencial(Leer.dato());
	}
	public void mostrar() {
		System.out.println("Administrativo: "+getNombre());
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
