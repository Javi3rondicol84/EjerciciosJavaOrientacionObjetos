package TP9_Padron_Electoral;

public class FCandidato extends Filtro {
	private Candidato candidato;
	
	public FCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	@Override
	public boolean cumple(Voto voto) {
		return voto.getCandidato().equals(this.candidato);
	}
	
	
}
