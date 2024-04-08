package TP9_Padron_Electoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ciudad extends ElementoSE {
	private ArrayList<ElementoSE> elementos; //puede incluir mesas directamente, o escuelas pero tambien ciudades, eso es lo raro
	//DUDA: puede incluir ciudades, es raro.
	
	public Ciudad(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<ElementoSE>();
	}
	
	public void addElemento(ElementoSE elemento) {
		if(!this.elementos.contains(elemento)) {
			this.elementos.add(elemento);
		}
	}

	@Override
	public int getVotosCumplen(Filtro filtro) {
		
		int suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			
			suma += this.elementos.get(i).getVotosCumplen(filtro);
		}
		
		return suma;
	}

	@Override
	public int getCantidadTotalVotos() {
		int suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getCantidadTotalVotos();
		}
		
		return suma;
	}

	@Override
	public ArrayList<Candidato> getListaCandidatos(Comparator<Candidato> comp) {
		ArrayList<Candidato> lista = new ArrayList<Candidato>();
		
		for(int i = 0; i < this.elementos.size(); i++) {
			lista.addAll(this.elementos.get(i).getListaCandidatos(comp));
		}
		
		if(comp != null) {
			Collections.sort(lista, comp);
		}
		
		return lista;
	}
}
