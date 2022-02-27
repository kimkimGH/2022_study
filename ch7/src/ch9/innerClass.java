package ch9;
//내부 클래스
class A{//외부클래스
	int i=1000;
	B b=new B();
	class B{//내부클래스
		void method() {System.out.println(i);}
	}
}
public class innerClass {

	public static void main(String[] args) {
		
		
	}

}
