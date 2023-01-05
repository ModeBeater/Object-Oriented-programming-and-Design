package problem5;

public class DragonLaunch {
	static int escaped = 0;
	private String persons = "";
	public void kidnap(char gen) {
		Gender check = new Gender(gen);
		if(check.BG(gen) == true) {
			escaped = 1;
			Person.cnt++;
		}
		this.persons += gen;
	}
	public boolean willDragonEatOrNot() {
		if(escaped == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getPersons() {
		return persons;
	}
	public String toString() {
		return getPersons();
	}
}
