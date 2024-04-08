package TP9_Padron_Electoral;

import java.util.ArrayList;
import java.util.Comparator;

public class Escuela extends ElementoSE {
	private ArrayList<Mesa> mesas;
	
	public Escuela(String nombre) {
		super(nombre);
		this.mesas = new ArrayList<Mesa>();
	}
	
	public void addMesa(Mesa mesa) {
		if(!this.mesas.contains(mesa)) {
			this.mesas.add(mesa);
		}
	}

	@Override
	public int getVotosCumplen(Filtro filtro) {
		
		int suma = 0;
		
		for(int i = 0; i < this.mesas.size(); i++) {
			suma += this.mesas.get(i).getVotosCumplen(filtro);
		}
		
		return suma;
	}

	@Override
	public int getCantidadTotalVotos() {
		int suma = 0;
		
		for(int i = 0; i < this.mesas.size(); i++) {
			suma += this.mesas.get(i).getCantidadTotalVotos();
		}
		
		return suma;
	}

	@Override
	public ArrayList<Candidato> getListaCandidatos(Comparator<Candidato> comp) {
		ArrayList<Candidato> lista = new ArrayList<Candidato>();
		
		for(int i = 0; i < this.mesas.size(); i++) {
			lista.addAll(this.mesas.get(i).getListaCandidatos(comp));
		}
		
		return lista;
	}

}
