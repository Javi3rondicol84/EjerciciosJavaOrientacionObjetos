package practico6Ej1SistemaDeAlquiler;

/*Sistema de Alquiler. 
El sistema debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencidos.*/

public abstract class Item {
	private String nombre;
	
	public Item (String nombre) {
		this.nombre = nombre;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract boolean sePuedeAlquilarItem();
	
	public String toString() {
		return this.getNombre() + " ";
	}
}
