package problem2;

import java.util.HashSet;

public class CreateNinja {

	public static void main(String[] args) {
		HashSet<Ninja> set = new HashSet<>();
		// TODO Auto-generated method stub
		Genin Naruto = new Genin("Naruto", 10);
		set.add(Naruto);
		Genin Sakura = new Genin("Sakura", 9);
		set.add(Sakura);
		Genin NarutoFalse = new Genin("Naruto", 10);
		set.add(NarutoFalse);
		Ninja Sasuke = new Chunin("Sasuke", 10); // Polymorphism
		if(Sasuke instanceof Chunin) {
			Chunin p = (Chunin) Sasuke;
			p.getMissionRankS();
		}
//		Sasuke.getMissionRankS(); //т.к. getMissionsRankS() хранится только в чунине а не в ниндзя
		System.out.println(Naruto);
		System.out.println(Sasuke);
		System.out.println(Naruto.hashCode());
		System.out.println(NarutoFalse.hashCode());
		System.out.println(Sakura.hashCode());
		if(Naruto.equals(NarutoFalse)) {
			System.out.println("YES");
		}
		for(Ninja std : set) {
			System.out.println(std.getName() + " " + std.getNumOfMissions());
		}
	}

}
