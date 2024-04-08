package TP4_Alarma_Sensorial;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	
	public AlarmaLuminosa() {
		super();
		this.luz = new Luz();
		
		for(Sensor sensor : this.sensor) {
			if(sensor.getSe_rompio_vidrio() || sensor.getSe_abrio_puerta_ventana() || sensor.getSe_detecto_movimiento()) {
				luz.Encender();
			}
		}
	}
	
}
