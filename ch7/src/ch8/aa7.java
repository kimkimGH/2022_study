package ch8;
	//�߻�Ŭ����(abstract class)
abstract class player{//�߻� Ŭ����(�̿ϼ�Ŭ����)
	abstract void play(int pos);//�߻�ż���
	abstract void stop();//�߻�ż���({}������ �ż���,�����ξ���)
}
class MyAudio extends player{
	void play(int pos) {System.out.println("paly");}
	void stop() {System.out.println("stop");}
}
public class aa7 {

	public static void main(String[] args) {
		//player p=new player(); �̿ϼ�Ŭ������ ��ü�����Ұ���
		player p=new MyAudio();//������ /������ Ÿ�Կ��� ����θ� �������
		MyAudio a=new MyAudio();
		a.play(100);
		a.stop();
		p.play(50);
		p.stop();
	}

}
