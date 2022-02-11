package ch7;
		//참조변수 super
class parent2{int x=10;}//super/this 둘다사용가능 중복일땐 안됨

class child2 extends parent2{
	void method() {
		System.out.println("x=:"+x); //가까운쪽 x를 따라감
		System.out.println("this.x=:"+this.x);	//child에 x가 없기때문에 perent2쪽x를 따라감
		System.out.println("super.x=:"+super.x);//perent2쪽 x
	}
}

public class c7 {

	public static void main(String[] args) {
		child2 c=new child2();
		c.method();
	}

}
