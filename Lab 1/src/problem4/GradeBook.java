package problem4;


import Test.Student;
public class GradeBook {
	private int grade;
	private String name;
	Student s = new Student();
	static double sum = 0;
	static int [] countOfMark = {0,0,0,0,0,0,0,0,0,0,0};
	public GradeBook() {
//		displayMessage();
	}
	public GradeBook(String name,int grade, int index) {
		setGrade(grade);
		setName(name);
		this.s = new Student(getGrade(),getName());
		countOfMark[index] += 1;
		sum += grade;
	}
	public Student getStudent() {
		return this.s;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
//	public void displayMessage() {
//		System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!\nPlease,input grades for students:");
//	}
	public String displayGradeReport() {
		return "Class average is " + Double.toString(determineClassAverage()) + ". " + s.Info();
	}
	public double determineClassAverage() {
		return sum / Student.numOfStuds;
	}
	public String counter(int i) {
		String ans = "";
		while(countOfMark[i] > 0) {
			ans += "* ";
			countOfMark[i]--;
		}
		return ans;
	}
	public String outputBarChart() {
		String ans = "";
		int i;
		for(i = 0; i < 10; i++) {
			ans += Integer.toString(i) + "0-" + Integer.toString(i) + "9: " + counter(i) + "\n";
		}
		ans += "100: " + counter(i);
		return ans;
	}
	public String toString() {
		return displayGradeReport() + outputBarChart();
	}
}
