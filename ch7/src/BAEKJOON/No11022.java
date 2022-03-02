package BAEKJOON;
import java.util.Scanner;
public class No11022 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d%n",i,x,y,x+y);
		}
	}
}
