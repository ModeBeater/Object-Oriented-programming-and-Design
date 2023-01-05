package problem5;


public abstract class Circuit {
	private double resistrance;
	public double getResistance() {
		return this.resistrance;
	}
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower() {
		return getPotentialDiff() * getPotentialDiff() / getResistance();
	}
	public double getCurrent() {
		return getPotentialDiff() / getResistance();
	}
	public String toString() {
		return "It's resistance is " + Double.toString(getResistance()) + " and it's potential diff is " + Double.toString(getPotentialDiff()) + ". It's Power is " + Double.toString(getPower()) + " and it's Current is " + Double.toString(getCurrent());
	}
}
