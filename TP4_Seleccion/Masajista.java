package TP4_Seleccion;

public class Masajista extends Contingente {
	private String titulo;
	private int años_exp;
	
	public Masajista() {
		this.setTitulo("Profesional");
		this.setAños_exp(2);
		this.setRol("Masajista");
		this.setNombre("Luis");
		this.setEstado("Viajando");
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAños_exp() {
		return años_exp;
	}
	public void setAños_exp(int años_exp) {
		this.años_exp = años_exp;
	}
	
	
	
	
}


