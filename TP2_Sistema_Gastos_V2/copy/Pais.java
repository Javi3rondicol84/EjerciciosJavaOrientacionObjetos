package TP2_Sistema_Gastos_V2.copy;

public class Pais { //debe poder ver las provincias que tienen más de la mitad de las ciudades en condición
	//de déficit.
	private Provincia provincia[]; //santa fe, buenos aires, etc.
	private String nombre; //argentina
	
	public Pais() {
		this.nombre = "Argentina";
		this.provincia = new Provincia[3];
		this.inicializarProvincias();
	}
	
	public void inicializarProvincias() {
		
		for(int i = 0; i < provincia.length; i++) {
			provincia[i] = new Provincia();
		}
	}
	
	public void verCiudadesDeficitarias( ) {
		
		for(int i = 0; i < provincia.length; i++) {
			provincia[i].verCiudadesDeficitarias();
		}
		
	}
	
	public void verProvinciasMitadDeficitarias() { //mitad de sus ciudades siendo deficitarias
		
		for(int i = 0; i < provincia.length; i++) {
			if(provincia[i].mitadCiudadesDeficitarias()) {
				System.out.println("La provincia de "+provincia[i].getNombre() + " tiene más de la mitad de sus ciudades deficitarias");
			}
		}
		
	}
	
}
