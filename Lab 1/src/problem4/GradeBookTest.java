package problem4;
import java.util.Scanner;


public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook First = new GradeBook();
		Scanner in = new Scanner(System.in);
		Course OOP = new Course("CS101 Object-oriented Programming and Design!");
		System.out.print(OOP);
		int n = 3;
		while(n > 0) {
			String name = in.next();
			int grade = in.nextInt();
			int index = (int)(Math.round(grade / 10));
			GradeBook first_Course = new GradeBook(name,grade,index);
			Course.v.add(first_Course.getStudent());
			n = n - 1;
		}
		System.out.println(First);
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Course.v.get(i));
//		}
	}
}
