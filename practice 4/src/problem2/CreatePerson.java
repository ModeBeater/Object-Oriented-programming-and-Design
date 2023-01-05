package problem2;
import java.util.Scanner;
import java.util.Vector;

public class CreatePerson {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Vector<Person> v = new Vector<Person>();
		int n = in.nextInt();
		while(n > 0) {
			System.out.println("add or show?");
			String operation = in.next();
			if(operation.equals("add")) {
				System.out.println("Staff or Student?");
				String category = in.next();
				System.out.println("Input Name and address");
				String name = in.next();
				String address = in.next();
				if(category.equals("Staff")) {
					System.out.println("Input School and pay");
					String school = in.next();
					double pay = in.nextDouble();
					Staff teacher = new Staff(name,address,school,pay);
					v.add(teacher);
				}
				if(category.equals("Student")) {
					System.out.println("Input program,year and fee");
					String program = in.next();
					int year = in.nextInt();
					double fee = in.nextDouble();
					Student best = new Student(name,address,program,year,fee);
					v.add(best);
				}
			}
			if(operation.equals("show")) {
				for(int i = 0; i < v.size(); i++) {
					System.out.println(v.get(i));
				}
			}
			n--;
		}
//		Staff teacher = new Staff("Pakita", "KBTU", "24", 1000000);
//		v.add(teacher);
//		Student best = new Student("Nurkhan", "KBTU", "IS", 2, 37000);
//		v.add(best);
//		for(int i = 0; i < v.size(); i++) {
//			System.out.println(v.get(i));
//		}
	}

}
