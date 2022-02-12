package ch8;
class car2{
	String color;
	String door;
	void drive() {System.out.println("drive");}
	void stop() {System.out.println("stop!!!");}
}
class FireEngine2 extends car2{
	void water() {System.out.println("water~~");}
}
public class aa2 {

	public static void main(String[] args) {
		car2 c=null;
		FireEngine2 f=new FireEngine2();
		FireEngine2 f2=null;
		f.water();
		c=f;//기능감소할땐 (car)생략가능
//		c.water(); car클래스에 없는 기능은 사용할수 없음
		f2=(FireEngine2)c;//기능이 증가할땐(FireEngine2)생략 불가능
		f2.water(); //참조변수가 같아서 사용가능
	}

}
