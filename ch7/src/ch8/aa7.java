package ch8;
	//추상클래스(abstract class)
abstract class player{//추상 클래스(미완성클래스)
	abstract void play(int pos);//추상매서드
	abstract void stop();//추상매서드({}가없는 매서드,구현부없음)
}
class MyAudio extends player{
	void play(int pos) {System.out.println("paly");}
	void stop() {System.out.println("stop");}
}
public class aa7 {

	public static void main(String[] args) {
		//player p=new player(); 미완성클래스라서 객체생성불가능
		player p=new MyAudio();//다형성 /리모컨 타입에는 선언부만 있으면됨
		MyAudio a=new MyAudio();
		a.play(100);
		a.stop();
		p.play(50);
		p.stop();
	}

}
