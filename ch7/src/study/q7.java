package study;

class Data{int x;}

public class q7 {
			//참조형 매개변수 참조형은 값을 변정할수 있다
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.println("main x="+d.x);

		change(d); 
		System.out.println("main x="+d.x);
		
	}
	
	
	//주소값전체를 복사
	static void change(Data s) {//변수를 바꾸는것이 아니라 Data d의 전체값을 변경한다? void는 retrun값 생략가능
		s.x=1000;
		System.out.println("change x="+s.x);
	}
	
	
	
}