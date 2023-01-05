package problem2;

public class Staff extends Person{
	String school;
	double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		setSchool(school);
		setPay(pay);
	}
	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return this.pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString() {
		return getName() + " " + getAddress() + " " + getSchool() + " " + Double.toString(getPay());
	}
}
