package applicationTestFigures;
import figures.Circle;
import figures.Point;

public class applicationTestFigures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point c,p,c2;
		
		c = new Point(100,100);
		p = new Point(200,200);
		
		Circle circle1 = new Circle(c,p);
		
		c2 = new Point(130,100);
		
		Circle circle2;
		circle2 = new Circle(c2,40);
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
		
	}
}
