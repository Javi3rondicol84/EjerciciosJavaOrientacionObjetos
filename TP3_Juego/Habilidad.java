package TP3_Juego;

public class Habilidad {
	private int velocidad;
	private boolean vision_nocturna;
	private int fuerza;
	private double peso;
	private double altura;
	private int edad;
	
	public Habilidad() {
		this.setVelocidad(500);
		this.setVision_nocturna(false);
		this.setFuerza(700);
		this.setPeso(80);
		this.setAltura(170);
		this.setEdad(33);
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isVision_nocturna() {
		return vision_nocturna;
	}

	public void setVision_nocturna(boolean vision_nocturna) {
		this.vision_nocturna = vision_nocturna;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
