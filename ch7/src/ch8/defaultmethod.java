package ch8;
// ����Ʈ�޼���
class Myclass{
	int x,y;
	void method() {System.out.println("Myclass");}
}
interface MyI{
	void method(Myclass c);
	default void add() {System.out.println("add");} //����Ʈ �޼��� 
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
