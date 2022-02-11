package study;

class car{
	String color;
	String gearType;
	int door;
	car(){
		this("red","auto",4);
	}
	car(String color){
		this(color,"auto",4);
	}
	car(String color,String gearType,int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
		
	}
	//Static메서드는 iv사용불가 Static은 객체 생성없이 호출하기때문에 사용불가
}


public class q12 {

	public static void main(String[] args) {

	}

}