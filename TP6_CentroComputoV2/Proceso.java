package TP6_CentroComputoV2;

public class Proceso extends Elemento {
	private int RequerimientoMemoria;
	private int RequerimientoCpu;
	
	public Proceso() {
		this.setNombre("Proceso 1");
		this.setRequerimientoMemoria(700);
		this.setRequerimientoCpu(200);
	}
	
	public Proceso(String nm, int mem, int cpu) {
		this.setNombre(nm);
		this.setRequerimientoMemoria(mem);
		this.setRequerimientoCpu(cpu);
	}
	
	public String toString() {
		return this.getNombre();
	}

	public int getRequerimientoMemoria() {
		return RequerimientoMemoria;
	}

	public void setRequerimientoMemoria(int requerimientoMemoria) {
		RequerimientoMemoria = requerimientoMemoria;
	}

	public int getRequerimientoCpu() {
		return RequerimientoCpu;
	}

	public void setRequerimientoCpu(int requerimientoCpu) {
		RequerimientoCpu = requerimientoCpu;
	}

	@Override
	public boolean esMayor(Elemento el) {
		return this.getRequerimientoMemoria() > ((Proceso) el).getRequerimientoMemoria();
	}
	
	public boolean equals(Object obj) {
		try {
			return this.getNombre().equals(((Proceso) obj).getNombre()) && this.getRequerimientoCpu() == ((Proceso) obj).getRequerimientoCpu()
					&& this.getRequerimientoMemoria() == ((Proceso) obj).getRequerimientoMemoria();
		}
		catch(Exception exc) {
			return false;
		}
	}
}
