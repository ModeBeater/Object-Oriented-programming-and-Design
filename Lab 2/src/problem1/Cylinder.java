package problem1;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	public Cylinder() {
		
	}
	public Cylinder(double radius,double height) {
		setRadius(radius);
		setHeight(height);
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getHeight() {
		return this.height;
	}
	@Override
	public double volume() {
		return Math.PI * getRadius() * getRadius() * getHeight();
	}
	@Override
	public double surfaceArea() {
		return 2 * Math.PI * getRadius() * (getHeight() + getRadius());
	}
}
