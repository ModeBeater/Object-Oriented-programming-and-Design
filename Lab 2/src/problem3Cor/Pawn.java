package problem3Cor;

public class Pawn extends Piece{
	public Pawn(Position a) {
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) {
		if(super.equals(b)) {
			return false;
		}
		if(getDiffB(b.getSecond()) == 1 && equalityFirst(b.getFirst())){
			return true;
		}
		else return false;
	}
	
}
