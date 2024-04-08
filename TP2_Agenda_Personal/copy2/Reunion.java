package TP2_Agenda_Personal.copy2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reunion {
	private Usuario [] us;
	private String lugar;
	private String tema;
	private int duraccion;
	
	public Reunion() {
		this.us = new Usuario[2];
		this.inicializarUsuarios();
	}
	
	public Reunion(int cant_usuarios) {
		this.us = new Usuario[cant_usuarios];
		this.inicializarUsuarios();
	}
	
	public Reunion(int cant_usuarios, String lugar, String tema, int duraccion) {
		this.us = new Usuario[cant_usuarios];
		this.inicializarUsuarios();
		this.lugar = lugar;
		this.tema = tema;
		this.duraccion = duraccion;
	}
	
	public void inicializarUsuarios() {
		
		for(int i = 0; i < us.length; i++) {
			us[i] = new Usuario();
		}
		
	}
	
	public void usuarioParticipaEnReunion() {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int telefono;
		String mail;

		try {
			for(int i = 0; i < us.length; i++) {
				System.out.println("Ingresar el telefono del asistente a la reunion");
				telefono = Integer.valueOf(entrada.readLine());
				this.us[i].setTelefono(telefono);
				
				System.out.println("Ingresar el mail del asistente a la reunion");
				mail = entrada.readLine();
				this.us[i].setMail(mail);
			}
		}
		catch(Exception exc) {
		}
	} //CAMBIAR
	
	
	//setters and getters
	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getDuraccion() {
		return duraccion;
	}

	public void setDuraccion(int duraccion) {
		this.duraccion = duraccion;
	}
	
	
}
