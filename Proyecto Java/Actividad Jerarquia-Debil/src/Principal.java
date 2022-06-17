
public class Principal {

	public static void main(String[] args) {
		Coche miCoche = new Coche("5568FJK", "Ford", "Fiesta");
		PlazaGaraje miPlaza = new PlazaGaraje(1,true,miCoche);
		
		
		
		System.out.println(miPlaza.estado());
		
	}

}
