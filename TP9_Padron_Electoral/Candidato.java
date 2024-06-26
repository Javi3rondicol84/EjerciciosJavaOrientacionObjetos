package TP9_Padron_Electoral;

public class Candidato {
	private String nombre;
	private String partido;
	private String agrupacion;
	
	public Candidato(String nombre, String partido, String agrupacion) {
		super();
		this.nombre = nombre;
		this.partido = partido;
		this.agrupacion = agrupacion;
	}
	
	@Override
	public boolean equals(Object obj) {
		Candidato candidato = (Candidato) obj;
		
		try {
			return this.getNombre().equals(candidato.getNombre()) && this.getPartido().equals(candidato.getPartido()) && this.getAgrupacion().equals(candidato.getAgrupacion());
		}
		catch(Exception exc) {
			return false;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getAgrupacion() {
		return agrupacion;
	}
	public void setAgrupacion(String agrupacion) {
		this.agrupacion = agrupacion;
	}
	
	
}
