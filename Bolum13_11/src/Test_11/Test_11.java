package Test_11;
import tr.edu.istiklal.Octagon;

public class Test_11 {
	public static void main(String[] args) {
        Octagon o1 = new Octagon(5);
        System.out.println("Area: " + o1.getArea());
        System.out.println("Perimeter: " + o1.getPerimeter());

        Octagon o2 = o1.clone();

        int result = o1.compareTo(o2);
        if (result == 0)
            System.out.println("o1 ve o2 esit");
        else if (result > 0)
            System.out.println("o1 daha buyuk");
        else
            System.out.println("o2 daha buyuk");
    }
	

	
}
