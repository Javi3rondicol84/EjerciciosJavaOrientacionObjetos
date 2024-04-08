package TP9_Aseguradora;

public class FDni extends Filtro {
	private int dni;
	
	public FDni(int dni) {
		this.dni = dni;
	}
	
	@Override
	public boolean cumple(SeguroGeneral seg) {
		return seg.getDNI() == this.dni;
	}
}
