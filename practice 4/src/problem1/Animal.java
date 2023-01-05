package problem1;

public abstract class Animal {
	private String name;
	public Animal() {
		name = "without name";
	}
	public Animal(String InitialName) {
		this.name = InitialName;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String voice(int n) {
		String ans = "";
		for(int i = 0; i < n; i++) {
			ans += voice() + " ";
		}
		return ans;
	}
	public String voice() {
		return "Not voice yet";
	}
}
