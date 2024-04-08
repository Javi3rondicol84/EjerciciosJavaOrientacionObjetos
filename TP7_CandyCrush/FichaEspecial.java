package TP7_CandyCrush;

public class FichaEspecial extends Ficha {

	public FichaEspecial(String nombre, int fortaleza, int cant_casilleros,
			int destruccion) {
		super(nombre, fortaleza, cant_casilleros, destruccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDestruccion() {
		return this.getFortaleza()/this.getCant_casilleros();
	}
	
}
