package problem1;

import java.util.Scanner;

public class getData {
	Scanner in = new Scanner(System.in);
	private String shape;
	private double radius;
	private double height;
	String ans = "";
	public getData() {
		setData();
	}
	public void setData() {
		setShape(in.next());
		if(getShape().equals("Cylinder")) {
			setValues(in.nextDouble(), in.nextDouble());
			Cylinder object = new Cylinder(this.radius,this.height);
			ans = toString(object.volume(),object.surfaceArea());
		}
		else {
			setValues(in.nextDouble());
			if(getShape().equals("Cube")) {
				Cube object = new Cube(this.radius);
				ans = toString(object.volume(), object.surfaceArea());
			}
			if(getShape().equals("Sphere")) {
				Sphere object = new Sphere(this.radius);
				ans = toString(object.volume(), object.surfaceArea());
			}
		}
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getShape() {
		return this.shape;
	}
	public void setValues(double radius) {
		this.radius = radius;
	}
	public void setValues(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public String toString(double volume, double area) {
		return "Shape is " + getShape() + ". It's volume is " + volume + " and it's area is " + area;
	}
}
