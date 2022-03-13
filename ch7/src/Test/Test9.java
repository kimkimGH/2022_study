package Test;
import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num2=(int)(Math.random()*100);
       while(true){

           System.out.println("숫자를 입력하세요:");
           int ten=sc.nextInt();
           if(num2>ten){
               System.out.println("크다");
           }
           else if(num2<ten){
               System.out.println("작다.");
           }
           else if(num2==ten){
               System.out.println("정답");
           }
	}

}
}