package TP9_SitioWebNoticias;

public class FContienePalabra extends Filtro {
	private String palabra;
	
	public FContienePalabra(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.contienePalabraClave(this.palabra);
	}

}
