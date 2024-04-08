package TP7_BusquedaDocumentos;

public class FiltroPalabraClave extends Filtro {
	private String palabra;
	
	public FiltroPalabraClave(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumpleCondicion(Documento dt) {
		return dt.getPalabras_claves().contains(this.palabra);
	}
}
