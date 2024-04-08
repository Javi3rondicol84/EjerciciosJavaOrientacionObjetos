package TP9_Futbol5;

public class FiltroAlquiloCancha extends Filtro {
	private int id;
	
	public FiltroAlquiloCancha(int id) {
		this.id = id;
	}

	@Override
	public boolean cumple(Socio sc) {
		return sc.alquiloCanchaId(id);
	}
}
