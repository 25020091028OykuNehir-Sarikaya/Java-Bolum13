package Test_9;
import tr.edu.istiklal.Circle;

public class Test_9 {


	public static void main(String[] args) {
		Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(8);

        System.out.println(c1.equals(c2));     
        System.out.println(c1.equals(c3));      
        System.out.println(c1.compareTo(c3));  
        System.out.println(c3.compareTo(c1));  
        System.out.println(c1.compareTo(c2));
	}

}
