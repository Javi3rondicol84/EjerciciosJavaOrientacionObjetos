package TP3_Juego;

public class Jugador {
	private String nombre;
	private Personaje personaje;
	
	public Jugador() {
		this.personaje = new Personaje();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	
	
	
	
	
	
	
}
