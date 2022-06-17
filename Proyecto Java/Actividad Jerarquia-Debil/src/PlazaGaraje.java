
public class PlazaGaraje {
	private int numeroPlaza;
	private boolean Disponibilidad;
	private Coche miCoche;
	
	public PlazaGaraje(int numeroPlaza, boolean disponibilidad,Coche miCoche) {
		super();
		this.numeroPlaza = numeroPlaza;
		this.Disponibilidad = disponibilidad;
		this.miCoche = miCoche; 
	}
	
	public String estado() {
		return "Numero de la Plaza : " + numeroPlaza +  " Disponibilidad: " + Disponibilidad+" Coche :"+miCoche.estado();
	}
	
	
	
	
}
