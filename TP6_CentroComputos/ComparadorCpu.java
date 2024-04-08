package TP6_CentroComputos;

public class ComparadorCpu extends Comparador {
	
	@Override
	public boolean esMayor(Proceso p1, Proceso p2) {
		
		return p1.getReq_cpu() > p2.getReq_cpu();
	}
	
}