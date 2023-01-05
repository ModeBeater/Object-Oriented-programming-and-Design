package problem5;

import java.util.Scanner;

public class GetData {
	Scanner in = new Scanner(System.in);
	Resistor res = new Resistor();
	private Circuit a = new Resistor();
	private Circuit b = new Resistor();
	public GetData() {
		setData();
	}
	public void setData() {
		System.out.println("Add resistor, series or parallel?");
		String check = in.next();
		System.out.println("Input name");
		String name = in.next();
		if(check.equals("resistor")) {
			System.out.println("Input resistance and voltage");
			double resistance = in.nextDouble();
			double voltage = in.nextDouble();
			Circuit a = new Resistor(resistance,name);
			a.applyPotentialDiff(voltage);
			Resistor.v.add(a);
		}
		if(check.equals("series") || check.equals("parallel")) {
			System.out.println("Input first resistor and second resistor");
			String first = in.next();
			String second = in.next();
			for(int i = 0; i < Resistor.v.size(); i++) {
				if(Resistor.v.get(i).getName().equals(first)) {
					a = Resistor.v.get(i);
				}
				if(Resistor.v.get(i).getName().equals(second)) {
					b = Resistor.v.get(i);
				}
			}
			if(check.equals("series")) {
				Circuit d = new Series(a,b,name);
				d.applyPotentialDiff(a.getPotentialDiff() + b.getPotentialDiff());
				Resistor.v.add(d);
			}
			if(check.equals("parallel")) {
				Circuit d = new Parallel(a,b,name);
				d.applyPotentialDiff(a.getPotentialDiff());
				Resistor.v.add(d);
			}
		}
	}
	public static void getAns() {
		for(int i = 0; i < Resistor.v.size(); i++) {
			System.out.println(Resistor.v.get(i));
		}
		System.out.println("Resistance of Circuit " + Resistor.v.get(Resistor.v.size() - 1).getResistance());
		System.out.println("Power of Circuit " + Resistor.v.get(Resistor.v.size() - 1).getPower());
		System.out.println("Current of Circuit " + Resistor.v.get(Resistor.v.size() - 1).getCurrent());
	}
}
