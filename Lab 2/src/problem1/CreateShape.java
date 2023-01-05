package problem1;

import java.util.Scanner;

public class CreateShape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n > 0) {
			System.out.println("Cube, Sphere or Cylinder?");
			getData Data = new getData();
			System.out.println(Data.ans);
			n--;
		}
		in.close();
	}

}
