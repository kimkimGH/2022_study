package ch7;
		//캡슐화
class Time{
	private int hour; //Time클래스에서만 사용가능
	private int minute;//Time클래스에서만 사용가능
	private int second;//Time클래스에서만 사용가능
	
	public void sethour(int hour) {
		if(hour<0||hour>23) return;
		
		this.hour=hour;
	}
	
	public int gethour() {
		return hour;
	}
	
	
}
public class Timetest {

	public static void main(String[] args) {
		Time t=new Time();
		t.sethour(5);
		System.out.println(t.gethour());
		t.sethour(25);
		System.out.println(t.gethour());
		
	}

}
