package Test;
//�������̽�������
class A{
	void method(I i) {
		i.method();
	}
}
interface I{void method();}
class B implements I{
	public void method() {System.out.println("B�Ǹż���");}
}

class C implements I{
	public void method() {System.out.println("C�Ǹż���");}
}
public class Test5 {

	public static void main(String[] args) {
		A a=new A();
		a.method(new C());
	}

}
