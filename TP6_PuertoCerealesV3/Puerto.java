package TP6_PuertoCerealesV3;

import java.time.LocalDate;

import TP6_CentroComputoV2.ColaEspera;

public class Puerto {
	private ColaEspera camiones;
	private ColaEspera barcos;
	
	public Puerto() {
		this.camiones = new ColaEspera();
		this.barcos = new ColaEspera();
	}
	
	public static void main(String [] args) {
		Puerto pr = new Puerto();
		LocalDate fecha = LocalDate.now();
		Camion cn = new Camion("Camion 1", fecha);
		Camion cn2 = new Camion("Camion 2", fecha);
		Barco b = new Barco("Barco 1", 200);
		Barco b2 = new Barco("Barco 2", 205);
		//pr.addCamion(cn);
		pr.addBarco(b);
		pr.addCamion(cn2);
		pr.addBarco(b2);
	
		
		System.out.println(pr.camiones.hayElementos());
		System.out.println(pr.barcos.hayElementos());
		
		
	}
	
	public void addCamion(Camion cn) {
		
		if(cn == null) { //control previo para que no se pase un camion null
			return;
		}

		if(barcos.hayElementos()) {
			Barco b = this.getSiguienteBarco();
			b.cargar(cn);
		}
		else {
			camiones.addElemento(cn);
			System.out.println("Camion aniadido");
		}
				
	}
	
	public void addBarco(Barco b) {
		
		if(b == null) {
			return;
		}
		
			if(camiones.hayElementos()) {
				Camion cm = this.getSiguienteCamion();
				cm.descargar(b);
			}
			else {
				this.barcos.addElemento(b);
				System.out.println("Barco aniadido");
			}
		
	}
	
	public Camion getSiguienteCamion() {
		return (Camion) this.camiones.getSiguiente();
	}
	
	public Barco getSiguienteBarco() {
		return (Barco) this.barcos.getSiguiente();
	}
	
}
