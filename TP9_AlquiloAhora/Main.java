package TP9_AlquiloAhora;

public class Main {

	public static void main(String[] args) {
		Item it1 = new Item("Terreno");
		Item it2 = new Item("Mesa");
		Item it3 = new Item("Motosierra");
		
		ItemDeprecated it4 = new ItemDeprecated("Destornillador", 2);
		it4.setAntiguedadMeses(2);
		it4.setMesesEnvejecimiento(3);
		
		it1.setValor(30000);
		it2.setValor(250);
		it3.setValor(400);
		it4.setValor(600);
		it1.setID(10);
		it2.setID(3);
		it3.setID(25);
		it4.setID(4);
		
		ComboArmado cb = new ComboArmado("Combo");
		cb.addItemGeneral(it1);
		cb.addItemGeneral(it2);
		cb.addItemGeneral(it3);
		cb.addItemGeneral(it4);
		
		FValorMenor ft = new FValorMenor(200000);
		ComparadorID comp = new ComparadorID();
		
		System.out.println(cb.buscar(ft, comp));
	}

}
