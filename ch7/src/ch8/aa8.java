package ch8;
abstract class unit{
	int x,y;
	abstract void move(int x,int y);
	void stop() {System.out.println("stop");}
}
class Marine extends unit{
	void move(int x,int y) {System.out.println("º´»ç"+"x="+x+"y="+y);}
	void stimpack() {System.out.println("½ºÆÀÆÑ");}
}
class tank extends unit{
	void move(int x,int y) {System.out.println("ÅÊÅ©"+"x="+x+"y="+y);}
	void change() {System.out.println("ÃæÀü");}
}
class dropship extends unit{
	void move(int x,int y) {System.out.println("¼ö¼Û±â"+"x="+x+"y="+y);}
	void drop() {System.out.println("drop");}
}
public class aa8 {

	public static void main(String[] args) {
		unit[] g={new Marine(),new tank(),new dropship()};
		for(int i=0;i<=g.length;i++) {
			g[i].move(100,200);
		}
//		unit[] g=new unit[3];
//		g[0]=new Marine();
//		g[1]=new tank();
//		g[2]=new dropship();
//		g[0].move(111, 222);
//		g[1].move(111, 222);
//		g[2].move(111, 222);
	}

}
