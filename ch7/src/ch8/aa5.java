package ch8;
//매게변수다형성
class product{
	int price; //제품의가격
	int bonusPoint;//제품구매시 제공하는 보너스점수
	product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);//보너스점수는 제품가격의10%
	}
}
class Tv6 extends product{
	Tv6(){
		//조상클래스의 생성자 product(int price)를 호출한다.
		super(100);//Tv의가격을 100만원으로한다.
	}
	//Object클래스의 toString()을 오버라이딩한다.
	public String toString() {return "Tv";}
}
class Computer6 extends product{
	Computer6(){super(200);}
	public String toString() {return "computer";}
}
class buyer{
	int money=1000;
	int bonusPoint;
	void buy(product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"을/를 구매하셨습니다.");
	}
}
public class aa5 {

	public static void main(String[] args) {
		buyer b=new buyer();
		b.buy(new Tv6()); //buy(product p)호출
		b.buy(new Computer6());//buy(product p)호출
		System.out.println("현재 남은 돈은"+b.money+"만원입니다.");
		System.out.println("현재 보너스점수는"+b.bonusPoint+"점입니다.");
	}

}
