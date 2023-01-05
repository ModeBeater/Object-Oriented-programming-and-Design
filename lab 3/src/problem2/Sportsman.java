package problem2;

public class Sportsman implements Runable{
	int pos;
	public Sportsman(int pos) {
		this.pos = pos;
	}
	@Override
	public void move(int x) {
		pos += x;
		if(possible(x)) {
			System.out.println("He is running");
		}
		else if(x >= moving){
			System.out.println("He is moving");
		}
	}
	@Override
	public boolean possible(int x) {
		if(x > run){
			return true;
		}
		return false;
	}
	
}
