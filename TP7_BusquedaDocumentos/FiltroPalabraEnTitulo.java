package TP7_BusquedaDocumentos;

public class FiltroPalabraEnTitulo extends Filtro {
	private String palabra_frase;
	
	public FiltroPalabraEnTitulo(String palabra) {
		this.palabra_frase = palabra;
	}
	
	
	@Override
	public boolean cumpleCondicion(Documento dt) {
		return dt.getTitulo().contains(this.palabra_frase);
	}
}
