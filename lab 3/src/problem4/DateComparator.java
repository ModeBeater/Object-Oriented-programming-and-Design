package problem4;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.hireDate.compareTo(e2.hireDate);
	}
}