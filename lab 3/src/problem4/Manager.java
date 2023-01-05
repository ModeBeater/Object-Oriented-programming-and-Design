package problem4;

import java.util.Date;
import java.util.Vector;
public class Manager extends Employee implements Comparable,Cloneable{
	Vector<Employee> v = new Vector<Employee>();
	double bonus = 1000;
	NameComparator n = new NameComparator();
	DateComparator d = new DateComparator();
	public Manager(String name,double salary,Date hireDate, String insuranceNumber,double bonus)  {
		super(name,salary,hireDate,insuranceNumber);
		this.bonus = bonus;
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Manager m = (Manager) o;
		return this.bonus == m.bonus;
	}
	@Override 
	public String toString() {
		return super.toString() + "Bonus: " + bonus;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		m.hireDate = (Date)hireDate.clone();
		return m;
	}
	@Override
	public int compareTo(Object o) {
		if(super.compareTo(o) == 0) {
			Manager m = (Manager) o;
			if(this.bonus > m.bonus) {
				return 1;
			}
			if(this.bonus < m.bonus) {
				return -1;
			}
			return 0;
		}
		
		return super.compareTo(o);
		
	}
}

