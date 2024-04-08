package TP5_Cooperativa;

import java.util.ArrayList;

public class Cooperativa {
	private ArrayList<String> listaMineralesPrimarios;
	private ArrayList<String> listaMineralesSecundarios;
	private ArrayList<Lote> lotes;
	private ArrayList<Cereal> cereales;

	public Cooperativa() {
		this.listaMineralesPrimarios = new ArrayList<String>();
		this.listaMineralesSecundarios = new ArrayList<String>();
		this.lotes = new ArrayList<Lote>();
		this.cereales = new ArrayList<Cereal>();
		this.aniadirMineralesPrimarios();
		this.aniadirMineralesSecundarios();
	}
	
	public static void main(String [] args) {
		
		Lote lt = new Lote(100, "Lote01");
		
		Cooperativa cp = new Cooperativa();
		
		cp.verQueTipoDeLoteEs(lt);
		
	}
	
	public void aniadirMineralesPrimarios() {
		String n1 = "circon";
		String n2 = "rutilo";
		String n3 = "cuarzo";
		
		this.listaMineralesPrimarios.add(n1);
		this.listaMineralesPrimarios.add(n2);
		this.listaMineralesPrimarios.add(n3);
	}
	
	public void aniadirMineralesSecundarios() {
		String n1 = "anatasa";
		String n2 = "linita";
		
		this.listaMineralesSecundarios.add(n1);
		this.listaMineralesSecundarios.add(n2);
	}

	
	public void verCerealesPermitidosEnLote(Lote lt) {

		for(int i = 0; i < this.cereales.size(); i++) {
			if(lt.cerealSatisfaceRequerimientos(this.cereales.get(i))) {
				System.out.println(this.cereales.get(i).getNombre_grano());
			}
		}
		
	}
	
	public void verLotesPermitidosParaSembrarEnCereal(Cereal cr) {
		//mirar lotes
		
		for(int i = 0; i < this.lotes.size(); i++) {
			
			if(cr.loteSatisfaceRequerimientos(lotes.get(i))) {
				System.out.println(lotes.get(i).getNombre_lote());
			}
			
		}
		
	}
	
	public void verQueTipoDeLoteEs(Lote lt) {
		
		ArrayList<String> minerales = lt.obtenerMinerales();
		
		if(esEspecial(minerales)) {
			System.out.println("El lote es de tipo especial");
		}
		else if(esComun(minerales)) {
			System.out.println("El lote es de tipo comun");
		}
		else {
			System.out.println("No es ningun tipo");
		}
	}
	
	public boolean esEspecial(ArrayList<String> mins) {
		int suma = 0;
		
		for(int i = 0; i < this.listaMineralesPrimarios.size(); i++) {
			
			if(mins.contains(listaMineralesPrimarios.get(i))) {
				suma++;
			}

		}

		if(suma == this.listaMineralesPrimarios.size()) {
			return true;
		}
		
		return false;
	}
	
	public boolean esComun(ArrayList<String> mins) {
		int suma = 0;
		
		for(int i = 0; i < this.listaMineralesSecundarios.size(); i++) {
			
			if(mins.contains(listaMineralesSecundarios.get(i))) {
				suma++;
			}

		}

		if(suma == this.listaMineralesSecundarios.size()) {
			return true;
		}
		
		return false;
	}
}	
