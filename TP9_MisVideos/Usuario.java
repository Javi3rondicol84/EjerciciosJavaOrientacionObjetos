package TP9_MisVideos;

public class Usuario {
	private String nombreUsuario;
	private int a�oCreacion;
	private String email;
	
	public Usuario(String nombreUsuario, int a�oCreacion, String email) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.a�oCreacion = a�oCreacion;
		this.email = email;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getA�oCreacion() {
		return a�oCreacion;
	}
	public void setA�oCreacion(int a�oCreacion) {
		this.a�oCreacion = a�oCreacion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
