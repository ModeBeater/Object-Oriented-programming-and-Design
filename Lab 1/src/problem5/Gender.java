package problem5;

public class Gender {
	static char first;
	static char second;
	Gender(char gen){
		BG(gen);
	}
	public boolean BG(char gen) {
		if(first == 'B' && gen == 'G') {
			return true;
		}
		else {
			first = gen;
			return false;
		}
	}
}
