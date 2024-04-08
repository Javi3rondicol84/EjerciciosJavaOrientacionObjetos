package TP4_Alarma_Sensorial;

import java.util.ArrayList;


public class Alarma {

	private Timbre timbre;
	protected ArrayList <Sensor> sensor;
	private int cant_sensores;
	//protected St
	
	public Alarma() {
		this.timbre = new Timbre();
		this.sensor = new ArrayList<Sensor>();
		this.cant_sensores = 4;
		this.aniadirSensores();
		this.comprobar();

	}
	
	public void aniadirSensores() {
		
		for(int i = 0; i < this.cant_sensores; i++) {
			this.sensor.add(new Sensor());
		}
		this.sensor.get(0).setSe_abrio_puerta_ventana(true);
		this.sensor.get(2).setSe_abrio_puerta_ventana(true);
		this.sensor.get(2).setZona_control("Banio");
	}
	
	public void aniadirSensor() {
		this.sensor.add(new Sensor());

	}
	
/*	public void modificarSensores() {
		
		for (Sensor sensor : this.sensor) {
		    System.out.println(sensor.getZona_control());
		}
	}
	*/
	public void comprobar() {
		boolean activar = false;
		
		for(Sensor sensor : this.sensor) {
			if(sensor.getSe_rompio_vidrio() || sensor.getSe_abrio_puerta_ventana() || sensor.getSe_detecto_movimiento()) {
				System.out.println("Zona: " + sensor.getZona_control());
				activar = true;
			}
		}
		
		if(activar) {
			timbre.hacerSonar();
		}
	}
	
	
	public static void main(String [] args) {
		//AlarmaLuminosa alarma = new AlarmaLuminosa();
		Alarma alarma = new Alarma();
	
	
	}
	
}
