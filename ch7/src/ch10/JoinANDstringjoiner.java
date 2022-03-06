package ch10;

class join{
	   //숫자름 문자열로 바꾸는 방법
	   int i=100;
	   String str1=i+"";
	   void method() {
	      System.out.println(str1);
	      System.out.println(str1.getClass().getName());//타입확인
	      String str2=String.valueOf(i);
	      System.out.println(String.valueOf(i));
	      System.out.println(str2.getClass().getName());//타입확인
	      System.out.println();
	   }
	}
	class Strbuffer{// StringBuffer배열길이 변경가능,(동기화되어있다.)
	   void method() {
	      StringBuffer sb=new StringBuffer("abcd");
	      sb.append("123");
	      StringBuffer sb2=(StringBuffer)sb.append("456"); //다형성 
	      //배열추가append()
	      //delete(0,0) 삭제
	      System.out.println("sb: "+sb);
	      System.out.println("sb2: "+sb2);
	      System.out.println();
	   }
	}
	class Stringbuffer1{
	   void method() {
	      StringBuffer sb=new StringBuffer(123);
	      StringBuffer sb1=(StringBuffer)sb.append(456).append(78);
	      sb1.append(90);
	      System.out.println("'Stringbuffer1'sb="+sb);
	      System.out.println("'Stringbuffer1'sb1="+sb1);
	   }
	}
	public class JoinANDstringjoiner {

	   public static void main(String[] args) {
	      try {
	         join j=new join();
	         j.method();
	         //   System.out.println(j.method()); 프린트타입으로는 void타입호출불가능
	      }catch(Exception e) { //예외조상
	         e.printStackTrace();
	         e.getMessage();
	      }
	      Strbuffer sb=new Strbuffer();
	      sb.method();
	      Stringbuffer1 r=new Stringbuffer1();
	      r.method();
	   }
	}


