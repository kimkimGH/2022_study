package ch2;

import ch1.eee;

class ff extends eee{ //import해주기
	public void printMembers() {
	//	System.out.println(x); 같은클래스만 가능
	//	System.out.println(z); 같은클래스랑 같은패키지만가능
		System.out.println(q); //자손이라서 가능
		System.out.println(w);
	}
}

public class aaa {

	public static void main(String[] args) {
		eee q=new eee();
//		System.out.println(q.x); 에러
//		System.out.println(q.z); 에러
//		System.out.println(q.q); 에러 
		System.out.println(q.w); //가능
		
		
	}

}
