package TP6_PuertoCereales;

import java.util.ArrayList;

public class ColaBarcos {
	private ComparadorBarco cb;
	private ArrayList<Barco> barcos;
	
	public ColaBarcos() {
		this.cb = new ComparadorBarcoCapacidad();
		this.barcos = new ArrayList<Barco>();
	}
	
	public void setComparadorCamion(ComparadorBarco cb) {
		this.cb = cb;
	}
	
	public void addBarco(Barco b) {
		int i = 0;
		int n = this.barcos.size();
		
		while((i < n) && (this.cb.comparar(this.barcos.get(i), b))) {
			i++;
		}
		
		if(i < n) {
			this.barcos.add(i, b);
		}
		else {
			this.barcos.add(b);
		}
	}
	
	public Barco get() {
		return this.barcos.remove(0);
	}
	
	public int size() {
		return this.barcos.size();
	}
	
	public void verBarcos() {
		for(int i = 0; i < this.barcos.size(); i++) {
			System.out.println(this.barcos.get(i));
		}
	}
}
