package TP3_Juego;

public class Personaje {
	private String nombre_real;
	private String alter_ego;
	private Habilidad habilidades;
	
	public Personaje() {
		this.setNombre_real("Clark kent");
		this.setAlter_ego("Superman");
		this.habilidades = new Habilidad();
	}

	public String getNombre_real() {
		return nombre_real;
	}

	public void setNombre_real(String nombre_real) {
		this.nombre_real = nombre_real;
	}

	public String getAlter_ego() {
		return alter_ego;
	}

	public void setAlter_ego(String alter_ego) {
		this.alter_ego = alter_ego;
	}

	public Habilidad getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidad habilidades) {
		this.habilidades = habilidades;
	}
	
	
	
	
}
