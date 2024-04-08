package TP9_Padron_Electoral;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Voto {
	private Candidato candidato;
	private LocalDateTime horaVoto;
	
	public Voto(Candidato candidato, LocalDateTime horaVoto) {
		this.candidato = candidato;
		this.horaVoto = horaVoto;
	}
	
	public LocalDateTime getHoraVoto() {
		return this.horaVoto;
	}
	
	public Candidato getCandidato() {
		return this.candidato;
	}
	
	public boolean votoEnBlanco() {
		return this.candidato == null;
	}
}
