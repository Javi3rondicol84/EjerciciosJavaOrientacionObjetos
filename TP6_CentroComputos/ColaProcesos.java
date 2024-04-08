package TP6_CentroComputos;

import java.util.ArrayList;

public class ColaProcesos {	
	private ArrayList<Proceso> procesos;
	private Comparador comparador;
	
	public ColaProcesos() {
		this.comparador = new ComparadorMemoria(); //por defecto es por memoria.
		this.procesos = new ArrayList<Proceso>();
		this.procesosDefault(); //añadir el tipo de comparador que se usara para los procesos
	}
	
	public void procesosDefault() { //añadidos procesos por defecto
		Proceso ps = new Proceso("P1", 60, 300);
		this.procesos.add(ps);
	}
	
	public void setComparador(Comparador cp) { //añadir el tipo de comparador que se usara para los procesos
		this.comparador = cp;
	}
	
	public int obtenerCantidadProcesos() {
		return this.procesos.size();
	}
	
	public void guardarProceso(Proceso ps) {
		int i = 0;
		
		while((i < this.procesos.size()) && (this.comparador.esMayor(procesos.get(i), ps))) { //recorremos la lista de procesos && i es menor a ps
			 i++;
		}
		
		if(i < this.procesos.size()) {
			this.procesos.add(i, ps); //el req del proceso es mayor a alguno de los que estan. hace lugar y lo introduce
		}
		else {
			this.procesos.add(ps); //lo añade al final si el req del proceso es menor a todos los que ya estan
		} 
	}
	
	public void verProcesos() {
		
		for(int i = 0; i < this.procesos.size(); i++) {
			System.out.println("Nombre: " + this.procesos.get(i).getNombreProceso() + " ReqCpu: " + this.procesos.get(i).getReq_cpu() + " ReqMem: " + this.procesos.get(i).getReq_memoria());
		}
		
	}
	
}
