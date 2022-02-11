package ch7;

class Tv{
	boolean power;	//전원
	int channel;	//채널
	
	void power() {power=!power;}	//전원on/off
	void channelUp() {channel++;}	//채널up
	void channelDown() {channel--;} //채널 Down
}

class SmartTv extends Tv{	//Tv로부터 iv와 메서드를 상속받음 
	boolean caption;
	void displayCaption(String text) {
		if(caption)
			System.out.println(text);
	}
	
}

public class c1 {

	public static void main(String[] args) {
		SmartTv st=new SmartTv();
		st.channel=7;	//Tv에게 상속을 받았기 때문에 사용가능 
		st.channelDown();//Tv에게 상속받은 메서드
		st.power();// Tv on
		st.power();// Tv off
		System.out.println(st.power);
		System.out.println(st.channel);
		
	}

}
