package Test;
//호출 계산기
import java.util.Scanner;
class score{
	int add(int x,int y){return x+y;}
	int sub(int x,int y) {return x-y;}	
	int mult(int x,int y) {return x*y;}	
	int divi(int x,int y) {return x/y;}	
}	
public class Test1 {
	public static void main(String[] args) {
		while(true) {
			score f=new score(); 
			Scanner sc=new Scanner(System.in);
			System.out.println("0.종료 1.더하기 2.빼기 3.곱하기 4.나누기");
			System.out.print("메뉴선택:");
			int num1=sc.nextInt();
			if(num1==0) {System.out.println("시스템종료"); break;}
			else if(num1>5) {System.out.println("잘못입력했다."); continue;}
			System.out.print("숫자입력:");
			int x=sc.nextInt();
			System.out.print("숫자입력:");
			int y=sc.nextInt();
			if(num1==1) {System.out.println(f.add(x, y));}
			else if(num1==2) {System.out.println(f.sub(x, y));}
			else if(num1==3) {System.out.println(f.mult(x, y));}
			else if(num1==4) {System.out.println(f.divi(x, y));}
			else if(num1==0) {System.out.println("시스템종료"); break;}
			else if(num1>5) {System.out.println("잘못입력했다."); continue;}
		}
	}
}

