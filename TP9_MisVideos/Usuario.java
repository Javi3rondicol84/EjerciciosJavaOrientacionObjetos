package TP9_MisVideos;

public class Usuario {
	private String nombreUsuario;
	private int añoCreacion;
	private String email;
	
	public Usuario(String nombreUsuario, int añoCreacion, String email) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.añoCreacion = añoCreacion;
		this.email = email;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getAñoCreacion() {
		return añoCreacion;
	}
	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
