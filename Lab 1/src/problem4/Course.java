package problem4;
import java.util.Vector;
import Test.Student;
public class Course {
	String nameOfCourse = "";
	static Vector<Student> v = new Vector<Student>();
	public Course(String nameOfCourse) {
		this.nameOfCourse = nameOfCourse;
	}
	public String toString() {
		return "Welcome to the grade book for " + nameOfCourse + "\nPlease,input grades for students:\n";
	}
}
