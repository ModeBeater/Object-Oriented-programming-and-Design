package problem1;

public abstract class Shape {
	public abstract double volume();
	public abstract double surfaceArea();
	public String toString() {
		return "Volume is "+ volume();
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o.getClass() != this.getClass()) {
			return false;
		}
		Shape s = (Shape) o;
		return s.volume() == this.volume();
	}
}
