package TP9_SistemaArchivos;

import java.time.LocalDate;

public class FCreacionAntesDeFecha extends Filtro {
	private LocalDate fechacreacion;
	
	public FCreacionAntesDeFecha(LocalDate fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	
	@Override
	public boolean cumple(ElementoSA elemento) {
		return elemento.getFechaModificacion().isAfter(this.fechacreacion);
	}
}
