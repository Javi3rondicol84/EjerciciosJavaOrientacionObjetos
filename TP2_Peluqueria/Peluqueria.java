package TP2_Peluqueria;

public class Peluqueria {
	
	private Peluquero peluquero[];
	
	public Peluqueria() {
		this.peluquero = new Peluquero[4];
		this.inicializarPeluquero();
	}
	
	public void inicializarPeluquero() {
		
		for(int i = 0; i < peluquero.length; i++) {
			peluquero[i] = new Peluquero();
		}
		
	}	
	
}
