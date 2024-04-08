package TP7_BusquedaDocumentos;

public class FiltroAND extends Filtro {
	private Filtro ft1;
	private Filtro ft2;
	
	public FiltroAND(Filtro ft1, Filtro ft2) {
		this.ft1 = ft1;
		this.ft2 = ft2;
	}

	@Override
	public boolean cumpleCondicion(Documento dt) {
		return ft1.cumpleCondicion(dt) && ft2.cumpleCondicion(dt);
	}
	
}
