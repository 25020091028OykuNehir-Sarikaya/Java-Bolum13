package Test_13;
import tr.edu.istiklal.Course;

public class Test_13 {

	public static void main(String[] args) {
        Course course1 = new Course("Java");
        course1.addStudent("Nehir");
        course1.addStudent("Melike");

        Course course2 = (Course) course1.clone();
        course2.addStudent("Meryem");

        System.out.println("course1 sayı: " + course1.getNumberOfStudents()); 
        System.out.println("course2 sayı " + course2.getNumberOfStudents()); 
        System.out.println( (course1.getStudents() == course2.getStudents()));
    }

}
