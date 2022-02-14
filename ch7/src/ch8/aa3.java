package ch8;
class car44{
	String color;
	int door;
	void go() {System.out.println("go");}
	void stop() {System.out.println("stop");}
}
class bus extends car44{
	void water() {System.out.println("water");}
}
public class aa3 {

	public static void main(String[] args) {
		car44 c=new car44();
		bus b=(bus)c;
		b.water(); //객체가 car44 이므로 water사용불가 

	}

}
