package TP9_Futbol5;

public class FiltroMenoresEdad extends Filtro {
	public static final int EDADMINIMA = 18;
	
	
	@Override
	public boolean cumple(Socio sc) {
		return sc.getEdad() < EDADMINIMA;
	}

}
