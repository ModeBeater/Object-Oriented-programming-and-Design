package problem5;

public class Chocolate extends sort implements Comparable<Chocolate>{
	double weight;
	String name;
	public Chocolate(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	public String toString() {
		return name + ", weight: " + weight;
	}
	@Override
	public int compareTo(Chocolate o) {
		if(this.weight > o.weight) {
			return 1;
		}
		if(this.weight < o.weight) {
			return -1;
		}
		return 0;
	}
}
