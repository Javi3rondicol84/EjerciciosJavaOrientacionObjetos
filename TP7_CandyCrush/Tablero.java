package TP7_CandyCrush;

import java.util.ArrayList;

public class Tablero {
	private int puntaje_minimo;
	private ArrayList<Ficha> fichas;	
	private int dificultad;
	
	
	public Tablero() {
		this.fichas = new ArrayList<Ficha>();
	}
	
	
	public int getDificultad() {
		
		int sumaFort = 0;
		int sumaPoder = 0;
		
		for(int i = 0; i < this.fichas.size(); i++) {
			
			sumaFort += this.fichas.get(i).getFortaleza();
			sumaPoder += this.fichas.get(i).getDestruccion();
			
		}
		
		this.dificultad = sumaFort/sumaPoder;
		
		return this.dificultad;
	}
	
	public void buscarFichas(Filtro ft) {
		
		System.out.println("Fichas: ");
		for(int i = 0; i < this.fichas.size(); i++) {
			if(ft.cumple(this.fichas.get(i))) {
				System.out.println(this.fichas.get(i));
			}
		}
		
	}
	
	public static void main(String [] args) {
		Tablero tr = new Tablero();
		Ficha fc = new Ficha("Chocolate", 3, 3, 4);
		tr.aniadirFicha(fc);
		FFOcupaXLugares ft = new FFOcupaXLugares(2);
		
		tr.buscarFichas(ft);
		
	}
	
	public void aniadirFicha(Ficha fc) {
		if(!this.fichas.contains(fc)) {
			this.fichas.add(fc);
		}
	}

	public int getPuntaje_minimo() {
		return puntaje_minimo;
	}

	public void setPuntaje_minimo(int puntaje_minimo) {
		this.puntaje_minimo = puntaje_minimo;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	
	
}
