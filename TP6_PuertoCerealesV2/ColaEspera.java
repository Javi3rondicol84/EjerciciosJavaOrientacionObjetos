package TP6_PuertoCerealesV2;

import java.util.ArrayList;

public class ColaEspera {
	private ArrayList<Elemento> elementos;
	
	public ColaEspera() {
		this.elementos = new ArrayList<Elemento>();
	}
	
	public void addElemento(Elemento el) {
		int i = 0;
		int n = this.elementos.size();
		
		while(i < n && !el.esMayor(this.elementos.get(i))) {
			i++;
		}
		
		if(i < n) {
			this.elementos.add(i, el);
		}
		else {
			this.elementos.add(el);
		}
		
	}
	
	public Elemento getSiguiente() {
		if(hayDisponibles()) {
			return this.elementos.remove(0);
		}
		else {
			return null;
		}
	}
	
	public boolean hayDisponibles() {
		return !this.elementos.isEmpty();
	}
	
}
