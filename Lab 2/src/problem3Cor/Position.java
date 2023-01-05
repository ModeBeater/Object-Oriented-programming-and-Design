package problem3Cor;

public class Position{
	private String a;
	private int b;
	public Position(String a, int b) {
		setFirst(a);
		setSecond(b);
	}
	public void setFirst(String a) {
		this.a = a;
	}
	public void setSecond(int b) {
		this.b = b;
	}
	public char getFirst() {
		return this.a.charAt(0);
	}
	public int getSecond() {
		return this.b;
	}
}
