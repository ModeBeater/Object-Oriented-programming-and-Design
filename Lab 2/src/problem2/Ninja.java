package problem2;

import java.util.Objects;

public class Ninja {
	private String name;
	private int numOfMissions;
	public Ninja(String name,int numOfMissions) {
		this.numOfMissions = numOfMissions;
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		Ninja n = (Ninja) o;
		return this.numOfMissions == n.numOfMissions && this.getName().equals(n.getName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,numOfMissions);
	}
	public void increaseMissions(int cnt) {
		this.numOfMissions += cnt;
	}
	public int getNumOfMissions() {
		return this.numOfMissions;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return this.name + " had " + this.numOfMissions + " missions.";
	}
}
