package TP7_BusquedaDocumentos;

public class FNoHayPalabraClave extends Filtro {
	private FiltroPalabraClave ft;
	
	public FNoHayPalabraClave(String palabra) {
		ft = new FiltroPalabraClave(palabra);
	}
	
	@Override
	public boolean cumpleCondicion(Documento dt) {
		return new FiltroNOT(this.ft).cumpleCondicion(dt);
	}
}
