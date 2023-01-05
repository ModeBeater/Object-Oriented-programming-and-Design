package problem1;

public abstract class Teacher {
	public abstract void setMark(Student s);
	int salary;
	Teacher(){
		
	}
	public void teach() {
		System.out.print("teaching");
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
