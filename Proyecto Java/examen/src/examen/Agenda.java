package examen;

public class Agenda {
	//atributos
	private int contadorContactos;
	Contacto arrayObjetos[]=new Contacto[1024];
	
	//metodos
	public void añadirContacto(String nombre,String direccion,int telefono) {
		arrayObjetos[this.contadorContactos]=new Contacto(nombre,direccion,telefono);
		System.out.println("El contacto "+arrayObjetos[this.contadorContactos].getNombre()+" se ha añadido correctamente");
		this.contadorContactos=this.contadorContactos+1;
	}

	public void borrarContacto(String nombre) {
		for (int i = 0; i < this.contadorContactos; i++) {
			if (nombre.equals(arrayObjetos[i].getNombre())) {
				for (int o = i; o < arrayObjetos.length-1; o++) {
					arrayObjetos[o]=arrayObjetos[o+1];
				}
				this.contadorContactos=this.contadorContactos-1;
				System.out.println("El contacto "+nombre+" se ha borrado correctamente.");
			}else {
				System.out.println("No existe ningun contacto con el nombre "+nombre);
			}
		}
	}

	public void consultarContacto(String nombre) {
		for (int i = 0; i < this.contadorContactos; i++) {
			if (nombre.equals(arrayObjetos[i].getNombre())) {
				System.out.println(arrayObjetos[i].toString());
			}
		}
	}

	public int getContadorContactos() {
		return contadorContactos;
	}

	public void setContadorContactos(int contadorContactos) {
		this.contadorContactos = contadorContactos;
	}

	public void listaContactos() {
		for (int i = 0; i < this.contadorContactos; i++) {
			System.out.println(i+": "+arrayObjetos[i].toString());
		}
	}
	
}
