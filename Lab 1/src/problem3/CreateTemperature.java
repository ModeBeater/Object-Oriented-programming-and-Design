package problem3;
import java.util.Scanner;
public class CreateTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.next();
		Temperature t = new Temperature();
		Temperature temp = new Temperature(a);
//		System.out.println(temp.toDouble(a));
//		System.out.println(t.Cel());
//		System.out.println(temp.Cel());
//		System.out.println(temp.Fahr());
		System.out.println(temp.getAns());
	}

}
