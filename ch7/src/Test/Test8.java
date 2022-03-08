package Test;

import java.util.Scanner;

public class Test8 {

   public static void main(String[] args) {
      System.out.println("실행");
      while (true) {
         Scanner sc = new Scanner(System.in);
         double BMI = sc.nextDouble();
         if (BMI > 18.5) {
            if (BMI > 30) {
               System.out.println("비만");
            } else if (BMI > 25) {
               System.out.println("비만 위험군");
            } else {
               System.out.println("보통 체중");
            }
         } else {
            if (BMI > 17) {
               System.out.println("저체중");
            } else if (BMI > 16) {
               System.out.println("마름");
            } else {
               System.out.println("깡마름");
            }
         }
      }
   }
   // 쓰레드 람다 함수형인터페이스 스트림
}