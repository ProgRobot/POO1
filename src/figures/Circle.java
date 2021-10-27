package figures;

public class Circle {
	
	private Point centre ;
	private double rayon;
	
	public Circle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Circle(Point centre, Point pointCircle) {
		this.centre = centre;
		this.rayon = Math.sqrt(Math.pow(pointCircle.x-centre.x,2)+Math.pow(pointCircle.y-centre.y,2));
	}
	
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}

	public double getSurface() {
		return Math.PI*Math.pow(rayon, 2);
	}
	
	public boolean appartient(Point P) {
		return Math.sqrt(Math.pow(P.x-centre.x,2)+Math.pow(P.y-centre.y,2))<this.rayon;
	}
	
	public String toString() {
		return "Circle("+this.centre.x+","+this.centre.y+","+this.rayon+")";
	}
	
}
