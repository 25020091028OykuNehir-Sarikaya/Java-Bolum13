package Test_5;
import tr.edu.istiklal.Circle;
import tr.edu.istiklal.Rectangle;
import tr.edu.istiklal.GeometricObject;

public class Test_5 {

	
	public static void main(String[] args) {
		 Circle c1 = new Circle(5);
	        Circle c2 = new Circle(7);
	        GeometricObject largerCircle = GeometricObject.max(c1, c2);
	        System.out.println( largerCircle);
	        System.out.println( largerCircle.getArea());

	        Rectangle r1 = new Rectangle(4, 6);
	        Rectangle r2 = new Rectangle(3, 9);
	        GeometricObject largerRect = GeometricObject.max(r1, r2);
	        System.out.println( largerRect);
	        System.out.println(largerRect.getArea());
	}

}
