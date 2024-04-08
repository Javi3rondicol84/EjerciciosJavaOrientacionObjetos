package TP6_PuertoCereales;

public class ComparadorBarcoCapacidad extends ComparadorBarco {

	@Override
	public boolean comparar(Barco b1, Barco b2) {
		return b1.getCapacidad() > b2.getCapacidad();
	}

}
