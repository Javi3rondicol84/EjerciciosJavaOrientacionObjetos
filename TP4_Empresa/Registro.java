package TP4_Empresa;

import java.util.ArrayList;

public class Registro {
	private ArrayList <Jerarquico> jefe;
	private ArrayList <UsuarioFinal> usuario;
	
	public Registro() {
		this.jefe = new ArrayList<Jerarquico>();
		this.usuario = new ArrayList<UsuarioFinal>();
		this.inicializarJerarquico();
		this.inicializarUsuario();
	}
	
	public void inicializarJerarquico() {
		int cant_jefe = 1;
		
		for(int i = 0; i < cant_jefe; i++) {
			this.jefe.add(new Jerarquico());
		}
		
	}
	
	public void inicializarUsuario() {
		int cant_user = 1; 
		
		for(int i = 0; i < cant_user; i++) {
			this.usuario.add(new UsuarioFinal());
		}
	}
	
}


