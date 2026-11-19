package Test_13;
import tr.edu.istiklal.Course ;

public class Test_13 {


	public static void main(String[] args) {
		 Course course1 = new Course("Java");
	        course1.addStudent("Nehir");
	        course1.addStudent("Melike");

	        Course course2 = course1.clone();

	     
	        course2.addStudent("Meryem");
	        course1.dropStudent("Nehir");

	        System.out.println( course1.getNumberOfStudents() + " " + course1.getStudents()[0]);
	        System.out.println( course2.getNumberOfStudents() + " " + course2.getStudents()[0]);
	        System.out.println((course1.getStudents() == course2.getStudents()));
	    }

	}


