package ch7;

class Point5 extends Object{
	int x;
	int y;
	
	Point5(int x,int y){
		
		this.x=x;
		this.y=y;
	}
	public String tostring() {
		return "x:"+x+",y:"+y;
	}
}


public class c5 {

	public static void main(String[] args) {
		Point5 q=new Point5(5,4);
		System.out.println(q.tostring());
		System.out.println(q);
	}

}
