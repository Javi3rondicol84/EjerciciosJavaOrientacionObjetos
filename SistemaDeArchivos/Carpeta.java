package SistemaDeArchivos;

import java.util.ArrayList;

public class Carpeta extends Elemento {
	private ArrayList<Elemento> elementos;
	
	public Carpeta(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<Elemento>();
	}
	
	@Override
	public Double getTamanio() {
		Double suma = 0.0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getTamanio();
		}
		
		return suma;
	}
	
	@Override
	public int getCantElementos() {
		int suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getCantElementos();
		}
		
		return suma;
	}
	
}
