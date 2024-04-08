package TP9_Futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Club {
	private ArrayList<Socio> socios;
	
	public Club() {
		this.socios = new ArrayList<Socio>();
	}
	
	public void addSocio(Socio sc) {
		if(!this.socios.contains(sc)) {
			this.socios.add(sc);
		}
	}
	
	//buscar (criterio, orden)
	
	
	public ArrayList<Socio> buscar(Filtro f1, Comparator<Socio> orden) {
		ArrayList<Socio> lista = new ArrayList<Socio>();
		
		
		for(int i = 0; i < this.socios.size(); i++) {
			if(f1.cumple(this.socios.get(i))) {
				lista.add(this.socios.get(i));
			}
		}
		
		
		if(orden != null) {
	
				Collections.sort(lista, orden);
		}
		else {
			Collections.sort(lista);
		}
		
		
		return lista;
	}
	
	
}	
