package TP4_Empresa;

public class UsuarioFinal extends Persona {
	private String nombre_usuario;
	private String password;
	
	public UsuarioFinal() {
		this.setCargo("Usuario");
		this.setNombre_usuario("Juancito23");
		this.setPassword("lopez2323lopez");
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
