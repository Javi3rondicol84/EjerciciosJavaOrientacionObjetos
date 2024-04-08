package TP3_Contacto;

import java.time.LocalDate;
import java.time.Month;

public class Contacto {
	private String nombre;
	private String apellido;
	LocalDate fecn;
	private int telefono;
	private String direccion;
	private String mail;
	private String ciudad;
	
	public Contacto() {
		fecn = LocalDate.of(2000, Month.AUGUST, 20);
		this.setNombre("Pepe");
		this.setApellido("ignacio");
		this.setTelefono(33333);
		this.setDireccion("ameghino");
		this.setMail("pepe@gmail.com");
		this.setCiudad("tandil");
	}
	
	public double getEdad() {
		double edad;
		LocalDate actual = LocalDate.now();
		
		if((actual.getMonthValue() >= fecn.getMonthValue()) && (actual.getDayOfMonth() >= fecn.getDayOfMonth())) {
			edad = actual.getYear() - this.fecn.getYear();
		}
		else {
			edad = (actual.getYear() - this.fecn.getYear()) - 1;
		}
		
		
		
		return edad;
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
	public LocalDate getFecn() {
		return fecn;
	}
	public void setFecn(LocalDate fecn) {
		this.fecn = fecn;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
