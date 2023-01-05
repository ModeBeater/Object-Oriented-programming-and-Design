package problem1;

public class Data {
	private double sum;
	private double max;
	private int cnt;
	
	public Data() {
		this.sum = this.max = this.cnt = 0;
	}
	
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public int getCnt() {
		return cnt;
	}
	public double getAvg() {
		return sum / cnt;
	}
	
	public void addData(double x) {
//		if (this.max < x) {
//			this.max = x;
//		}
		this.max = Math.max(this.max, x);
		this.sum += x;
		this.cnt++;
		
	}
}
