package ch10;

import java.util.Calendar;

class A{
   public static String toString(Calendar date) {
      return date.get(Calendar.YEAR)+"��"+ date.get(Calendar.MONTH)+"��"+
            date.get(Calendar.DATE)+"��";
   } 
}
public class Calendar2 {
   public static void main(String[] args) {

      

      //      add()�� Ư���ʵ��� ���� �����Ǵ� ����(�ٸ��ʵ忡 ���⤷)
      Calendar date =Calendar.getInstance();
      date.clear();//�ʵ��ʱ�ȭ
      date.set(1111,1,1); //2022/3/7�� �ʱ�ȭ
      System.out.println(A.toString(date));
      

      date.add(Calendar.DATE,1); //��¥(Date)��1�� ���Ѵ�.
      date.add(Calendar.MONDAY,-7); //��(Date)��-7�� ����.
      System.out.println("add���:"+A.toString(date));
      //      roll()�� Ư���ʵ��� ���� �����Ǵ� ���� (�ٸ��ʵ忡 ����x)
      date.roll(Calendar.DATE,4);
      date.roll(Calendar.MONDAY,-7);
      System.out.println("roll���:"+A.toString(date));
   }
}