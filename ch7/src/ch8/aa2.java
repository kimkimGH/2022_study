package ch8;
class car2{
	String color;
	String door;
	void drive() {System.out.println("drive");}
	void stop() {System.out.println("stop!!!");}
}
class FireEngine2 extends car2{
	void water() {System.out.println("water~~");}
}
public class aa2 {

	public static void main(String[] args) {
		car2 c=null;
		FireEngine2 f=new FireEngine2();
		FireEngine2 f2=null;
		f.water();
		c=f;//��ɰ����Ҷ� (car)��������
//		c.water(); carŬ������ ���� ����� ����Ҽ� ����
		f2=(FireEngine2)c;//����� �����Ҷ�(FireEngine2)���� �Ұ���
		f2.water(); //���������� ���Ƽ� ��밡��
	}

}
