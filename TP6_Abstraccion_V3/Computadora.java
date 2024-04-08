package TP6_Abstraccion_V3;

public class Computadora extends Elemento {
	private int MemoriaRam;
	private int VelocidadCpu;
	private Proceso proc;
	
	public Computadora() {
		this.setNombre("PC1");
		this.setMemoriaRam(2000);
		this.setVelocidadCpu(2005);
		this.proc = null;
	}
	
	public Computadora(String nm, int mem, int cpu) {
		this.setNombre(nm);
		this.setMemoriaRam(mem);
		this.setVelocidadCpu(cpu);
	}
	
	public void ejecutarProceso(Proceso ps) {
		System.out.println(ps.getNombre()+" Ejecutado en la Pc de nombre: "+this.getNombre());
	}
	
	public String toString() {
		return this.getNombre() + " : Mem: "+ this.getMemoriaRam() + ", Cpu: " + this.getVelocidadCpu();
	}

	public int getMemoriaRam() {
		return MemoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		MemoriaRam = memoriaRam;
	}

	public int getVelocidadCpu() {
		return VelocidadCpu;
	}

	public void setVelocidadCpu(int velocidadCpu) {
		VelocidadCpu = velocidadCpu;
	}

	@Override
	public boolean esMayor(Elemento el) {
		return this.getVelocidadCpu() > ((Computadora) el).getVelocidadCpu();
	}
	
	public boolean equals(Object obj) {
		
		try {
			return this.getNombre().equals(((Computadora) obj).getNombre()) && this.getVelocidadCpu() == ((Computadora) obj).getVelocidadCpu()
					&& this.getMemoriaRam() == ((Computadora) obj).getMemoriaRam();
		}
		catch(Exception exc){
			return false;
		}
		
	}
	
	public void Ejecutar(Proceso ps) {
		this.proc = ps;
		System.out.println("Proceso ejecutado: ");
		System.out.println(this.proc);
	}

}
