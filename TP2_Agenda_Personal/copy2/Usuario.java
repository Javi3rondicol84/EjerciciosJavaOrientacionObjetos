package TP2_Agenda_Personal.copy2;

public class Usuario {
	private int telefono;
	private String mail;
	
	public Usuario() {
		
	}
	
	public Usuario(int telefono, String mail) {
		this.telefono = telefono;
		this.mail = mail;
	}

	
	//setters and getters
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
