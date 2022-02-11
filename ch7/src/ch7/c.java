package ch7;
		//상속
class Parent{
	int age;	//멤버1개
}
//상속은 단일상속만 가능함 다중상속은 불가능(c++은가능)
class child extends Parent{//child멤버는2개
	void play() {System.out.println("놀자");}//새로운 멤버추가
}
//부모의 멤버가 변하면 자식에게도 영향이 있음 
public class c {

	public static void main(String[] args) {

	}

}
