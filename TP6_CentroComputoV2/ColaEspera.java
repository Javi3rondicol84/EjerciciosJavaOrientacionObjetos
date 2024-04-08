package TP6_CentroComputoV2;

import java.util.ArrayList;

public class ColaEspera {
	ArrayList<Elemento> elementos;

	public ColaEspera() {
		this.elementos = new ArrayList<Elemento>();
	}
	
	public void addElemento(Elemento el) {
		int i = 0;

		while(i < this.elementos.size() && !el.esMayor(el)) {
			i++;
		}
		
		if(i < this.elementos.size()) {
			this.elementos.add(i, el);
		}
		else {
			this.elementos.add(el);
		}
		
	}
	
	public void verElementos() {
		for(int i = 0; i < this.elementos.size(); i++) {
			System.out.println(this.elementos.get(i));
		}
	}
	
	public boolean hayElementos() {
		return !this.elementos.isEmpty();
	}
	
	public Elemento getSiguiente() {
		if(this.hayElementos()) {
			return this.elementos.remove(0);
		}
		else {
			return null;
		}
	}
	
}
