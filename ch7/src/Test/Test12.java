package Test;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
//		System.out.println("����);
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("�̸���"+name+"�Դϴ�.");
		String city=sc.next();
		System.out.println("���ô�"+city+"�Դϴ�.");
		int age=sc.nextInt();
		System.out.println("���̴�"+age+"���Դϴ�.");
		double weught=sc.nextDouble();
		System.out.println("ü����"+weught+"KG");
		boolean single=sc.nextBoolean();
		System.out.println("����"+single);
		
		int a=3;
		int b=3;
		int c=3;
		int d=3;
		
		a=d++;
		System.out.println(a);
		
	}

}
