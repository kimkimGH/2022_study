package ch10;
import java.util.HashMap;
import java.util.Scanner;

public class HashTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234"); //key,value
        map.put("abcd", "1111");
        map.put("asdf", "1234");
        System.out.println(map);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ID��password�� �Է����ּ���.");
            System.out.print("ID:");
            String id = sc.nextLine().trim(); //trim()��ĭ���� ��µ� nextLine()���ڿ����

            System.out.print("pass:");
            String password = sc.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("�Է��Ͻ�ID�� �������� �ʽ��ϴ�.�ٽ��Է����ּ���");
                continue;
            }
            if (!(map.get(id)).equals(password)) {
                System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.�ٽ� �Է����ּ���");
            } else {
                System.out.println("ID��pass�� ��ġ�մϴ�.");
                break;
            }


        }
    }
}
