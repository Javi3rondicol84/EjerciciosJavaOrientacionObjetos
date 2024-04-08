package TP4_Empresa;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String cargo;

	
	public Persona() {
		this.setNombre("Juan");
		this.setApellido("Lopez");
		this.setEdad(30);
		this.setCargo("Persona");
	}
	



	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
