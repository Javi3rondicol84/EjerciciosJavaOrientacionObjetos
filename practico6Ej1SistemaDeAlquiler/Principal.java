package practico6Ej1SistemaDeAlquiler;

import java.time.LocalDate;

/*El sistema
debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencidos.*/

public class Principal {

	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("batman1","alguna",2);
		
		Vehiculo v1 = new Vehiculo("raul","honda",10000,123456, "naftero");
		
		Cliente c1 = new Cliente("k");
		
		
		Alquiler a1 = new Alquiler(LocalDate.now(),LocalDate.of(2004, 05, 19));
		
		a1.Alquilar(c1,v1,LocalDate.now(),LocalDate.of(2004, 05, 19));
		
		a1.Alquilar(new Cliente("f"), new Pelicula("f(x)", "nose", 2), LocalDate.now(),LocalDate.of(2004, 05, 19));
		System.out.println(a1.AlquileresVencidos());
	}

}
