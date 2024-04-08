package TP9_SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class AccesoDirecto extends ElementoSA{
	private ElementoSA referencia;
	public static final String PREFIJO = "Acceso Directo a ";

	public AccesoDirecto(ElementoSA referencia, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		super(PREFIJO + referencia.getNombre(), fechaCreacion, fechaModificacion);
		this.referencia = referencia;
	}
	
	@Override
	public double getTamanio() {
		return 1;
	}

	@Override
	public int getCantElementos() {
		return 1;
	}

	@Override
	public ArrayList<ElementoSA> buscar(Filtro ft, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> lista = new ArrayList<ElementoSA>();
		
		if(ft.cumple(this)) {
			lista.add(this);
		}
		
		return lista;
	}

	@Override
	public AccesoDirecto copia() {
		AccesoDirecto copia = new AccesoDirecto(this.referencia, this.getFechaCreacion(), this.getFechaModificacion());
		return copia;
	}

}
