package TP9_Padron_Electoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SistemaElectoral {
	private ArrayList<Candidato> candidatos;

	public SistemaElectoral() {
		this.candidatos = new ArrayList<Candidato>();
	}
	
	public void registrarVoto(Votante votante, Mesa mesa) {
	
		mesa.votar(votante);
	}
	
	
	//servicios
	
	public double verPorcentajesVotos(ElementoSE elemento, Filtro filtro) {
		int cantVotosCumplen = 0;
		int cantVotosTotales = 0;
		
		cantVotosCumplen = elemento.getVotosCumplen(filtro);
		cantVotosTotales = elemento.getCantidadTotalVotos();
		
		return (cantVotosCumplen/cantVotosTotales) * 100;
	}
	
	public int getCantidadVotosTotales(ElementoSE elemento) {
		int cantidad = 0;
		
		cantidad += elemento.getCantidadTotalVotos();
		
		return cantidad;
	}
	
	public ArrayList<Candidato> getListaCandidatos(Comparator<Candidato> comp) {
		ArrayList<Candidato> lista = new ArrayList<Candidato>(this.candidatos);
		
		if(comp != null) {
			Collections.sort(lista, comp);
		}
		
		return lista;
	}
	
	
}
