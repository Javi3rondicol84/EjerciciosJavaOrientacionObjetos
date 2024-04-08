package TP9_Padron_Electoral;

import java.util.ArrayList;
import java.util.Comparator;

public class Mesa extends ElementoSE {
	private ArrayList<Votante> padron;
	private ArrayList<Voto> votos;
	
	public Mesa(String nombre) {
		super(nombre);
		this.padron = new ArrayList<Votante>();
		this.votos = new ArrayList<Voto>();
	}
	
	public void addVotantePadron(Votante votante) {
		if(!this.padron.contains(votante)) {
			this.padron.add(votante);
		}
	}
	
	public void votar(Votante votante) {
		if(!this.padron.contains(votante)) {
			this.votos.add(votante.getVoto());
		}
		else {
			System.out.println("El votante "+this.getNombre()+" no está en el padron, no puede votar.");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		Mesa mesa = (Mesa) obj;
		
		try {
			return this.getNombre().equals(mesa.getNombre());
		}
		catch(Exception exc) {
			return false;
		}
	}

	@Override
	public int getVotosCumplen(Filtro filtro) {
		int suma = 0;
		
		for(int i = 0; i < this.votos.size(); i++) {
			if(filtro.cumple(this.votos.get(i))) {
				suma++;
			}
		}
		
		return suma;
	}

	@Override
	public int getCantidadTotalVotos() {
		return votos.size();
	}

	@Override
	public ArrayList<Candidato> getListaCandidatos(Comparator<Candidato> comp) {
		ArrayList<Candidato> lista = new ArrayList<Candidato>();
		
		for(int i = 0; i < this.votos.size(); i++) {
			lista.add(this.votos.get(i).getCandidato());
		}
		
		return lista;
	}	
	
}
