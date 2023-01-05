package problem3Cor;
public class CreatePiece {

	public static void main(String[] args) {
		Bishop b = new Bishop(new Position("e",5));
		if(b.isLegalMove(new Position("c",3)) == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
//		Board d = new Board();
//		d.getBoard();
		b.print(new Position("c",3));
		Knight kn = new Knight(new Position("d",4));
		kn.print(new Position("e",2));
		Rock r = new Rock(new Position("d",4));
		r.print(new Position("d",4));
		King k = new King(new Position("d", 5));
		k.print(new Position("d",6));
		Pawn p = new Pawn(new Position("a",1));
		p.print(new Position("a",2));;
		Queen q = new Queen(new Position("b",2));
		q.print(new Position("d",4));
	}

}
