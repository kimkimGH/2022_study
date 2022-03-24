package Test;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
//		System.out.println("실행);
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("이름은"+name+"입니다.");
		String city=sc.next();
		System.out.println("도시는"+city+"입니다.");
		int age=sc.nextInt();
		System.out.println("나이는"+age+"살입니다.");
		double weught=sc.nextDouble();
		System.out.println("체중은"+weught+"KG");
		boolean single=sc.nextBoolean();
		System.out.println("독신"+single);
		
		int a=3;
		int b=3;
		int c=3;
		int d=3;
		
		a=d++;
		System.out.println(a);
		
	}

}
