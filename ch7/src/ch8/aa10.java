package ch8;
//인터페이스의 구현
interface fightable{
	public void move(int x,int y);
	public void attack(unit u);
}
class fight implements fightable{//인터페에스상속은 implements 클래스 상속은 extends 
	public void move(int x,int y) {System.out.println("move");}
	public void attack(unit u) {System.out.println("attack");}
}
public class aa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
