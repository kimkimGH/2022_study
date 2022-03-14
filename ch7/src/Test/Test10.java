package Test;

public class Test10 {

	public static void main(String[] args) {
		int[] score={87,56,48,35,98,12,78,23,2,32,10};
        int max=score[0];
        int min=score[0];

        for(int i=1;i< score.length;i++){
            if(max<score[i]){
                max=score[i];
            }
            else if(min>score[i]){
                min=score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
	}

}
