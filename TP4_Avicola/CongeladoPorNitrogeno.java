package TP4_Avicola;

public class CongeladoPorNitrogeno extends ProductoCongelado{
	private String metodo_congelacion;
	private int tiempo_exposicion_segs;

	public CongeladoPorNitrogeno() {
		this.setMetodo_congelacion("Criogenico");
		this.setTiempo_exposicion_segs(5);
	}

	public String getMetodo_congelacion() {
		return metodo_congelacion;
	}

	public void setMetodo_congelacion(String metodo_congelacion) {
		this.metodo_congelacion = metodo_congelacion;
	}

	public int getTiempo_exposicion_segs() {
		return tiempo_exposicion_segs;
	}

	public void setTiempo_exposicion_segs(int tiempo_exposicion_segs) {
		this.tiempo_exposicion_segs = tiempo_exposicion_segs;
	}
	
	public void verProcesoUsado() {
		System.out.println("El metodo usado fue: "+this.getMetodo_congelacion()+", y el tiempo de exposicion fue de: "+this.getTiempo_exposicion_segs()+" segundos");
	}
	
}
