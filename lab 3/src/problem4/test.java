package problem4;

import java.sql.Date;
import java.util.Collections;

public class test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee e1 = new Employee("Alan",30000,new Date(12,12,12),"123");
		Employee e2 = new Employee("Kate",35000,new Date(12,10,5),"123");
		Employee e3 = new Employee("Boris", 32000, new Date(13,11,2),"321");
		Employee e4 = (Employee) e3.clone();
		System.out.println(e4);
		e4.hireDate = new Date(12,5,12);
		System.out.println(e4 + "\n" + e3 + "\n");
		Manager m = new Manager("Danil", 50000, new Date(13,5,7), "233",15000);
		Manager m1 = (Manager) m.clone();
		m1.bonus = 10000;
		System.out.println(m1 + "\n" + m + "\n");
		m.v.add(e1);
		m.v.add(e2);
		m.v.add(e3);
		System.out.println(m.v);
		Collections.sort(m.v, new DateComparator());
//		Collections.sort(m.v, new NameComparator());
		System.out.println(m.v);
//		if(e2.compareTo(e1) == 1){
//			System.out.println(e2);
//		}
//		else {
//			System.out.println(e1);
//		}
//		if(m1.compareTo(m) == 1) {
//			System.out.println(m1);
//		}
//		else {
//			System.out.println(m);
//		}
	}

}
