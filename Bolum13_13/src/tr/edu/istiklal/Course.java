package tr.edu.istiklal;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
      
    }

    @Override
    public Object clone() {
        try {
            Course course = (Course) super.clone();
            course.students = new String[students.length];
            System.arraycopy(students, 0, course.students, 0, students.length);
            return course;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError(ex);
        }
    }
}
