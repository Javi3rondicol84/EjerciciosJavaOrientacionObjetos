package TP6_CentroComputos;

public class Proceso {
	private String nombreProceso;
	private int req_memoria;
	private int req_cpu;
	
	public Proceso() {
		this.setNombreProceso("Proceso 1");
		this.setReq_memoria(700);
		this.setReq_cpu(200);
	}
	
	public Proceso(String nm, int mem, int cpu) {
		this.setNombreProceso(nm);
		this.setReq_memoria(mem);
		this.setReq_cpu(cpu);
	}
	
	

	public int getReq_cpu() {
		return req_cpu;
	}

	public void setReq_cpu(int req_cpu) {
		this.req_cpu = req_cpu;
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public int getReq_memoria() {
		return req_memoria;
	}

	public void setReq_memoria(int requerimiento_memoria) {
		this.req_memoria = requerimiento_memoria;
	}
	
	public String toString() {
		return this.getNombreProceso();
	}
	
}
