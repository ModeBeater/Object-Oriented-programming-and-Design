package problem2;

public class Konoha {
	public enum Team7{
		NARUTO,
		SASUKE,
		SAKURA
	}
	final static int population = 10000;
	static int missions = 0;
	
	private String ninjaName;// readonly
	public Konoha() {
		missions++;
	}
	public Konoha(String ninjaName){
		this(); // calling the constructor above
		this.ninjaName = ninjaName; // this. - calling the variable
	}
	public final void getName(){
		System.out.println(ninjaName);
	}// to this readonly
	{//block
		missions++;
	}
	static int SumOfMissions(int a, int b) {
		return a + b;//overloading methods
	}
	static double SumOfMissions(double a, double b) {
		return a + b;//overloading methods
	}
}