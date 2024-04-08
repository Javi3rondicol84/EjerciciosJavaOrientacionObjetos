package TP6_CentroComputos;

public class Computadora {
	private String nombre;
	private int memoriaRam;
	private int cpu;
	
	public Computadora() {
		this.setNombre("PC1");
		this.setMemoriaRam(2000);
		this.setCpu(2005);
	}
	
	public Computadora(String nm, int mem, int cpu) {
		this.setNombre(nm);
		this.setMemoriaRam(mem);
		this.setCpu(cpu);
	}
	
	public void ejecutarProceso(Proceso ps) {
		System.out.println(ps.getNombreProceso()+" Ejecutado en la Pc de nombre: "+this.getNombre());
	}

	public String toString() {
		return this.getNombre() + " : Mem: "+ this.getMemoriaRam() + ", Cpu: " + this.getCpu();
	}
	
	
	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	//setters getters
	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
