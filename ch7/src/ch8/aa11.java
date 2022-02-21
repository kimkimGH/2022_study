package ch8;
//인터페이스를 이용한 다형성
abstract class unit2{
	int x,y;
	abstract void move(int x,int y);
	void stop() {System.out.println("stop");}
}
interface fightable2{
	void attack(); 
}
class fight2 extends unit2 implements fightable2{
	void move(int x,int y) {System.out.println("x="+x+",y="+y);}
	public void attack() {System.out.println("attack");} //오버라이딩규칙 조상보다 접근제어자가 범위가 좁으면 안된다.
	fightable2 getfightable2() {
		fight2 f=new fight2();
		return f;
	}
}
public class aa11 {

	public static void main(String[] args) {
		fight2 f1=new fight2();
		f1.getfightable2();
		fightable2 f3=(fightable2)f1;
		unit2 u=new fight2();
		u.move(122, 211);
		u.stop();
		fightable2 f=new fight2();
		f.attack();
		
	}

}
