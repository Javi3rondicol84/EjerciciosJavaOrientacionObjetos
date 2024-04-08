package practico6Ej1SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

/*Sistema de Alquiler
El sistema
debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencidos.*/
public class Alquiler {

	
	private ArrayList<Cliente> clientes;
	private ArrayList<Item> itemsAlquilados;
	private ArrayList<Object> alquiler;
	private LocalDate fechaCuandoempieza;
	private LocalDate fecha_venc;
	
	public Alquiler(LocalDate fechaCuandoempieza, LocalDate fecha_venc) {
		this.itemsAlquilados = new ArrayList<>();
		clientes = new ArrayList<>();
		alquiler =new ArrayList<>();
		this.fechaCuandoempieza = fechaCuandoempieza;
		this.fecha_venc = fecha_venc;
	}
	

	public void Alquilar(Cliente c, Item i, LocalDate fechaCuandoempieza, LocalDate fecha_venc) {
		if (i.sePuedeAlquilarItem()) {
			addCliente(c);
			alquiler.add(c);
			alquiler.add(i);
			alquiler.add(fechaCuandoempieza);
			alquiler.add(fecha_venc);
		}
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void addItemAlquiler(Item i) {
		itemsAlquilados.add(i);
	}
	
	
	public ArrayList<Cliente> AlquileresVencidos(){
		
		ArrayList<Cliente> aux = new ArrayList<>();
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).miAlquilerEstaVencido(fechaCuandoempieza, fecha_venc)) {
				aux.add(clientes.get(i));
			}
		}
		return aux;
	}

}
