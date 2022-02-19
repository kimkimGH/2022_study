package Test;
abstract class unit{
	int x,y;
	abstract void move(int x,int y);
	abstract void stop();
}
class Marine extends unit{
	void move(int x,int y) {System.out.println("Marine:x="+x+",y="+y);}
	void stop() {System.out.println("stop");}
	void stimpack() {System.out.println("½ºÆÀÆÑ");}
	
}
class Tank extends unit{
	void move(int x,int y) {System.out.println("Tank:x="+x+",y="+y);}
	void stop() {System.out.println("stop");}
	void charge() {System.out.println("ÃæÀü");}
}
public class Test4 {

	public static void main(String[] args) {
		unit[] g= {new Marine(),new Tank()};
		for(int i=0;i<g.length;i++) {
			g[i].move(231, 321);
		}
		
		

	}

}
