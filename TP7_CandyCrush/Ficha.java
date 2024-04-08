package TP7_CandyCrush;

public class Ficha {
	private String nombre;
	private int fortaleza;
	private int cant_casilleros;
	private int destruccion;
	
	public Ficha(String nombre, int fortaleza, int cant_casilleros, int destruccion) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.cant_casilleros = cant_casilleros;
		this.destruccion = destruccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFortaleza() {
		return fortaleza;
	}
	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}
	public int getCant_casilleros() {
		return cant_casilleros;
	}
	public void setCant_casilleros(int cant_casilleros) {
		this.cant_casilleros = cant_casilleros;
	}
	public int getDestruccion() {
		return destruccion;
	}
	public void setDestruccion(int destruccion) {
		this.destruccion = destruccion;
	}
	
	@Override
	public String toString() {
		return "Nombre ficha: "+this.getNombre()+" , Cantidad de Casilleros: "+ this.getCant_casilleros() +" , Poder de Destruccion: "+this.getDestruccion()+" , Fortaleza: "+this.getFortaleza();
	}
	
	
}
