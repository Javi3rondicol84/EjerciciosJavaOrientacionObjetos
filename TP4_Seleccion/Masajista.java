package TP4_Seleccion;

public class Masajista extends Contingente {
	private String titulo;
	private int a�os_exp;
	
	public Masajista() {
		this.setTitulo("Profesional");
		this.setA�os_exp(2);
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
	public int getA�os_exp() {
		return a�os_exp;
	}
	public void setA�os_exp(int a�os_exp) {
		this.a�os_exp = a�os_exp;
	}
	
	
	
	
}


