package TP9_Padron_Electoral;

public class Votante {
	private int dni;
	private Voto voto;

	public Votante(int dni, Voto voto) {
		super();
		this.dni = dni;
		this.voto = voto; //referencia a candidato que incluso puede ser nulo, osea en blanco
	}

	public int getDNI() {
		return dni;
	}
	
	public Voto getVoto() {
		return voto;
	}
	
	@Override
	public boolean equals(Object obj) {
		Votante votante = (Votante) obj;
		
		try {
			return this.getDNI() == votante.getDNI();
		}
		catch(Exception exc) {
			return false;
		}
	}
	
}
