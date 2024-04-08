package TP9_BazarAladin;

public class Main {
	
	public static void main(String [] args) {
	
		CCostoFijo cl = new CCostoFijo(300);
		CCostoFijo cl2 = new CCostoFijo(400);
		CCostoFijo cl3 = new CCostoFijo(600);
		CCostoFijo cl4 = new CCostoFijo(150);

		Producto p1 = new Producto("Combo 1 Producto 1", cl);
		Producto p2 = new Producto("Combo 1 Producto 2", cl2);
		Producto p3 = new Producto("Combo 1 Producto 3", cl3);
		Producto p4 = new Producto("Combo 1 Producto 4", cl4);
		
		p1.setPeso(250);
		p2.setPeso(250);
		p3.setPeso(250);
		p4.setPeso(250);
		
		p1.addCategoria("categ1");
		p1.addCategoria("categ2");
		p1.addCategoria("categ3");
		
		p2.addCategoria("categ4");
		p2.addCategoria("categ5");
		p2.addCategoria("categ6");
		
		p3.addCategoria("categ7");
		p3.addCategoria("categ8");
		p3.addCategoria("categ9");
		
		FPesoSuperior filtro = new FPesoSuperior(150);
		
		Combo combo = new Combo("Combo 1", filtro, 0.5, 0.5);
		
		combo.addElemento(p1);
		combo.addElemento(p2);
		combo.addElemento(p3);
		combo.addElemento(p4);
		
		Combo combo2 = new Combo("Combo 2", filtro, 0.5, 0);
		Producto p5 = new Producto("Combo 2 Producto 1", cl);
		p5.setPeso(300);
		combo2.addElemento(p5);
	
		combo.addElemento(combo2);
		
		FPrecioInferior filtro2 = new FPrecioInferior(1500);
		
		System.out.println(combo.buscar(filtro2));
		System.out.println(combo.getCantidadTotalProductos());
		System.out.println(combo.getCantidadProductos());
		System.out.println(combo.getPrecio());
		System.out.println(combo.getCategorias());
		
	}
	
}
