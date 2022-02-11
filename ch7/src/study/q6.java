package study;

public class q6 {

	public static void main(String[] args) {
		Math m=new Math();
		int i=m.add(2,5);
		int q=m.b(5,4);
		int w=m.c(5,4);
		int r=m.d(5,4);
		int f=m.s(4,6);
		m.gugudan(11);
		
		System.out.println(i);
		System.out.println(q);
		System.out.println(w);
		System.out.println(r);
		System.out.println(f);

	}

}

class Math{
	int add(int x,int y) {return x+y;} //매서드는 calss영역에만 정의가능 ,매서드란? {} 
	int b(int x,int y) {return x-y;}
	int c(int x,int y) {return x*y;}
	int d(int x,int y) {return x/y;}
	int s(int x,int y) {	//int s(int x,int y){if(x<y) return y; else return x;} 이렇게도 사용가능
		if(!(x<y)) //if문 쓸때 반환값을 true값이랑false값둘다 설정하지 else설정안할시 오류/ !사용하면 큰값이아닌 작은값이나옴
			return y;
		else 
			return x;
	}
	void gugudan(int dan) { //void 로 시작한다마지막에 return 생략가능,void가 아니면 반드시 retrun사용
		if(!(2<=dan && dan<=9))//값이 2~9가아니면 return실행
			return;
			for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);
					
		}
	}

	
	
	
	
	
}