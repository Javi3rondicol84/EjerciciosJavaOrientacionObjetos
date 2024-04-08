package TP6_CentroComputos;

public class ComparadorMemoria extends Comparador{

	@Override
	public boolean esMayor(Proceso p1, Proceso p2) {
		
		return p1.getReq_memoria() > p2.getReq_memoria();
	}
}
