package ch10;

public class TryANDcatch {

	public static void main(String[] args) {
		 System.out.println(1);
	      System.out.println(2);
	      try {

	         System.out.println(3);
	         System.out.println(0/0); //�����߰�
	         System.out.println(4); //9�����ο��� ������ �߰��ؼ� 10���� ��������ʴ´�
	      }catch(ArithmeticException a) { //�������
	         if(a instanceof ArithmeticException) //instanceof�����ڻ��
	            System.out.println("true");
	         System.out.println("ArithmeticException");
	      }
	      catch(ArrayIndexOutOfBoundsException ar) {//�迭����
	         
	         
	         
	         if(ar instanceof ArrayIndexOutOfBoundsException) 
	            System.out.println("ArrayIndexOutOfBoundsException");
	      }
	      catch(Exception e) { //�������ְ����� ��翹��ó������(�������� ���)
	         System.out.println("Exception");
	      } // try-catch�� ��

	      System.out.println(6);
	      //main�޼����� ��
	   }

	
	}


