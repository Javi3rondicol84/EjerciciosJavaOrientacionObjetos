package TP5_Facturacion;

public class Empleado {
	private String nombre;
	private String apellido;
	private int DNI;
	private double sueldo;
	
	public Empleado() {
		
	}
	
	public double getSueldoMensual() {
		return sueldo;
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

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
