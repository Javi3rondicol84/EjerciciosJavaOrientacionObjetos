package TP2_Est_Deportivo.copy;

public class Establecimiento { //organiza canchas(mediante creacion de turnos)
	
	private Turno turno[]; //organiza turnos
	private Registro registro; //registra socios
	private Usuario usuario[]; //se pasaria por parametro a turno y a registro.
	
	public Establecimiento() {
		this.turno = new Turno[1];
		this.registro = new Registro();
		this.usuario = new Usuario[1];
		this.inicializarTurno();
		this.inicializarUsuario();
	}
	
	public void inicializarTurno() {
		for(int i = 0; i < turno.length; i++) {
			turno[i] = new Turno();
		}
	}
	
	public void inicializarUsuario() {
		for(int i = 0; i < usuario.length; i++) {
			usuario[i] = new Usuario();
		}
	}
	
	
	
}
