package study;

class Card{
	String kind; //iv,문자열 String
	int number;	//iv,정수 int
	static int width=80;//cv,정수 
	static int height=100;//cv,정수
}

public class q5 {

	public static void main(String[] args) {
		System.out.println(Card.width);//cv라서 객체지정없이도 사용가능
		System.out.println(Card.height);//cv라서 객체지정없이도 사용가능
		
		Card c1=new Card();
		c1.kind="Heart";//문자표시
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="spade";//문자표시
		c2.number=8;
		System.out.println("카드의넓이:"+c1.width+"카드의높이"+c1.height+"카드의무늬:"+c1.kind+"숫자:"+c1.number);
		System.out.println("카드의넓이:"+c2.width+"카드의높이"+c2.height+"카드의무늬:"+c2.kind+"숫자:"+c2.number);
		Card.width=50; //c1.width=50; c1으로 사용해도 cv라서 전체적으로 변경된다,오해하기 쉬워서 cv로 사용한다.
		Card.height=70;
		System.out.println();
		System.out.println("카드의넓이:"+c1.width+"카드의높이"+c1.height+"카드의무늬:"+c1.kind+"숫자:"+c1.number);
		System.out.println("카드의넓이:"+c2.width+"카드의높이"+c2.height+"카드의무늬:"+c2.kind+"숫자:"+c2.number);
	}

}