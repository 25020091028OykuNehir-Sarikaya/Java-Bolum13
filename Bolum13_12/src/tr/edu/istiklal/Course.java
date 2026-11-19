package tr.edu.istiklal;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
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
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
               
                for (int j = i; j < numberOfStudents - 1; j++)
                    students[j] = students[j + 1];
                students[--numberOfStudents] = null;
                break;
            }
        }
    }

    @Override
    public Course clone() {
        try {
           
            Course copy = (Course) super.clone();

           
            copy.students = new String[students.length];
            System.arraycopy(students, 0, copy.students, 0, students.length);

            return copy;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError(ex); 
        }
    }
}