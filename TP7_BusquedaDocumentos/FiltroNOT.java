package TP7_BusquedaDocumentos;

public class FiltroNOT extends Filtro {
	private Filtro ft;
	
	
	public FiltroNOT(Filtro ft) {
		this.ft = ft;
	}

	@Override
	public boolean cumpleCondicion(Documento dt) {
		return !ft.cumpleCondicion(dt);
	}
}
