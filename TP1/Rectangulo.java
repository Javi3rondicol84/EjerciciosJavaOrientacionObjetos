package TP1;




public class Rectangulo {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	
	public Rectangulo() {
		this.x1 = 3;
		this.x2 = 2;
		this.y1 = 3;
		this.y2 = 2;
		
	}
	
	public Rectangulo(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void displace(int x1, int x2, int y1, int y2) {
		this.x1 += x1;
		this.x2 += x2;
		this.y1 += y1;
		this.y2 += y2;
	}
}
