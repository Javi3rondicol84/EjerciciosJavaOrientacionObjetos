package TP7_Viveros;

import java.util.ArrayList;

public class Planta {
	private String nombre;
	private ArrayList<String> nombres_vulgares;
	private String clasif_superior;
	private String familia;
	private String clase;
	private String tipo_ambiente;
	private int req_sol;
	private int req_agua;
	private final String tipo_uno = "de interior";
	private final String tipo_dos = "de exterior";
	
	private final int min_req_sol = 1;
	private final int max_req_sol = 10;
	private final int min_req_agua = 1;
	private final int max_req_agua = 10;
	
	public Planta(String nombre, String clasificacion, String familia, String clase, String tipo_ambiente, int req_sol, int req_agua) {
		this.nombre = nombre;
		this.clasif_superior = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.tipo_ambiente = tipo_ambiente;
		this.req_sol = req_sol;
		this.req_agua = req_agua;
		this.nombres_vulgares = new ArrayList<String>();
		this.aniadirNombresVulgaresDefault();
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " , familia: " + this.getFamilia() + " , clase: "+this.getClase()+ " , Ambiente: "+this.tipo_ambiente;
	}
	
	public String getTipo_uno() {
		return tipo_uno;
	}

	public String getTipo_dos() {
		return tipo_dos;
	}

	public int getMin_req_sol() {
		return min_req_sol;
	}

	public int getMax_req_sol() {
		return max_req_sol;
	}

	public int getMin_req_agua() {
		return min_req_agua;
	}

	public int getMax_req_agua() {
		return max_req_agua;
	}

	public void aniadirNombresVulgaresDefault() {
		String n1 = "potos";
		String n2 = "pothos";
		String n3= "potus";
		
		this.nombres_vulgares.add(n1);
		this.nombres_vulgares.add(n2);
		this.nombres_vulgares.add(n3);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClasif_superior() {
		return clasif_superior;
	}
	public void setClasif_superior(String clasif_superior) {
		this.clasif_superior = clasif_superior;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getTipo_ambiente() {
		return tipo_ambiente;
	}
	public void setTipo_ambiente(String tipo_ambiente) {
		
		if(tipo_ambiente.toLowerCase().equals(this.tipo_uno) || tipo_ambiente.toLowerCase().equals(this.tipo_dos)) {
			this.tipo_ambiente = tipo_ambiente.toLowerCase();
		}
		else {
			System.out.println("La planta debe ser "+ this.tipo_uno+" o "+this.tipo_dos);
		}
	
	}
	public int getReq_sol() {
		return req_sol;
	}
	public void setReq_sol(int req_sol) {
		if(req_sol > min_req_sol || req_sol < max_req_sol) {
			this.req_sol = req_sol;
		}
		else {
			System.out.println("El requerimiento de sol debe estar entre "+this.min_req_sol+" y "+this.max_req_sol);
		}
		
	}
	public int getReq_agua() {
		return req_agua;
	}
	public void setReq_agua(int req_agua) {
		if(req_agua > min_req_agua || req_agua < max_req_agua) {
			this.req_agua = req_agua;
		}
		else {
			System.out.println("El requerimiento de sol debe estar entre "+this.min_req_agua+" y "+this.max_req_agua);
		}
		
		
	}
	
	public ArrayList<String> obtenerNombresVulgares() {
		return new ArrayList<String>(this.nombres_vulgares);
	}
	
	
	
}
