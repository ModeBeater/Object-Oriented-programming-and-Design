package problem5;

public class Person {
	static int cnt = 0;
	public String toString() {
		int ans = cnt * 2;
		DragonLaunch line = new DragonLaunch();
		return "Dragon has some escapers! a line " + line + " leaves " + Integer.toString(ans) + " persons for a launch. So he didn't eat.";
	}
}
