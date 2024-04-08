package TP2_Sistema_Gastos_V2;

public class Provincia { //ver ciudades con mas gastos y las que mas recaudan
	private String nombre;
	private Ciudad ciudad[];
	private int cantidad = 100000;
	
	public Provincia() {
		this.nombre = "Buenos Aires";
		this.ciudad = new Ciudad[1];
		this.inicializarCiudad();
	}
	
	public Provincia(int cant_ciudad) {
		this.nombre = "Buenos Aires";
		this.ciudad = new Ciudad[cant_ciudad];
		this.inicializarCiudad();
	}
	
	public Provincia(int cant_ciudad, String nombre) {
		this.nombre = nombre;
		this.ciudad = new Ciudad[cant_ciudad];
		this.inicializarCiudad();
	}
	
	public void inicializarCiudad() {
		for(int i = 0; i < ciudad.length; i++) {
			ciudad[i] = new Ciudad();
		}
	}
	
	public boolean mitadCiudadesDeficitarias() {
		
		boolean ProvinciaDeficitaria = false;
		int suma_ciudades = 0;
		
		for(int i = 0; i < ciudad.length; i++) {
			if(ciudad[i].getHabitante() >= this.cantidad) {
				if(ciudad[i].esDeficitaria()) {
					suma_ciudades++;
				}
			}	
		}
		
		if(suma_ciudades > (ciudad.length/2)) {
			ProvinciaDeficitaria = true;
		}

		
		return ProvinciaDeficitaria;
	}
	
	public void verCiudadesDeficitarias() {
		//llamar a metodo que muestre en las distintas ciudades, su ciudad si es deficitaria
		
		for(int i = 0; i < ciudad.length; i++) {
			
			if(ciudad[i].getHabitante() >= this.cantidad) {
				if(ciudad[i].esDeficitaria()) {
					System.out.println("La ciudad "+ciudad[i].getNombre() + " es deficitaria");
				}
			}
			
		}
	}

	//setters getters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
