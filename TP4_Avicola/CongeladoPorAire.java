package TP4_Avicola;

public class CongeladoPorAire extends ProductoCongelado {
	private double porcen_nitrogeno;
	private double porcen_oxigeno;
	private double porcen_dioxido;
	private double porcen_vapor;
	
	public CongeladoPorAire() {
		this.setPorcen_nitrogeno(0.25);
		this.setPorcen_oxigeno(0.25);
		this.setPorcen_dioxido(0.20);
		this.setPorcen_vapor(0.30);
	}

	public double getPorcen_nitrogeno() {
		return porcen_nitrogeno;
	}

	public void setPorcen_nitrogeno(double porcen_nitrogeno) {
		this.porcen_nitrogeno = porcen_nitrogeno;
	}

	public double getPorcen_oxigeno() {
		return porcen_oxigeno;
	}

	public void setPorcen_oxigeno(double porcen_oxigeno) {
		this.porcen_oxigeno = porcen_oxigeno;
	}

	public double getPorcen_dioxido() {
		return porcen_dioxido;
	}

	public void setPorcen_dioxido(double porcen_dioxido) {
		this.porcen_dioxido = porcen_dioxido;
	}

	public double getPorcen_vapor() {
		return porcen_vapor;
	}

	public void setPorcen_vapor(double porcen_vapor) {
		this.porcen_vapor = porcen_vapor;
	}
	
	
	
}
