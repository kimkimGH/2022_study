package ch8;
class car{
	private String color; //private 
	private String door;  //private 
	void drive() {System.out.println("drive~~~");}
	void stop() {System.out.println("stop!!!");}
}
class FireEngine extends car{
	void water() {System.out.println("water~~~");}
}
class Amb extends car{
	void go() {System.out.println("go~~");}
}
public class aa1 {

	public static void main(String[] args) {
		FireEngine f=new FireEngine();
		car c=f; // �ν��Ͻ��� �����Ҷ�(car)��������
		FireEngine f1=(FireEngine)c; //�ν��Ͻ��� �����Ҷ�(FireEngine)�����Ұ���
		//			Amb a=(FireEngine)f; ��Ӱ��谡 �ƴ� Ŭ���� ���� ����ȯ�� �Ұ���
	}

}
