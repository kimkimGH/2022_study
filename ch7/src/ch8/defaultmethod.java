package ch8;
// 디폴트메서드
class Myclass{
	int x,y;
	void method() {System.out.println("Myclass");}
}
interface MyI{
	void method(Myclass c);
	default void add() {System.out.println("add");} //디폴트 메서드 
}
class CC extends Myclass implements MyI{
	public void method(Myclass c) {System.out.println("interface MyI");}
	
}
public class defaultmethod {

	public static void main(String[] args) {
		CC c=new CC();
		c.method();
		c.add();
		
	}

}
