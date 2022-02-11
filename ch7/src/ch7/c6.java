package ch7;
			//참조변수 super
class parent1{
	int x=20; //super
}		//조상 멤버에는 super사용한다.
class child1 extends parent1{
	int x=30; //this
	void method() {
		System.out.println("x=:"+x); //가까운쪽(x)
		System.out.println("this.x=:"+this.x); //class child1
		System.out.println("sufer.x=:"+super.x); //class parent1
	}
}
public class c6 {

	public static void main(String[] args) {
		child1 c=new child1();
		c.method(); //child1에 있는 매서드 호출
	}

}
