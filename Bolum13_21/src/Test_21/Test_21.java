package Test_21;
import tr.edu.istiklal.Rational;
import java.util.Scanner;

public class Test_21 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" a, b, c giriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        
        Rational h = new Rational(-b, 2 * a);
        
        Rational k = new Rational(4 * a * c - b * b, 4 * a);

        System.out.println("h : " + h + " k : " + k);
    }
}
