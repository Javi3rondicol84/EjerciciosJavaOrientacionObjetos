package TP6_CentroComputoV2;


public class CentroComputo {
	private ColaEspera computadoras;
	private ColaEspera procesos;
	
	public CentroComputo() {
		this.computadoras = new ColaEspera();
		this.procesos = new ColaEspera();
	}
	
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
	
	
	public static void main(String [] args) {
		CentroComputo ct = new CentroComputo();
		Computadora pc = new Computadora("PC2", 20000, 300);
		Computadora pc2 = new Computadora("PC2", 20000, 300);
		
	
		ct.addComputadora(pc);
		ct.addComputadora(pc2);
		
		ct.verPcs();
		
		Proceso ps = new Proceso("P2", 1000, 20);
		Proceso ps2 = new Proceso("P3", 10000, 3000);
		
		ct.addProceso(ps);
		ct.addProceso(ps2);
			
		ct.verProcesos();
		
	}

}
