package ch7;
							//오버라이딩
class Point1 {//2차원좌표
	int x;
	int y;
	String getLocation() {//getLocation변수들을 문자로 나타낼수 있음
		return "x:"+x+",y:"+y;
	}
}	
class Point3d extends Point1{//3차원좌표
	int z;

	String getLocation() {//오버라이딩(내용만 변경가능,선언부 변경불가)
		return "x:"+x+",y:"+y+",z:"+z;
	}
}
public class c3 {

	public static void main(String[] args) {
		Point3d w=new Point3d();
		w.x=1;
		w.y=2;
		w.z=3;
		System.out.println(w.getLocation());
	}

}
