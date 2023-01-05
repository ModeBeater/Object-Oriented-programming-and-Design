package problem5;

import java.util.Scanner;

public class CreateCircuit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n > 0) {
			new GetData();
			n--;
		}
		GetData.getAns();
		in.close();
	}

}
