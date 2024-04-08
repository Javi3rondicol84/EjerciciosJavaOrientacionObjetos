package TP9_Futbol5;

import java.util.Comparator;

public class ComparadorCuotasPagas implements Comparator<Socio>{

	@Override
	public int compare(Socio s1, Socio s2) {
		
		if(s1.isPagoUltimaCuota() == s2.isPagoUltimaCuota()) {
			return 0;
		}
		else if(s1.isPagoUltimaCuota()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
