package Test;
class product{
	int price;
	int BonusPoint;
	product(int price){
		this.price=price;
		this.BonusPoint=(int)(price/10.0);
	}
}
class Tv extends product{
	Tv(){super(100);}
	public String toString() {return "Tv";}
}
class Computer extends product{
	Computer(){super(100);}
	public String toString() {return "computer";}
}
class buyer{
	int money=1000;
	int Bonuspoint;
	void buy(product t) {
		if(money<t.price) {
			System.out.println("잔액이 부족합니다."); return;
		}
		money-=t.price;
		Bonuspoint+=t.BonusPoint;
		System.out.println(t+"을 구매하셨습니다.");
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		buyer b=new buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		System.out.println("남은 금액은"+b.money+"원입니다.");
		System.out.println("적립포인트는"+b.Bonuspoint+"점입니다.");
	}

}
