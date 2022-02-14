package ch8;
		//instanceof¿¬»êÀÚ
class car55{
	String color;
	int door;
	void go() {System.out.println("go");}
	void stop() {System.out.println("stop");}
}
class box55 extends car55{
	void move() {System.out.println("move");}
	
}
class bus55 extends car55{
	void water() {System.out.println("water");}
	void dowork(car55 c) {
		if(c instanceof bus55) {
			bus55 b=(bus55)c;
			b.water();
		}
	}
}
public class aa4 {

	public static void main(String[] args) {
		
		
	}

}
