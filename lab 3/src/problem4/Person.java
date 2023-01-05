package problem4;


public class Person {
	String name;
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) {
			return false;
		}
		Person p = (Person) o;
		return this.name == p.name;
	}
	public String toString() {
		return "Name:" + name + ".";
	}
}
