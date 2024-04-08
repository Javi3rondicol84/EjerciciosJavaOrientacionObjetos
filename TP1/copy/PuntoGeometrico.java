package TP1.copy;

public class PuntoGeometrico {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public PuntoGeometrico() {
		this.x1 = 3;
		this.x2 = 2;
		this.y1 = 3;
		this.y2 = 2;
	}
	
	public PuntoGeometrico(int x1, int x2, int y1, int y2) {
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
	
	
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public double calculateEuclidianDistance() {
		
		return Math.sqrt((this.getX1() - this.getX2()) + (this.getY1() - this.getY2()) );
	}
	
	
}
