package problem1;
public class Cat extends Animal{
	int numOfCats;
	
	public Cat() {
		super();
		numOfCats = 0;
	}
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public String voice() {
		return "meow";
	}
	
	
}
