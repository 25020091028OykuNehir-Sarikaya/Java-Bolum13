package Test_8;
import tr.edu.istiklal.MyStack;

public class Test_8 {

	
	public static void main(String[] args) {
        MyStack s1 = new MyStack();
        s1.push("X");
        s1.push("Y");
        s1.push("Z");

        MyStack s2 = (MyStack) s1.clone();
        s2.push("Q");

        System.out.println( s1);  
        System.out.println( s2);
}
}
