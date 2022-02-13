package Test;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][]score=new int[n][n];
		int count=1;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n;k++){
				score[i][k]=count++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(score[i][j]+"");
			}
			System.out.println();
		}		
		}

	}


