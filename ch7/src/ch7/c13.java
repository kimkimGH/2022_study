package ch7;
//������
class Tv1111{
boolean power;
int channel;

void power() {power=!power;}
void channelup() {channel++;}
void channelDown() {channel--;}
}
class SmartTv1111 extends Tv1111{
String Text;
void caption() {}
}
public class c13 {

public static void main(String[] args) {
	//Tv1111 t1=SmartTv1111();
	//Tv1111 t=new SmartTv1111(); //����Ÿ������ ������ �ڼ�Ÿ�԰�ü�� �ٷ�°�(������)���
			//SmartTv1111 v=new Tv1111(); ���� ���ȵ� 
//		SmartTv s=new SmartTv(); //���������� �ν��Ͻ��� Ÿ����ġ (����)
//		Tv1111 t=new SmartTv1111(); //����Ÿ������������ �ڼ�Ÿ���ν��Ͻ����� (����)
}

}
