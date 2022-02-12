package ch8;
class car{
	private String color; //private 
	private String door;  //private 
	void drive() {System.out.println("drive~~~");}
	void stop() {System.out.println("stop!!!");}
}
class FireEngine extends car{
	void water() {System.out.println("water~~~");}
}
class Amb extends car{
	void go() {System.out.println("go~~");}
}
public class aa1 {

	public static void main(String[] args) {
		FireEngine f=new FireEngine();
		car c=f; // 인스턴스가 감소할땐(car)생략가능
		FireEngine f1=(FireEngine)c; //인스턴스가 증가할땐(FireEngine)생략불가능
		//			Amb a=(FireEngine)f; 상속관계가 아닌 클래스 간의 형변환은 불가능
	}

}
