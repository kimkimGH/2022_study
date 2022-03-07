package ch10;

import java.util.Calendar;

class A{
   public static String toString(Calendar date) {
      return date.get(Calendar.YEAR)+"년"+ date.get(Calendar.MONTH)+"월"+
            date.get(Calendar.DATE)+"일";
   } 
}
public class Calendar2 {
   public static void main(String[] args) {

      

      //      add()는 특정필드의 값을 증가또는 감소(다른필드에 영향ㅇ)
      Calendar date =Calendar.getInstance();
      date.clear();//필드초기화
      date.set(1111,1,1); //2022/3/7로 초기화
      System.out.println(A.toString(date));
      

      date.add(Calendar.DATE,1); //날짜(Date)에1을 더한다.
      date.add(Calendar.MONDAY,-7); //월(Date)에-7을 뺀다.
      System.out.println("add사용:"+A.toString(date));
      //      roll()는 특정필드의 값을 증가또는 감소 (다른필드에 영향x)
      date.roll(Calendar.DATE,4);
      date.roll(Calendar.MONDAY,-7);
      System.out.println("roll사용:"+A.toString(date));
   }
}