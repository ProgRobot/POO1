package figures;

public class Point {
	
	protected double x = 0, y = 0;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + this.x + ", y=" + this.y + "]";
	}
	
	

}
