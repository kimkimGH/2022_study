package study;

public class q1 {
			//ch5-15 String의 주요 매서드
	public static void main(String[] args) {
		String s="abcde";
		char q=s.charAt(1); //문자열에서 문자하나를 지정하고싶을때 .charAt() ()에는 index번호입력, 문자열에서문자로 
		System.out.println(q);
		String w=s.substring(0,3); // 문자열에서 문자여러개를 지정하고싶을땐 .subString(n,n) 마지막숫자는 포함하지않는다
		String e=s.substring(1); // ()안에 숫자하나만 지정시 그숫자부터 끝까지 나온다
		System.out.println(w); 
		System.out.println(e);
	}

}