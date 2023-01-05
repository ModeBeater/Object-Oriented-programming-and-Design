package problem2;
public abstract class Person {
	String name;
	String address;
	public Person(String name, String address) {
		this.name = name;
		setAddress(address);
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public String toString() {
		return this.name + " " + this.address;
	}
}
