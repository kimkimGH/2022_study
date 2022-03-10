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
            System.out.println("ID와password를 입력해주세요.");
            System.out.print("ID:");
            String id = sc.nextLine().trim(); //trim()빈칸없이 출력됨 nextLine()문자열출력

            System.out.print("pass:");
            String password = sc.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("입력하신ID는 존재하지 않습니다.다시입력해주세요");
                continue;
            }
            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다.다시 입력해주세요");
            } else {
                System.out.println("ID와pass가 일치합니다.");
                break;
            }


        }
    }
}
