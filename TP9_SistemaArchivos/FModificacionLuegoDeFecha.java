package TP9_SistemaArchivos;

import java.time.LocalDate;

public class FModificacionLuegoDeFecha extends Filtro {
	private LocalDate fechamod;
	
	public FModificacionLuegoDeFecha(LocalDate fechamod) {
		this.fechamod = fechamod;
	}
	
	@Override
	public boolean cumple(ElementoSA elemento) {
		return elemento.getFechaModificacion().isAfter(this.fechamod);
	}

}
