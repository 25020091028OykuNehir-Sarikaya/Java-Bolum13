package Test_6;
import tr.edu.istiklal.ComparableCircle;
import tr.edu.istiklal.Rectangle;
import tr.edu.istiklal. GeometricObject;


public class Test_6 {

	
	    public static void main(String[] args) {
	        
	        ComparableCircle cc1 = new ComparableCircle(4);
	        ComparableCircle cc2 = new ComparableCircle(6);
	        ComparableCircle largerCircle = (cc1.compareTo(cc2) >= 0) ? cc1 : cc2;
	        System.out.println( largerCircle);

	    
	        ComparableCircle cc3 = new ComparableCircle(3);
	        Rectangle rect = new Rectangle(5, 6);
	        GeometricObject larger = (cc3.compareTo(rect) >= 0) ? cc3 : rect;
	        System.out.println(cc3);
	        System.out.println( rect);
	        System.out.println( larger);
	    }
	}


