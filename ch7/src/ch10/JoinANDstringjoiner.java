package ch10;

class join{
	   //���ڸ� ���ڿ��� �ٲٴ� ���
	   int i=100;
	   String str1=i+"";
	   void method() {
	      System.out.println(str1);
	      System.out.println(str1.getClass().getName());//Ÿ��Ȯ��
	      String str2=String.valueOf(i);
	      System.out.println(String.valueOf(i));
	      System.out.println(str2.getClass().getName());//Ÿ��Ȯ��
	      System.out.println();
	   }
	}
	class Strbuffer{// StringBuffer�迭���� ���氡��,(����ȭ�Ǿ��ִ�.)
	   void method() {
	      StringBuffer sb=new StringBuffer("abcd");
	      sb.append("123");
	      StringBuffer sb2=(StringBuffer)sb.append("456"); //������ 
	      //�迭�߰�append()
	      //delete(0,0) ����
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
	         //   System.out.println(j.method()); ����ƮŸ�����δ� voidŸ��ȣ��Ұ���
	      }catch(Exception e) { //��������
	         e.printStackTrace();
	         e.getMessage();
	      }
	      Strbuffer sb=new Strbuffer();
	      sb.method();
	      Stringbuffer1 r=new Stringbuffer1();
	      r.method();
	   }
	}


