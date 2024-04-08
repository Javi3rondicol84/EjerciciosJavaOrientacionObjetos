package TP3_Sist_Encuestas;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encuestado { //persona que fue encuestada
	private int DNI;
	private String nombre;
	private boolean respondio;
	
	public Encuestado() {
		this.setNombre("John");
	}
	
	public void respondeEncuesta(Pregunta [] preg) {
		
		String respuesta;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < preg.length; i++) {
			
			try {		
				System.out.println(preg[i].getNombre_pregunta());
				respuesta = entrada.readLine();
				preg[i].setRespuesta_pregunta(respuesta);
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
			
		}
		
	}
	
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
