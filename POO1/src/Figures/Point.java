package Figures;

public class Point {
	
	protected double x,y;
	
	Point(){
		this.x = 0;
		this.y = 0;
	}
	
	Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "("+x+" , "+y+")";
	}
	
	
}
