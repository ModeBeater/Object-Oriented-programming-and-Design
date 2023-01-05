package problem5;

import java.util.Vector;

public class Resistor extends Circuit{

	private double resistance;
	private double potentialDiff;

	public Resistor() {
		
	}
	public Resistor(double resistance,String name) {
		setResistance(resistance);
		setName(name);
	}
	public void setResistance(double resistance) {
		this.resistance = resistance;
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
