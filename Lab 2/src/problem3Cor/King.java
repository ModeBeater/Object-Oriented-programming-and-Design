package problem3Cor;

public class King extends Piece{
	public King(Position a) {
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) {
		if(getDiffA(b.getFirst()) <= 1 && getDiffB(b.getSecond()) <= 1){
			return true;
		}
		else return false;
	}

}
