package problem5;

public class Parallel extends Circuit{
	private double resistance;
	private double potentialDiff;
	private String name;
	public Parallel() {
		
	}
	public Parallel(Circuit first, Circuit second,String name) {
		setResistance(first.getResistance(),second.getResistance());
		setName(name);
	}
	public void setResistance(double first, double second) {
		this.resistance = (first * second)/(first + second);
	}
	@Override
	public double getResistance() {
		return this.resistance;
	}
	@Override
	public double getPotentialDiff() {
		return this.potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return getName() + ": " + super.toString();
	}
}
