package ch8;
//���� ������ ��ü�� �迭�� �ٷ��
class product2{
	int price;
	int bonusPoint;
	product2(int price){
		this.price=price;
		this.bonusPoint=(int)(price/10.0);
	}
	product2(){}
}
class Tv77 extends product2{
	Tv77(){super(100);}
	public String toString() {return "Tv";}
}
class Computer77 extends product2{
	Computer77(){super(100);}
	public String toString() {return "computer";}
}
class Audio77 extends product2{
	Audio77(){super(100);}
	public String toString() {return "Audoi";}
}
class buyer2{
	int money=1000;
	int bonusPoint;
	product2[] cart =new product2[10];
	int i=0;
	void buy(product2 p) {
		if(money<p.price){
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		money -=p.price;
		bonusPoint +=p.bonusPoint;
		cart[i++]=p;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	void summary() {
		int sum=0;
		String itemList="";
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) {break;}
			sum+=cart[i].price;
			itemList+=cart[i]+",";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��"+itemList+"�Դϴ�.");
	}
}
public class aa6 {

	public static void main(String[] args) {	
		buyer2 b=new buyer2();
		b.buy(new Tv77());
		b.buy(new Computer77());
		b.buy(new Audio77());
		b.summary();
	}

}
