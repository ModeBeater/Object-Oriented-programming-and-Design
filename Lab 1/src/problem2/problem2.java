package problem2;
public class problem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Konoha.missions);
		Konoha Anbu = new Konoha("Itachi");
		System.out.println(Konoha.missions);
		Konoha.Team7 Yamato = Konoha.Team7.NARUTO;
		System.out.println(Yamato);
		//enums.population = 10; // final нельзя изменить, здесь будет ошибка
		for(Konoha.Team7 Kakashi : Konoha.Team7.values()) {
			System.out.println(Kakashi);
		}
		Konoha.SumOfMissions(3, 3);
		Konoha.SumOfMissions(3.5,5.6);
		Anbu.getName();
	}

}
