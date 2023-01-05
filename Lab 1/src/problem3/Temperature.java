package problem3;

public class Temperature {
	double t;
	String val = "C";
	private double degreesF;
	private double degreesC;
	private String temp;
	String toChar(String temp) {
//		System.out.println(temp.substring(temp.length() - 1));
		return val = temp.substring(temp.length() - 1);
	}
	double toDouble(String temp) {
		return Double.parseDouble(temp.substring((0), temp.length() - 1));
	}
	Temperature(){
		this.degreesC = 0;
		this.degreesF = 0;
	}
	Temperature(String temp){
		setTemp(temp);
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
		if(toChar(getTemp()).equals("C")) {
			setF();
		}
		else if(toChar(getTemp()).equals("F")) {
			setC();
		}

	}
	public void setF() {
		this.degreesC = toDouble(getTemp());
		this.degreesF = (9 * (this.degreesC / 5) + 32);
	}
	public void setC() {
		this.degreesF = toDouble(getTemp());
		this.degreesC = 5 * (this.degreesF - 32) / 9;
	}
	public double getF() {
		return degreesF;
	}
	public double getC() {
		return degreesC;
	}
	public String Fahr() {
//		System.out.println(String.valueOf(getC()));
		return String.valueOf(getF()) + "F";
	}
	public String Cel() {
		return String.valueOf(getC()) + "C";
	}
	public String getAns() {
		return String.valueOf(getF()) + "F\n" + String.valueOf(getC()) + "C";
	}
}
