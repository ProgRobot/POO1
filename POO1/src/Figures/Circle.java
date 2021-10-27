package Figures;

public class Circle {
	
	Point centre;
	double rayon;
	
	public Circle() {
		this.centre = new Point();
		this.rayon = 0;
	}
	
	public Circle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Circle(Point centre, double x,double y) {
		
	}
	
}