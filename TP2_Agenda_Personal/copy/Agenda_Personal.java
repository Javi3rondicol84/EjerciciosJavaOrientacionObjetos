package TP2_Agenda_Personal.copy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Agenda_Personal {
	private Reunion re[];
	
	public Agenda_Personal() {
		this.re = new Reunion[1];
		this.inicializarReuniones();
	}
	
	public Agenda_Personal(int cant_reuniones) {
		this.re = new Reunion[cant_reuniones];
		this.inicializarReuniones();
	}
	
	public void inicializarReuniones() {
		
		for(int i = 0; i < re.length; i++) {
			re[i] = new Reunion();
		}
		
	}
	
	public void registrarReunion() { //registrar lugar, duraccion, tema, y usuarios de la reunion
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int duraccion;
		String lugar; 
		String tema;
		
		try {
			for(int i = 0; i < re.length; i++) {
				
				this.re[i].usuarioParticipaEnReunion();
				
				System.out.println("Ingresar la duraccion de la reunion");
				duraccion = Integer.valueOf(entrada.readLine());
				this.re[i].setDuraccion(duraccion);
				
				System.out.println("Ingresar el lugar de la reunion");
				lugar = entrada.readLine();
				this.re[i].setLugar(lugar);
				
				System.out.println("Ingresar el tema de la reunion");
				tema = entrada.readLine();
				this.re[i].setTema(tema);;
				
			}

		}
		catch(Exception exc) {
			
		}
		
		
	}
	
}
