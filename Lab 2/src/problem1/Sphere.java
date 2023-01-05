package problem1;

public class Sphere extends Shape {
	private double radius;
	public Sphere() {
		
	}
	public Sphere(double radius) {
		setRadius(radius);
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	@Override
	public double volume() {
		return (4/3) * Math.PI * (getRadius() * getRadius() * getRadius());
	}

	@Override
	public double surfaceArea() {
		return 4 * Math.PI * getRadius() * getRadius();
	}

}
