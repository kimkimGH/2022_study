package study;
		//static메서드(클래스메서드)/인스턴스메서드
class Math1{
	
	static int add(int x,int y){
		return x+y;
	}

	int x;
	int y;
	
	int add(){return x+y;}
}

public class q13 {

	public static void main(String[] args) {
	
		System.out.println(Math1.add(1,2));
		System.out.println();
		
		Math1 m=new Math1();
		m.x=1;
		m.y=2;
		System.out.println(m.add());
		
		
	}
	
}