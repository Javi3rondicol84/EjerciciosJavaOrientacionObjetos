package TP9_SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carpeta extends ElementoSA {
	protected ArrayList<ElementoSA> elementos;

	public Carpeta(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		super(nombre, fechaCreacion, fechaModificacion);
		this.elementos = new ArrayList<ElementoSA>();
	
	}
	
	public void addElemento(ElementoSA elem) {
		this.elementos.add(elem);
	}

	@Override
	public double getTamanio() {
		double suma = 0.0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getTamanio();
		}
		
		return suma;
	}

	@Override
	public int getCantElementos() {
		int contador = this.elementos.size();
		
		for(int i = 0; i < this.elementos.size(); i++) {
			contador += this.elementos.get(i).getCantElementos();
		}
		
		return contador;
	}

	@Override
	public ArrayList<ElementoSA> buscar(Filtro ft, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> lista = new ArrayList<ElementoSA>();
		ArrayList<ElementoSA> resultadoParcial;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			
			resultadoParcial = this.elementos.get(i).buscar(ft, comp);
			
			lista.addAll(resultadoParcial);
		}
		
		
		if(comp != null) {
			Collections.sort(lista, comp);
		}
		
		return lista;
	}
	
	protected void setElementos(ArrayList<ElementoSA> elementos) {
		this.elementos = elementos;
	}

	@Override
	public Carpeta copia() {
		Carpeta copia = this.crearCopiaBasica();
		
		ArrayList<ElementoSA> elementosCopia = new ArrayList<ElementoSA>(this.elementos);
		
		copia.setElementos(elementosCopia);
		
		return copia;
	}

	public Carpeta crearCopiaBasica() {
		Carpeta copia = new Carpeta(this.getNombre(), this.getFechaCreacion(), this.getFechaModificacion());
		return copia;
	}
	
	public void verLista() {
		for(int i = 0; i < this.elementos.size(); i++) {
			System.out.println(this.elementos.get(i));
		}
	}
		
	

}
