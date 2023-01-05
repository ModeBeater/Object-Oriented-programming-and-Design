package problem3Cor;

public class Rock extends Piece {
	public Rock(Position a) {
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) {
		if(super.equals((Object)b)) {
			return false;
		}
		if(equalityFirst(b.getFirst()) || equalitySecond(b.getSecond())) {
			return true;
		}
		else return false;
	}
}
