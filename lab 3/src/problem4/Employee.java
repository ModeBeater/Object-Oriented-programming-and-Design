package problem4;

import java.util.Date;

public class Employee extends Person implements Comparable,Cloneable {
	double salary;
	Date hireDate;
	String insuranceNumber;
	public Employee(String name,double salary,Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Employee e = (Employee) o;
		return this.salary == e.salary && this.hireDate == e.hireDate && this.insuranceNumber == e.insuranceNumber;
	}
	public String toString() {
		return super.toString() + " Salary: " + salary + ", hireDate: " + hireDate + ", insurance number: " + insuranceNumber + ".";
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if(this.salary > e.salary) {
			return 1;
		}
		if(this.salary < e.salary) {
			return -1;
		}
		return 0;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.hireDate = (Date)hireDate.clone();
		return e;
	}
}
