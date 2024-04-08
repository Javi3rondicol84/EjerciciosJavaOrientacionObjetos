package TP6_PuertoCereales;

import java.time.LocalDate;

public class Puerto {
	private ColaBarcos cb;
	private ColaCamiones cc;
	
	public Puerto() {
		this.cb = new ColaBarcos();
		this.cc = new ColaCamiones();
	}
	
	public void setColaCamionesNueva(ColaCamiones nueva) {
		
		for(int i = 0; i < this.cc.size(); i++) {
			nueva.addCamion(cc.get());
		}
		
		this.cc = nueva;
	}

	public void setColaBarcosNueva(ColaBarcos nueva) {
		
		for(int i = 0; i < this.cb.size(); i++) {
			nueva.addBarco(this.cb.get());
		}
		
		this.cb = nueva;
	}
	
	public void descargarCamion(Camion cm) {
		this.cc.addCamion(cm);
	}
	
	public void cargarBarco(Barco b) {
		this.cb.addBarco(b);
	}
	
	public void verCamiones() {
		this.cc.verCamiones();
	}
	
	public void verBarcos() {
		this.cb.verBarcos();
	}
	
	public static void main(String [] args) {
		Puerto pr = new Puerto();
		LocalDate actual = LocalDate.now();
		LocalDate antes = LocalDate.of(2023, 9, 23);
		
		Camion cm = new Camion("Camion1", actual);

		Camion cm2 = new Camion("Camion2", antes);
	
		Barco b1 = new Barco("Barco 1", 20);
		Barco b2 = new Barco("Barco 2", 500);
	
		
		pr.descargarCamion(cm);
		pr.descargarCamion(cm2);
		
		pr.cargarBarco(b1);
		pr.cargarBarco(b2);
		
		pr.verCamiones();
		System.out.println();
		pr.verBarcos();
		
		
	}

}
