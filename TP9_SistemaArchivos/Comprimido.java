package TP9_SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Comprimido extends Carpeta {
	private double tasa_compresion;
	
	public Comprimido(String nombre, double tasa_compresion, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		super(nombre, fechaCreacion, fechaModificacion);
		this.tasa_compresion = tasa_compresion;
	}
	
	
	
	public double getTasa_compresion() {
		return tasa_compresion;
	}



	public void setTasa_compresion(double tasa_compresion) {
		this.tasa_compresion = tasa_compresion;
	}



	@Override
	public double getTamanio() {
		return super.getTamanio() * this.getTasa_compresion();
	}

	@Override
	public ArrayList<ElementoSA> buscar(Filtro ft, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> lista = super.buscar(ft, comp);
		
		if(!lista.isEmpty()) {
			lista.add(this);
		}
		
		
		return lista;
	}
	
	@Override
	public Comprimido copia() {
		Comprimido copia = this.crearCopiaBasica();
		
		ArrayList<ElementoSA> elementosCopia = new ArrayList<ElementoSA>(this.elementos);
		
		copia.setElementos(elementosCopia);
		
		return copia;
	}
	
	@Override
	public Comprimido crearCopiaBasica() {
		Comprimido copia = new Comprimido(this.getNombre(), this.getTasa_compresion(), this.getFechaCreacion(), this.getFechaModificacion());
		return copia;
	}
	
}
