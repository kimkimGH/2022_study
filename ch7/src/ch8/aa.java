package ch8;
class Tv33{int x,y,z;}
class SmartTv33 extends Tv33{int a,s;}
public class aa {

	public static void main(String[] args) {
		Tv33 t=new SmartTv33();//조상타입참조 변수로 자손타입객체를 다루는것(다형성)허용
//		Tv33 t=SmartTv33();
//		SmartTv33 v=new Tv33(); 에러 허용안됨 
//		SmartTv33 s=new SmartTv33(); //참조변수와 인스턴스의 타입일치 (가능)
//		Tv33 t=new SmartTv33(); //조상타입참조변수와 자손타입인스턴스참조 (가능)
	
	
	}

}
