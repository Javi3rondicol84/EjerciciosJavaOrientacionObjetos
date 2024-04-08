package TP3_Contacto;

import java.time.LocalDate;

public class Celular {
	private Contacto [] contacto;
	
	public Celular() {
		this.contacto = new Contacto[9];
		this.inicializarContacto();
	}
	
	public void inicializarContacto() {
		LocalDate otro = LocalDate.of(2007, 8, 25);
		
		for(int i = 0; i < contacto.length; i++) {
			if(contacto[i] == null) {
				contacto[i] = new Contacto();
			}
		}
		
		contacto[2].setFecn(otro);
		
		contacto[0].setNombre("Pedro");
		contacto[1].setNombre("Sanchez");
		contacto[2].setNombre("Sanchez");
		contacto[3].setNombre("Sanchez");
		contacto[4].setNombre("Pedro");
		contacto[5].setNombre("Pedro");
		contacto[6].setNombre("Pepe");
		contacto[7].setNombre("Pedro");
	}
	
	public void verContactos() {
		for(int i = 0; i < contacto.length; i++) {
			System.out.println("Nombre: "+ contacto[i].getNombre() + ", Apellido: "+ contacto[i].getApellido());
		}
	}
	
	public void verListaContactos() {
		for(int i = 0; i < contacto.length; i++) {
			System.out.println("Nombre: "+ contacto[i].getNombre() + ", Apellido: "+ contacto[i].getApellido());
		}
	}
	
	public void verContactosRepetidos() { //mismo nombre, apellido y num telefono (reescribir equals)
		int indice = 0;
		int indice2 = 0;
		int aux = 0;
		int ind = 0;
		while(indice < contacto.length) {

			while(indice2 < contacto.length) {
				if(contacto[indice2].getNombre().equals(contacto[indice].getNombre())) {
					
					aux++;
					
				}
					
				indice2++; //se vuelve 3 luego de aux==2
			}
			
			if((aux >= 2) && (!contacto[indice].getNombre().equals(contacto[ind].getNombre()))) {
				System.out.println("Nombre: "+ contacto[indice].getNombre() + ", Apellido: "+ contacto[indice].getApellido());
				ind = indice;
			}
			
			aux = 0;
			indice2 = 0;
			indice++;
		}
	}
	
	public void verPromedioEdadContactos() {
		double promedio = 0;
		int tamanio = 0;
		for(int i = 0; i < contacto.length; i++) {
			promedio += contacto[i].getEdad();
			tamanio++;
		}
		System.out.println(promedio);
		promedio /= tamanio;
		
		System.out.println(tamanio);
		System.out.println(promedio);
	}
	
	public void verListaContactosMismoTelefono() {
		
	}
	
	public static void main(String [] args) {
		Celular celular = new Celular();
		
		celular.verContactosRepetidos();
	}
	
	

}
