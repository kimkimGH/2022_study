package study;
import java.util.*;
public class q2 {
	//Arrays로 배열 다루기
	public static void main(String[] args) {
		int[] score= {11,55,25,58,96};
		int[][] score1= {
				{25,56},
				{57,92}
		};
		System.out.println(Arrays.toString(score)); //tostring 한가지 배열일때 사용
		System.out.println(Arrays.deepToString(score1)); //deepToString 2차월배열일때 사용
		//Arrays.toString 숫자배열을 나열할때사용
		System.out.println();
		
		String[][] str= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str1= {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str,str1));//2차원문자배열 비교할땐 Arrays.deepEquals사용
		
		System.out.println();
		
		String[] s= {"qqq","www","eee"};
		String[] s1= {"qqq","www","eee"};
		System.out.println(Arrays.equals(s,s1));// 배열일땐 Arrays.equals 사용
		System.out.println();
		int[] arr= {0,1,2,3,4,5};

		int[] arr1=Arrays.copyOf(arr,3); //Arrays.copyOf(arr,3) arr을 카피해서 3까지의 수를 나타낸다 copy는 index 0을 무시하고 1부터시작
		int[] arr2=Arrays.copyOf(arr,arr.length); //Arrays.copyOf(arr.arr.length) arr을 카피해서 arr.length만큼 나타낸다
		int[] arr3=Arrays.copyOf(arr,7); //(arr,7) arr카피해서 7까지나타낸다 숫자가 없는경우 0으로 표기한다. 
		int[] arr4=Arrays.copyOfRange(arr,2,4); //(arr,2,4) arr카피후 2부터3까지 수를 나타낸다 4는 포함하지 않는다, range는 index는 0부터
		int[] arr5=Arrays.copyOfRange(arr,2,8); //(arr,2,8) arr카피후 2부터7까지 수를 나타낸다 8은 포함하지 않고 나머지는 0으로 표기
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		System.out.println();
		
		int[] qq= {2,1,5,4,3,0};
		Arrays.sort(qq); //벼열을 순서대로 정리한다
		System.out.println(Arrays.toString(qq));

	}


}