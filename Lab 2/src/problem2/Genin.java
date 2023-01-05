package problem2;

import java.util.Objects;

public class Genin extends Ninja{

	public Genin(String name,int numOfMissions) {
		super(name,numOfMissions);
	}
	@Override 
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Genin g = (Genin) o;
		return this.getClass().getSimpleName() == g.getClass().getSimpleName();
	}
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(getClass().getSimpleName());
	}
	@Override
	public String toString() {
		return super.toString() + "His rank is " + getClass().getSimpleName();
	}
}
