package ch8;
//인터페이스
interface playingcard{
	public static final int spade=4; 
	final int diamond=3;// public static final int diamond=3; //public static final생략가능
	 static final int heart=2;// public static final int heart=2;
	int clover=1;// public static final int clover=1;
	public abstract String getcardnumer();
	String getcardkind();//public abstract String getcardkind(); public,abstract생략가능
}
public class aa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
