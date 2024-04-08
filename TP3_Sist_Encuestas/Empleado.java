package TP3_Sist_Encuestas;

public class Empleado {
	//realiza encuestas
	private Encuesta [] enc;
	
	private String nombre;
	private int salario;
	
	public Empleado() {
		this.setSalario(10000);
		this.enc = new Encuesta[3];
		this.inicializarEncuesta();
	}
	
	
	public void inicializarEncuesta() {
		
		for(int i = 0; i < enc.length; i++) {
			enc[i] = new Encuesta();
		}
		
	}
	
	
	public void RealizarEncuesta() {
		
		for(int i = 0; i < enc.length; i++) {
			enc[i].personaRespondeEncuestasDistintas();
			enc[i].setSe_respondio(true); //la encuesta se respondio
		}
		
	}
	
	public int obtenerEncuestasRealizadas() {
		//sumar encuestas cuyo boolean de respondidas sea true
		int suma = 0;
		
		for(int i = 0; i < enc.length; i++) {
			if(enc[i].getSe_respondio()) {
				suma++;
			}
		
		}
		
		return suma;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
}
