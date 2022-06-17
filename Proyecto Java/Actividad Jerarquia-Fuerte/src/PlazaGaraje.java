
public class PlazaGaraje {
	private int numeroPlaza;
	private boolean Disponibilidad;
	private Coche miCoche;
	
	public PlazaGaraje(int numeroPlaza, boolean disponibilidad) {
		super();
		this.numeroPlaza = numeroPlaza;
		this.Disponibilidad = disponibilidad;
		this.miCoche= new Coche("5568FJK", "Ford", "Fiesta");
	}
	
	public String estado() {
		return "Numero de la Plaza : " + numeroPlaza +  " Disponibilidad: " + Disponibilidad+" Coche :"+miCoche.estado();
	}
	
	
	
	
}
