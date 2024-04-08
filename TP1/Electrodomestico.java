package TP1;

public class Electrodomestico {
	public String name;
	public double price_base;
	public String color;
	public int energy_consume;
	public double weight;
	
	public Electrodomestico() {
		this.price_base = 100.0;
		this.color = "gris plata";
		this.energy_consume = 10;
		this.weight = 2.0;
	}
	
	public Electrodomestico(String name) {
			this();
			this.name = name;
	}
	
	public Electrodomestico(String name, double price_base) {
		this();
		this.name = name;
		this.price_base = price_base;
	}
	
	public Electrodomestico(String name, double price_base, String color) {
		this();
		this.name = name;
		this.price_base = price_base;
		this.color = color;
	}
	
	public Electrodomestico(String name, double price_base, String color, int energy_consume) {
		this();
		this.name = name;
		this.price_base = price_base;
		this.color = color;
		this.energy_consume = energy_consume;
	}
	
	public Electrodomestico(String name, double price_base, String color, int energy_consume, double weight) {
		this();
		this.name = name;
		this.price_base = price_base;
		this.color = color;
		this.energy_consume = energy_consume;
		this.weight = weight;
	}
	
	/* weights */
	
	public String getName() {
		
		return name;
	}
	
	public double getPriceBase() {
		
		return price_base;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public int getEnergyConsume() {
		
		return energy_consume;
	}
	
	public double getWeight() {
		
		return weight;
	}
	
	
	
	/* sets */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPriceBase(double price_base) {
		this.price_base = price_base;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setEnergyConsume(int energy_consume) {
		this.energy_consume = energy_consume;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	/* funciones de la clase */
	
	public void isLowConsume() {
		if(this.getWeight() < 45) {
			System.out.println("Es de bajo consumo");
		}
		else {
			System.out.println("No es de bajo consumo");
		}
	}
	
	public double calculateBalance() {
		return this.getEnergyConsume()/this.getWeight();
	}
	
	public void isHighEnd() {
		if(this.calculateBalance() > 3) {
			System.out.println("Es de alta gama");
		}
		else {
			System.out.println("No es de alta gama");
		}
	}
	
}
