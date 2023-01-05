package problem5;

import java.util.Date;

public class Employee implements Comparable<Employee>,Cloneable {
	double salary;
	String name;
	Date hireDate;
	String insuranceNumber;
	public Employee(String name,double salary,Date hireDate, String insuranceNumber) {
		this.name = name;
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
		return "Name: " + this.name + " Salary: " + salary + ", hireDate: " + hireDate + ", insurance number: " + insuranceNumber + ".";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.hireDate = (Date)hireDate.clone();
		return e;
	}
	@Override
	public int compareTo(Employee e) {
		if(this.salary > e.salary) {
			return 1;
		}
		if(this.salary < e.salary) {
			return -1;
		}
		return 0;
	}
}