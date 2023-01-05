package problem3Cor;

public class Bishop extends Piece{
	public Bishop(Position a) {
		super(a);
	}
	public boolean isLegalMove(Position b) {
		if(super.equals((Object)b)) {
			return false;
		}
		if(getDiffA(b.getFirst()) == getDiffB(b.getSecond())) {
			return true;
		}
		else return false;
	}
	
}
