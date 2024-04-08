package practico6Ej1SistemaDeAlquiler;

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
public class Pelicula extends Item {
	
	private String informacionFilmografica;
	private int cantcopiaspel;
	
	public Pelicula(String nombre, String informacionFilmografica, int cantcopiaspel) {
		super(nombre);
		this.informacionFilmografica = informacionFilmografica;
		this.cantcopiaspel = cantcopiaspel;
		
	}
	
	public boolean sePuedeAlquilarItem() {
		if (getCantCopiasPel() > 0) {
			cantcopiaspel--;
			return true;
		}
		return false;
	}

	public String getInformacionFilmografica() {
		return informacionFilmografica;
	}


	public void setInfosrmacionFilmografica(String informacionFilmografica) {
		this.informacionFilmografica = informacionFilmografica;
	}


	public int getCantCopiasPel() {
		return cantcopiaspel;
	}


	public void setCantcopiaspel(int cantcopiaspel) {
		this.cantcopiaspel = cantcopiaspel;
	}
}
