package ch9;
class out{
	private int outiv=10;
	static int outcv=20;
	
	class instanceinner{
		int iiv=outiv;
		static int ccv=outcv;
	}
	
	static class staticinner{
//		int siv=outiv; 인스턴스멤버라서 접근불가능
		int scv=outcv;
		static int sscv=50;
	}
	void mymethod() {
		final int iv=0;	//변수가 아닌 상수취급
		int lv=0;	//final생략가능
		class Localinner{
			int liv=outiv;
			int liv2=outcv;
			int liv3=lv;
			int liv4=lv;
		}
	}
	
}
public class outer {

	public static void main(String[] args) {
		out o=new out();
		out.instanceinner i=o.new instanceinner();
		System.out.println(i.iiv);
		System.out.println(out.staticinner.sscv); //객체생성없이 바로사용가능
		out.staticinner s=new out.staticinner();
		System.out.println(s.scv);
	}

}
