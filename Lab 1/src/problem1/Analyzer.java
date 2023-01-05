package problem1;

public class Analyzer {
	Data Juice;
	public Analyzer(Data Juice){
		this.Juice = Juice;
	}
	public String toString() {
		return "Average: " + Juice.getAvg() + "\nMaximum value: " + Juice.getMax();
	}
}
