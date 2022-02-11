package ch7;
//다형성
class Tv1111{
boolean power;
int channel;

void power() {power=!power;}
void channelup() {channel++;}
void channelDown() {channel--;}
}
class SmartTv1111 extends Tv1111{
String Text;
void caption() {}
}
public class c13 {

public static void main(String[] args) {
	//Tv1111 t1=SmartTv1111();
	//Tv1111 t=new SmartTv1111(); //조상타입참조 변수로 자손타입객체를 다루는것(다형성)허용
			//SmartTv1111 v=new Tv1111(); 에러 허용안됨 
//		SmartTv s=new SmartTv(); //참조변수와 인스턴스의 타입일치 (가능)
//		Tv1111 t=new SmartTv1111(); //조상타입참조변수와 자손타입인스턴스참조 (가능)
}

}
