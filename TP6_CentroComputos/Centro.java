package TP6_CentroComputos;

public class Centro {
	private ColaProcesos colaProcesos;
	private ColaPcs colaPcs;

	public Centro() {
		this.colaProcesos = new ColaProcesos();
		this.colaPcs = new ColaPcs();
	}
	
	public void setComparadorCola(Comparador cp) {
		this.obtenerColaProcesos().setComparador(cp);
	}
	
	public void setTipoComparador(Comparador cp) { //añadir el tipo de comparador que se usara para los procesos
		this.colaProcesos.setComparador(cp);
	}
	
	
	public void ejecutarProceso(Proceso ps) {
		
		if(this.colaPcs.obtenerCantidadPcs() > 0) {
			this.colaPcs.ejecutarProceso(ps);
		}
		else{
			colaProcesos.guardarProceso(ps);
		}
		
	}
	
	//hacer ejecutar procesosTotales
	
	public ColaProcesos obtenerColaProcesos() {
		return this.colaProcesos;
	}
	
	public static void main(String [] args) {
		Centro ct = new Centro();
		Computadora pc2 = new Computadora("PC2", 20000, 300);
		ct.colaPcs.guardarComputadora(pc2);
		Proceso ps = new Proceso("P2", 1000, 20);
		Proceso ps2 = new Proceso("P3", 10000, 3000);
		//ComparadorCpu cpCpu = new ComparadorCpu();
		//ct.setComparadorCola(cpCpu);
		ct.ejecutarProceso(ps);
		ct.ejecutarProceso(ps2);
		ct.obtenerColaProcesos().verProcesos();
		ct.colaPcs.verPcs();
		
	}
}
