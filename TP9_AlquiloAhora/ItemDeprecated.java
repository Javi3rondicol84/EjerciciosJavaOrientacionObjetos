package TP9_AlquiloAhora;

import java.util.ArrayList;
import java.util.Comparator;

public class ItemDeprecated extends Item {
	private int mesesEnvejecimiento;
	private Descuento descuento;
	
	public ItemDeprecated(String nombre, int descuento) {
		super(nombre);
		this.descuento = new Descuento(descuento);
	}
	
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public ArrayList<Item> buscar(Filtro filtro, Comparator<Item> comp) {
		ArrayList<Item> lista = new ArrayList<Item>();
		
		if(filtro.cumple(this) && this.getAntiguedadMeses() < this.getMesesEnvejecimiento()) {
			lista.add(this);
		}
		
		return lista;
	}
	
	
	public double getValor() {
		int diferencia = this.getAntiguedadMeses() - this.getMesesEnvejecimiento();
		
		if(this.getAntiguedadMeses() < this.getMesesEnvejecimiento()) {
			return super.getValor();
		}
		else if(this.getAntiguedadMeses() > this.getMesesEnvejecimiento()){
			return super.getValor() - (super.getValor() * ((this.descuento.getValorConDescuento() * diferencia)/100));
		}

		return super.getValor();
	}

	public int getMesesEnvejecimiento() {
		return mesesEnvejecimiento;
	}

	public void setMesesEnvejecimiento(int mesesEnvejecimiento) {
		this.mesesEnvejecimiento = mesesEnvejecimiento;
	}
	
	
}
