package ch9;
class out{
	private int outiv=10;
	static int outcv=20;
	
	class instanceinner{
		int iiv=outiv;
		static int ccv=outcv;
	}
	
	static class staticinner{
//		int siv=outiv; �ν��Ͻ������ ���ٺҰ���
		int scv=outcv;
		static int sscv=50;
	}
	void mymethod() {
		final int iv=0;	//������ �ƴ� ������
		int lv=0;	//final��������
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
		System.out.println(out.staticinner.sscv); //��ü�������� �ٷλ�밡��
		out.staticinner s=new out.staticinner();
		System.out.println(s.scv);
	}

}
