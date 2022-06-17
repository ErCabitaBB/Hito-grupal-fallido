package examen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int input;
		int nada = 0;
		String nombre;
		String direccion;
		int telefono;
		String respuesta="si";
		agenda.setContadorContactos(nada);
		do {
			System.out.println("	AGENDA TELEFÓNICA");
			System.out.println("---------------------------------");
			System.out.println("1. Añadir nuevo contacto.");
			System.out.println("2. Borrar contacto.");
			System.out.println("3. Consultar contacto.");
			System.out.println("4. Listado de contactos.");
			System.out.println("5. Terminar programa.");
			System.out.println("---------------------------------");
			System.out.println("¿Qué opción eliges?");
			input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.println("Introduce el nombre del contacto");
				nada = scan.nextInt();
				nombre = scan.nextLine();
				System.out.println("Introduce la direccion del contacto");
				direccion = scan.nextLine();
				System.out.println("Introduce el telefono del contacto");
				telefono = scan.nextInt();
				agenda.añadirContacto(nombre,direccion,telefono);
				break;
			case 2:
				System.out.println("Introduce el nombre del contacto que desea borrar");
				nada = scan.nextInt();
				nombre = scan.nextLine();
				agenda.borrarContacto(nombre);
				break;
			case 3:
				System.out.println("Introduce el nombre del contacto que desea consultar");
				nada = scan.nextInt();
				nombre = scan.nextLine();
				agenda.consultarContacto(nombre);
				break;
			case 4:
				agenda.listaContactos();
				break;
			case 5:
				respuesta="no";
				System.out.println("Numero de contactos: "+agenda.getContadorContactos());
				System.out.println("Profe siento haberle dado un puto de vista tan diferente al de mis compañeros "
						+ "en este ejercicio, pero lo importante es que todo funciona y en eso he acertado, aunque "
						+ "podria haberlo hecho un poco mas facil con el arraylist por lo menos demostre que me se "
						+ "buscar una solucion <3");
				break;
			default:
				System.out.println("Por favor, introduzca una opción válida");
				break;
			}
		} while (respuesta=="si");
	scan.close();
		
	}

}
