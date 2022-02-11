package study;
	//카피형참조변수?
class Data3{int x;}

public class q10 {

	public static void main(String[] args) {
		Data3 d=new Data3();
		d.x=15;
		System.out.println("main"+d.x);
		Data3 d2=copy(d);//Data d2 먼저 생성됨 주위하기
		System.out.println("after copy:"+d2.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tem=new Data3();
		tem.x=d.x;
		System.out.println("copy:"+tem.x);
		return tem;
	}
}


// 매서드 뜻: add,random,round,print 같은것들 (기능)동사 
//메서드 이름이같다 :하는 작업이 같다. 같은 작업을 수행하는겨우 오버로딩
//생성자: iv초기화 매서드 
// 이름이 클래스 이름과 일치해야한다,리턴값이없다(void안붙임),모든 클래슨ㄴ 반드시 생성자를 가져야한다.