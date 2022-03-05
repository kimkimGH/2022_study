package ch10;

public class TryANDcatch {

	public static void main(String[] args) {
		 System.out.println(1);
	      System.out.println(2);
	      try {

	         System.out.println(3);
	         System.out.println(0/0); //오류발견
	         System.out.println(4); //9번라인에서 오류를 발견해서 10번은 실행되지않는다
	      }catch(ArithmeticException a) { //연산오류
	         if(a instanceof ArithmeticException) //instanceof연산자사용
	            System.out.println("true");
	         System.out.println("ArithmeticException");
	      }
	      catch(ArrayIndexOutOfBoundsException ar) {//배열오류
	         
	         
	         
	         if(ar instanceof ArrayIndexOutOfBoundsException) 
	            System.out.println("ArrayIndexOutOfBoundsException");
	      }
	      catch(Exception e) { //오류의최고조상 모든예외처리가능(마지막에 사용)
	         System.out.println("Exception");
	      } // try-catch의 끝

	      System.out.println(6);
	      //main메서드의 끝
	   }

	
	}


