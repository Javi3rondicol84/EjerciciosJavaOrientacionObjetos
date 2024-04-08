package TP6_CentroComputos;

import java.util.ArrayList;

public class ColaPcs {
	private ArrayList<Computadora> pcsDisponibles;
	private ComparadorPc comparador;
	
	public ColaPcs() {
		this.comparador = new ComparadorPcMemoria(); 
		this.pcsDisponibles = new ArrayList<Computadora>();
		this.aniadirPcDefault();
	}
	
	public void aniadirPcDefault() {
		Computadora pc = new Computadora("PC1", 2500, 2000);
		this.pcsDisponibles.add(pc);
	}
	
	public void setComparador(ComparadorPc cp) { //añadir el tipo de comparador que se usara para los procesos
		this.comparador = cp;
	}
	
	public ArrayList<Computadora> obtenerComputadoras() {
		ArrayList<Computadora> copia = new ArrayList<Computadora>(this.pcsDisponibles);
		
		return copia;
	}
	
	public int obtenerCantidadPcs() {
		return this.pcsDisponibles.size();
	}
	
	public void ejecutarProceso(Proceso ps) {
		this.pcsDisponibles.get(0).ejecutarProceso(ps); //la pc mas rapida ejecuta el proceso
	}
	
	public void guardarComputadora(Computadora pc) {
		
		int i = 0;
		
		while((i < this.pcsDisponibles.size()) && (this.comparador.esMayor(this.pcsDisponibles.get(i), pc))) {
			i++;
		}
		
		if(i < this.pcsDisponibles.size()) {
			this.pcsDisponibles.add(i, pc);
		}
		else {
			this.pcsDisponibles.add(pc);
		}
		
		
	}
	
	public void verPcs() {
		for(int i = 0; i < this.pcsDisponibles.size(); i++) {
			System.out.println(this.pcsDisponibles.get(i));
		}
	}
	
	
	
	
}
