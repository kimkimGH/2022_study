package Test;

import java.util.Scanner;

public class Test8 {

   public static void main(String[] args) {
      System.out.println("����");
      while (true) {
         Scanner sc = new Scanner(System.in);
         double BMI = sc.nextDouble();
         if (BMI > 18.5) {
            if (BMI > 30) {
               System.out.println("��");
            } else if (BMI > 25) {
               System.out.println("�� ���豺");
            } else {
               System.out.println("���� ü��");
            }
         } else {
            if (BMI > 17) {
               System.out.println("��ü��");
            } else if (BMI > 16) {
               System.out.println("����");
            } else {
               System.out.println("������");
            }
         }
      }
   }
   // ������ ���� �Լ����������̽� ��Ʈ��
}