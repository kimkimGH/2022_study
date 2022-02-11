package study;

public class q3 {
	public static void main(String[] args) {
		Tv t;//Tv인스턴스를 참조하기 위한 변수t선언
		t=new Tv();//Tv인스턴스를 생성  
//		Tv t=new Tv(); 줄여쓸수 있음
		t.channel=7;//Tv인스턴스 멤보변수channel의 값을7로지정
		t.channelDown();//Tv인스턴스의 메서드channelDown()을 호출
		System.out.println("현재 Tv의 채널은"+t.channel+"입니다.");
	}
}
class Tv {
	//Tv의 속성(멤버변수)
	String color; //색상
	boolean power; //전원상태
	int channel; //채널

	void power() {power =!power;} //Tv를 on/off
	void channelup() {++channel;} //Tv의 채널을 높이는기능
	void channelDown() {--channel;}//Tv의 채널을 낮추는기능

}