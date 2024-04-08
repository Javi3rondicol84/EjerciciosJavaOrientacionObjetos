package TP9_Padron_Electoral;

public class FVotoEnBlanco extends Filtro {

	@Override
	public boolean cumple(Voto voto) {
		return voto.votoEnBlanco();
	}

}
