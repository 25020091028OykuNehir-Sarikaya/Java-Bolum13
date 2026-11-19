package Test_10;
import tr.edu.istiklal.Rectangle;
public class Test_10 {


	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 6);   
        Rectangle r2 = new Rectangle(3, 8);  
        Rectangle r3 = new Rectangle(5, 5);  

        System.out.println(r1.equals(r2));   
        System.out.println(r1.equals(r3));   
        System.out.println(r1.compareTo(r3));  
        System.out.println(r1.compareTo(r2));  
	}

}
