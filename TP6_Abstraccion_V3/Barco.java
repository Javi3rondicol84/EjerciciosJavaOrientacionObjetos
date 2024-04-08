package TP6_Abstraccion_V3;

public class Barco extends Elemento{
	private int capacidad;
	
	public Barco(String nombre, int capacidad) {
		this.setNombre(nombre);
		this.setCapacidad(capacidad);
	}
	
	@Override
	public boolean esMayor(Elemento el) {
		return this.getCapacidad() > ((Barco) el).getCapacidad();
	}
	
	public String toString() {
		return this.getNombre() + ", "+ this.getCapacidad();
	}
	
	public boolean equals(Object obj) {
		try {
			return this.getNombre().equals(((Barco) obj).getNombre()) && this.getCapacidad() == ((Barco) obj).getCapacidad();
		}
		catch(Exception e) {
			return false;
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public void cargar(Camion cm) {
		System.out.println("Barco "+this.getNombre()+" cargado por el Camion "+cm.getNombre());
	}

}
