package problem1;

public class Cube extends Shape{
	private double side;
	public Cube() {
		
	}
	public Cube(double side) {
		setSide(side);
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return this.side;
	}
	@Override
	public double volume() {
		return getSide() * getSide() * getSide();
	}
	@Override
	public double surfaceArea() {
		return 6 * getSide() * getSide();
	}
	
}
