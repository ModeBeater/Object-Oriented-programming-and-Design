package problem5;
import java.util.Scanner;
public class DragonLaunchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DragonLaunch Dragon = new DragonLaunch();
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			char gen = in.next().charAt(0);
			Dragon.kidnap(gen);
		}
		if(Dragon.willDragonEatOrNot() == true) {
			System.out.println("Dragon will eat everybody");
		}
		else {
			Person p = new Person();
			System.out.println(p);
		}
	}

}
