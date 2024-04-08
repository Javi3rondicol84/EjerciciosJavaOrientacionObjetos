package TP6_PuertoCereales;

public class ComparadorCamionFecha extends ComparadorCamion {

	@Override
	public boolean comparar(Camion c1, Camion c2) {
		return c1.obtenerFechaCarga().isAfter(c2.obtenerFechaCarga());
	}

}
