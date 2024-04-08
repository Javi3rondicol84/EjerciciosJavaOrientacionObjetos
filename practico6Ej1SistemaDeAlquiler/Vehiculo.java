package practico6Ej1SistemaDeAlquiler;
/*De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.*/
public class Vehiculo extends Item {
	private String marca;
	private int kms;
	private int patente;
	private String tipoVehiculo;
	private boolean alquilado;
	
	public Vehiculo(String nombre, String marca, int kms, int patente, String tipoVehiculo) {
		super(nombre);
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
		alquilado=false;
	}

	public boolean sePuedeAlquilarItem() {
		if (!isAlquilado()) {//si no esta alquilado lo alquila
			setAlquilado(true);
			return true;
		}
		return false;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public int getPatente() {
		return patente;
	}

	public void setPatente(int patente) {
		this.patente = patente;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado= alquilado;
	}


	
}
