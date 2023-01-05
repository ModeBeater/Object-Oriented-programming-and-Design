package problem2;

public class Student extends Person{
	String program;
	int year;
	double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		setProgram(program);
		setYear(year);
		setFee(fee);
	}
	public String getProgram() {
		return this.program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return this.fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString() {
		return getName() + " " + getAddress() + " " + getProgram() + " " + Integer.toString(getYear()) + " " + Double.toString(getFee());
	}
	
}
