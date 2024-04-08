package TP4_Avicola;

public class CongeladoPorAgua extends ProductoCongelado {
	private int gramos_sal;
	private int litros_de_agua;
	
	public CongeladoPorAgua() {
		this.setGramos_sal(100);
		this.setLitros_de_agua(20);
	}

	public int getGramos_sal() {
		return gramos_sal;
	}

	public void setGramos_sal(int gramos_sal) {
		this.gramos_sal = gramos_sal;
	}

	public int getLitros_de_agua() {
		return litros_de_agua;
	}

	public void setLitros_de_agua(int litros_de_agua) {
		this.litros_de_agua = litros_de_agua;
	}
	
	public int obtenerSalinidadAgua() {
		return this.getGramos_sal()*this.getLitros_de_agua();
	}
	
	
}
