package Practica_Genericidad;

public class PersonalMedico {
	private String nombre;
	private String credencial;
	
        public PersonalMedico(String nombre, String credencial) {
            this.nombre = nombre;
            this.credencial = credencial;
        }
        
	public PersonalMedico() {
		this.nombre = "";
		this.credencial = "Personal-Medico";
	}
	public void leer() {
		System.out.println("Nombre Personal Medico: ");
		setNombre(Leer.dato());
		System.out.println("Credencial: ");
		setCredencial(Leer.dato());
	}
	public void mostrar() {
		System.out.println("Personal Medico: "+getNombre());
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
