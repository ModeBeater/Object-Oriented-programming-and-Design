package problem3Cor;

public abstract class Piece {
	private Position a;
	public abstract boolean isLegalMove(Position b);
	public Piece(Position a){
		this.a = a;
	}
	@Override
	public boolean equals(Object b) {
		Position p = (Position) b;
		if(this.getA().getFirst() == p.getFirst() && this.getA().getSecond() == p.getSecond()) {
			return true;
		}
		else return false;
	}
	public boolean equalityFirst(char a) {
		if(getA().getFirst() == a){
			return true;
		}
		else return false;
	}
	public boolean equalitySecond(int b) {
		if(getA().getSecond() == b){
			return true;
		}
		else return false;
	}
	public int getDiffA(char a){
		return Math.abs((int)getA().getFirst() - (int)a);
	}
	public int getDiffB(int b) {
		return Math.abs(getA().getSecond() - b);
	}
	public Position getA() {
		return a;
	}
	public void print(Position b) {
		if(isLegalMove(b) == true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
