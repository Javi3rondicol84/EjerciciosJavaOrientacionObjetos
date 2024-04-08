package TP6_Abstraccion_V3;

import java.time.LocalDate;

public class SistemaDeCarga {
	private ColaEspera computadoras;
	private ColaEspera procesos;
	private ColaEspera camiones;
	private ColaEspera barcos;
	
	public SistemaDeCarga() {
		this.computadoras = new ColaEspera();
		this.procesos = new ColaEspera();
		this.camiones = new ColaEspera();
		this.barcos = new ColaEspera();
	}
	
	public static void main(String [] args) {
		//Prueba Computadoras y Procesos
		
		SistemaDeCarga sc = new SistemaDeCarga();
		
		Computadora pc = new Computadora("PC2", 20000, 300);
		Computadora pc2 = new Computadora("PC2", 20000, 300);

		sc.addComputadora(pc);
		sc.addComputadora(pc2);
		
		sc.verPcs();
		
		Proceso ps = new Proceso("P2", 1000, 20);
		Proceso ps2 = new Proceso("P3", 10000, 3000);
		
		sc.addProceso(ps);
		sc.addProceso(ps2);
			
		sc.verProcesos();
		
		System.out.println();
		
		//Prueba Camiones y Puertos
	
		LocalDate fecha = LocalDate.now();
		Camion cn = new Camion("Camion 1", fecha);
		Camion cn2 = new Camion("Camion 2", fecha);
		Barco b = new Barco("Barco 1", 200);
		Barco b2 = new Barco("Barco 2", 205);
		//pr.addCamion(cn);
		sc.addBarco(b);
		sc.addCamion(cn2);
		sc.addBarco(b2);
	
		System.out.println(sc.camiones.hayElementos());
		System.out.println(sc.barcos.hayElementos());
	}
	
	
	/* Computadoras y Procesos */
	
	public void addProceso(Proceso ps) {
		
		if(ps == null) {
			return;
		}
		
		if(computadoras.hayElementos()) {
			Computadora libre = this.getSiguienteCompu();
			libre.Ejecutar(ps);
		}
		else {
			this.procesos.addElemento(ps);
		}
	}
	
	
	public void addComputadora(Computadora pc) {
		
		if(pc == null) {
			return;
		}
		
		if(procesos.hayElementos()) {
			pc.Ejecutar(this.getSiguienteProceso());
		}
		else {
			this.computadoras.addElemento(pc);
		}
		
	}
	
	public void verPcs() {
		this.computadoras.verElementos();
	}
	
	public void verProcesos() {
		this.procesos.verElementos();
	}
	
	public Computadora getSiguienteCompu() {
		return (Computadora)this.computadoras.getSiguiente();
	}
	
	public Proceso getSiguienteProceso() {
		return (Proceso)this.procesos.getSiguiente();
	}
	
	
	/* Camiones y Barcos */
	

	public void addCamion(Camion cn) {
		
		if(cn == null) { //control previo para que no se pase un camion null
			return;
		}

		if(barcos.hayElementos()) {
			Barco b = this.getSiguienteBarco();
			b.cargar(cn);
		}
		else {
			camiones.addElemento(cn);
			System.out.println("Camion aniadido");
		}
				
	}
	
	public void addBarco(Barco b) {
		
		if(b == null) {
			return;
		}
		
			if(camiones.hayElementos()) {
				Camion cm = this.getSiguienteCamion();
				cm.descargar(b);
			}
			else {
				this.barcos.addElemento(b);
				System.out.println("Barco aniadido");
			}
		
	}
	
	public Camion getSiguienteCamion() {
		return (Camion) this.camiones.getSiguiente();
	}
	
	public Barco getSiguienteBarco() {
		return (Barco) this.barcos.getSiguiente();
	}
}
