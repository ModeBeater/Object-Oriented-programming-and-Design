package problem2;

import java.util.Objects;

public class Chunin extends Ninja{
	public Chunin(String name,int numOfMissions) {
		super(name,numOfMissions);
	}
	@Override 
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Chunin g = (Chunin) o;
		return this.getClass().getSimpleName() == g.getClass().getSimpleName();
	}
	
	@Override
	public String toString() {
		return super.toString() + "His rank is " + getClass().getSimpleName();
	}
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(getClass().getSimpleName());
	}
	public boolean getMissionRankS() {
		if(getNumOfMissions() > 15) {
			return true;
		}
		else {
			return false;
		}
	}
}
