package Test;
//인터페이스의장점
class A{
	void method(I i) {
		i.method();
	}
}
interface I{void method();}
class B implements I{
	public void method() {System.out.println("B의매서드");}
}

class C implements I{
	public void method() {System.out.println("C의매서드");}
}
public class Test5 {

	public static void main(String[] args) {
		A a=new A();
		a.method(new C());
	}

}
