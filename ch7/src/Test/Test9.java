package Test;
import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num2=(int)(Math.random()*100);
       while(true){

           System.out.println("���ڸ� �Է��ϼ���:");
           int ten=sc.nextInt();
           if(num2>ten){
               System.out.println("ũ��");
           }
           else if(num2<ten){
               System.out.println("�۴�.");
           }
           else if(num2==ten){
               System.out.println("����");
           }
	}

}
}