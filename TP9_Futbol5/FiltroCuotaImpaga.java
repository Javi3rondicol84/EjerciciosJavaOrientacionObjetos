package TP9_Futbol5;

public class FiltroCuotaImpaga extends Filtro {

	@Override
	public boolean cumple(Socio sc) {
		return !sc.isPagoUltimaCuota();
	}

}
