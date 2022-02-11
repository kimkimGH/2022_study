package study;

class Data1{int x;}

public class q8 {
		//기본형 매개변수 기본형은 값을 읽기만 할수 있다
	public static void main(String[] args) {
		Data1 d=new Data1();
		d.x=11;
		System.out.println("main x="+d.x);
		
		change(d.x);
		System.out.println("after main x="+d.x);
	}
	static void change(int x) {
		x=100;
		System.out.println("change x="+x);
	}
}