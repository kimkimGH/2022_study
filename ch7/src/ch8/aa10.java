package ch8;
//�������̽��� ����
interface fightable{
	public void move(int x,int y);
	public void attack(unit u);
}
class fight implements fightable{//�����信������� implements Ŭ���� ����� extends 
	public void move(int x,int y) {System.out.println("move");}
	public void attack(unit u) {System.out.println("attack");}
}
public class aa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
