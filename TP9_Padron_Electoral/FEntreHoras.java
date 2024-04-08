package TP9_Padron_Electoral;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FEntreHoras extends Filtro {
	private LocalDateTime primerHora;
	private LocalDateTime segundaHora;
	
	public FEntreHoras(LocalDateTime primerHora, LocalDateTime segundaHora) {
		this.primerHora = primerHora;
		this.segundaHora = segundaHora;
	}
	
	@Override
	public boolean cumple(Voto voto) {
		return voto.getHoraVoto().isAfter(this.primerHora) && voto.getHoraVoto().isBefore(this.segundaHora);
	}

}
