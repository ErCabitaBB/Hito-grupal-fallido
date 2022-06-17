package examen;

public class Contacto {
	//atributos
	private String nombre;
	private String domicilio;
	private int telefono;
	
	public Contacto(String nombre, String domicilio, int telefono) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	//metodos
	@Override
	public String toString() {
		return "Nombre :"+this.nombre+", domicilio :"+this.domicilio+", telefono :"+this.telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return this.nombre;
	}
}
