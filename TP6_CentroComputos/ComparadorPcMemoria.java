package TP6_CentroComputos;

public class ComparadorPcMemoria extends ComparadorPc{

	@Override
	public boolean esMayor(Computadora pc1, Computadora pc2) {
	
		return pc1.getMemoriaRam() > pc2.getMemoriaRam();
	}

}
