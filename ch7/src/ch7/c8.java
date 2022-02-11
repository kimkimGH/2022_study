package ch7;
			//super() 생성자
class point3 extends Object{
	int x,y;
	
	point3(int x,int y){
		super(); //super(),this()호출하기 기본생정자작성은 필수 
		this.x=x;
		this.y=y;
	}
}
class point3d2 extends point3{
	int z;
	point3d2(int x,int y,int z){
		super(x,y); //조상클래스 생성자point(int x,int y)를 호출 
		this.z=z; //자신의 멤버를 초기화
	}
	public String toString() {
		return "x:"+x+"y:"+y+"z:"+z;
	}
}
public class c8 {

	public static void main(String[] args) {
		point3d2 p=new point3d2(1,2,3);
		System.out.println(p.toString());
	}

}
