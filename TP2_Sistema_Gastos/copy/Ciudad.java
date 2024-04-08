package TP2_Sistema_Gastos.copy;

public class Ciudad { //ver gastos de ciudad(objeto gasto) y cuanto recaudan con impuestos de la ciudad(objeto impuestos).
	private Gasto gasto[];
	private Impuesto impuesto[];
	private String nombre;
	private int habitante;
	
	public Ciudad() {
		this.gasto = new Gasto[1];
		this.impuesto = new Impuesto[5];
		this.nombre = "Tandil";
		this.habitante = 100000;
		this.inicializarGasto();
		this.inicializarImpuesto();
	}
	
	public Ciudad(int gasto, int impuesto) {
		this.gasto = new Gasto[gasto];
		this.impuesto = new Impuesto[impuesto];
		this.nombre = "Tandil";
		this.habitante = 100000;
		this.inicializarGasto();
		this.inicializarImpuesto();
	}
	
	public Ciudad(String nombre, int cantidad_habitantes) {
		this.gasto = new Gasto[1];
		this.impuesto = new Impuesto[5];
		this.nombre = nombre;
		this.habitante = cantidad_habitantes;
		this.inicializarGasto();
		this.inicializarImpuesto();
	}
	
	public void inicializarGasto() {
		for(int i = 0; i < gasto.length; i++) {
			gasto[i] = new Gasto();
		}
	}
	
	public void inicializarImpuesto() {
		for(int i = 0; i < impuesto.length; i++) {
			impuesto[i] = new Impuesto();
		}
	}
	
	public int obtenerGastos() {
		int gasto = 0;
		int suma = 0;
		int indice = 0;
		
		while(indice < this.gasto.length) {
			
			gasto = this.gasto[indice].getMonto_gasto();
			suma += gasto;
			
			indice++;
		}
		
		
		return suma;
	}
	
	public int obtenerRecaudacion() {
		int recaudacion = 0;
		int suma = 0;
		int indice = 0;
		
		while(indice < this.impuesto.length) {
			
			recaudacion = this.impuesto[indice].getMonto();
			suma += recaudacion;
			
			indice++;
		}
		
		
		return suma;
	}
	
	public boolean esDeficitaria() { //gasta mas que lo que recauda
		
		return this.obtenerGastos() > this.obtenerRecaudacion();
	}

	
	//setters getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitante() {
		return habitante;
	}

	public void setHabitante(int habitante) {
		this.habitante = habitante;
	}
	
	
	
	
}
