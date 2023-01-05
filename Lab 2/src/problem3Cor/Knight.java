package problem3Cor;

public class Knight extends Piece{
	
	
	public Knight(Position a) {
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) {
		if(super.equals((Object)b)) {
			return false;
		}
		if((getDiffA(b.getFirst()) == 1 && getDiffB(b.getSecond()) == 2) || (getDiffA(b.getFirst()) == 2 && getDiffB(b.getSecond()) == 1)) {
			return true;
		}
		return false;
	}
	
}
