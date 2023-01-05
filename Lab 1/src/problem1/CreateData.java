package problem1;
import java.util.Scanner;
public class CreateData {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double val;
		int ok = 1;
		Data Juice = new Data();
		while(ok == 1) {
			String input;
			System.out.print("Enter number(Q to quit): ");
			input = in.next();
			if(input.equals("Q")) {
				var Analyzer = new Analyzer(Juice);
				System.out.print(Analyzer.toString());
				ok = 0;
				return;
			}
			val = Double.parseDouble(input);
			Juice.addData(val);
		}
		
		in.close();
	}
}
