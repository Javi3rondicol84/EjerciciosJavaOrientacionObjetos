package TP6_PuertoCereales;

import java.util.ArrayList;

public class ColaCamiones {
	private ComparadorCamion cm;
	private ArrayList<Camion> camiones;
	
	public ColaCamiones() {
		this.cm = new ComparadorCamionFecha();
		this.camiones = new ArrayList<Camion>();
	}
	
	public void setComparadorCamion(ComparadorCamion cm) {
		this.cm = cm;
	}
	
	public void addCamion(Camion cm) {
		int i = 0;
		int n = this.camiones.size();
		
		while((i < n) && (this.cm.comparar(this.camiones.get(i), cm))) {
			i++;
		}
		
		if(i < n) {
			this.camiones.add(i, cm);
		}
		else {
			this.camiones.add(cm);
		}
	
	}
	
	public Camion get() {
		return this.camiones.remove(0);
	}
	
	public int size() {
		return this.camiones.size();
	}
	
	public void verCamiones() {
		for(int i = 0; i < this.camiones.size(); i++) {
			System.out.println(this.camiones.get(i));
		}
	}
}
