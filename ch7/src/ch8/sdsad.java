package ch8;
class a{
	int x,y;
	void stop() {System.out.println("stop");}
}
abstract interface c{
	void what();
}
class b extends a implements c{
	void go() {System.out.println("go");}
	public void what() {System.out.println("what");}
}
public class sdsad {

	public static void main(String[] args) {
		a a=new b();
	}

}
