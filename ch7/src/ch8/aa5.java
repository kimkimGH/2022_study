package ch8;
//�ŰԺ���������
class product{
	int price; //��ǰ�ǰ���
	int bonusPoint;//��ǰ���Ž� �����ϴ� ���ʽ�����
	product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);//���ʽ������� ��ǰ������10%
	}
}
class Tv6 extends product{
	Tv6(){
		//����Ŭ������ ������ product(int price)�� ȣ���Ѵ�.
		super(100);//Tv�ǰ����� 100���������Ѵ�.
	}
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
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
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
}
public class aa5 {

	public static void main(String[] args) {
		buyer b=new buyer();
		b.buy(new Tv6()); //buy(product p)ȣ��
		b.buy(new Computer6());//buy(product p)ȣ��
		System.out.println("���� ���� ����"+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ�������"+b.bonusPoint+"���Դϴ�.");
	}

}
