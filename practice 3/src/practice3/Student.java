package practice3;

public class Student {
	String name;
	private int grade;
	static int numOfStuds;
	public Student() {
		numOfStuds++;
	}
	public Student(int grade) {
		this();
		this.grade = grade;
	}
	public Student(int grade, String name) {
		this(grade);
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String toString() {
		return this.name + " "+this.getGrade();
	}
}
