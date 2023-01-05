package problem1;


public class Human extends Teacher implements SettingMark,SetMarkB{
	String name;
	public Human(String name) {
		this.name = name;
	}
	@Override
	public void setMark(Student s) {
		s.mark = 5;
	}
	@Override
	public void setMarkA(Student s) {
		s.mark = SettingMark.grade;
	}
	@Override
	public void setMarkB(Student s) {
		// TODO Auto-generated method stub
		s.mark = SetMarkB.grade;
	}
}
