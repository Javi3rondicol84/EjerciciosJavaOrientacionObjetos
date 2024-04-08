package TP9_SitioWebNoticias;

public class FiltroNOT extends Filtro {
	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return !this.filtro.cumple(noticia);
	}

}
