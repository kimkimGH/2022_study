package ch8;
abstract class a3{
	int x,y;
	abstract void stop();
}
interface fightable3{
	void move(int x,int y);
}
class b3 extends a3 implements fightable3{
	void stop() {System.out.println("stop");}
	public void move(int x, int y) {System.out.println("x="+x+",y+y");}
	void attack() {System.out.println("attack");}
}
public class dwdwwd {

	public static void main(String[] args) {
		a3 a=new b3();
		a.stop();
		b3 b=(b3)a;
		b.attack();
		
	}

}
