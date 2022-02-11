package ch7;

class Data{
	int x;
	int y;
	Data(){}
	Data(int x,int y){
		this.x=x;
		this.y=y;
		
	}
}

public class bbbb {

	public static void main(String[] args) {
		Data d=new Data(1,2);
		System.out.println(d.x);
		System.out.println(d.y);
	}

}
