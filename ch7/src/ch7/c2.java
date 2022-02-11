package ch7;
			//포함
class Point{int x; int y;}

class circle{
	Point c=new Point();//참조변수의 초기화
	int r;
}


public class c2 {
	public static void main(String[] args) {
		circle q=new circle(); //객체만들어 사용할것 /nell로 지정하면 주소값없어서 iv를 만들수 없음
		q.c.y=2;
		q.r=3;
		System.out.println(q.c.x);
		System.out.println(q.c.y);
		System.out.println(q.r);
	}

}
