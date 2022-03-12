package Test;

public class Arraygugudan {

	public static void main(String[] args) {
		int[][] dan={{2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9}};

   for(int i=0;i<8;i++){
       for(int k=0;k<9;k++){
           System.out.printf("%d*%d=%d%n",dan[0][i],dan[1][k],dan[0][i]*dan[1][k]);
       }
   }

	}

}
