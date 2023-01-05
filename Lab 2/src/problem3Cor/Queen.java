package problem3Cor;

public class Queen extends Piece{
	public Queen(Position a) { // Queen(Position a)
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) { // isLegalMove(Position b) s
		if(super.equals((Object)b)) {
			return false;
		}
		if(new Rock(getA()).isLegalMove(b) || new Bishop(getA()).isLegalMove(b)) {
			return true;
		}
		return false;
	}
	
}
